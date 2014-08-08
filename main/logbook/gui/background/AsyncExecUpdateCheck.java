package logbook.gui.background;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;

import logbook.constants.AppConstants;
import logbook.data.context.GlobalContext;
import logbook.internal.TranslationDto;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

/**
 * アップデートチェックを行います
 *
 */
public final class AsyncExecUpdateCheck extends Thread {

    private static final Logger LOG = LogManager.getLogger(AsyncExecUpdateCheck.class);

    private final Shell shell;

    /**
     * コンストラクター
     * 
     * @param shell
     */
    public AsyncExecUpdateCheck(Shell shell) {
        this.shell = shell;
        this.setName("logbook_async_exec_update_check");
    }

    @Override
    public void run() {
        try {
            String[] versions = IOUtils.toString(AppConstants.UPDATE_CHECK_URI).split(";");
            final String latestlogbook = versions[0];
            final String latestquest = versions[1];
            final String latestitem = versions[2];
            final String latestshipstyle = versions[3];
            final String latestexpname = versions[4];
            final String latestmap = versions[5];
            final String currentquest = TranslationDto.getVersion(AppConstants.QUEST_TRANSLATION_FILE);
            final String currentitem = TranslationDto.getVersion(AppConstants.ITEM_TRANSLATION_FILE);
            final String currentshipstyle = TranslationDto.getVersion(AppConstants.SHIPSTYLE_TRANSLATION_FILE);
            final String currentexpname = TranslationDto.getVersion(AppConstants.EXPEDITION_TRANSLATION_FILE);
            final String currentmap = TranslationDto.getVersion(AppConstants.MAPNAME_TRANSLATION_FILE);

            final boolean logbookupdate = !AppConstants.VERSION.equals(latestlogbook);
            final boolean questupdate = !currentquest.equals(latestquest);
            final boolean itemupdate = !currentitem.equals(latestitem);
            final boolean shipstyleupdate = !currentshipstyle.equals(latestshipstyle);
            final boolean expnameupdate = !currentexpname.equals(latestexpname);
            final boolean mapupdate = !currentmap.equals(latestmap);

            if (logbookupdate || questupdate || itemupdate || shipstyleupdate || expnameupdate || mapupdate) {
                Display.getDefault().asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        Shell shell = AsyncExecUpdateCheck.this.shell;

                        if (shell.isDisposed()) {
                            // ウインドウが閉じられていたらなにもしない
                            return;
                        }

                        StringBuilder versionmessage = new StringBuilder();
                        if (logbookupdate) {
                            versionmessage.append("Latest logbook: " + latestlogbook + "\r\n");
                        }
                        if (questupdate) {
                            versionmessage.append("Latest definition: " + latestquest + " (Quest)\r\n");
                        }
                        if (itemupdate) {
                            versionmessage.append("Latest definition: " + latestitem + " (Equipment)\r\n");
                        }
                        if (shipstyleupdate) {
                            versionmessage.append("Latest definition: " + latestshipstyle + " (Hull Types)\r\n");
                        }
                        if (expnameupdate) {
                            versionmessage.append("Latest definition: " + latestexpname + " (Expedition)\r\n");
                        }
                        if (mapupdate) {
                            versionmessage.append("Latest definition: " + latestmap + " (Map)\r\n");
                        }
                        String messagecontent = versionmessage.toString();

                        MessageBox box = new MessageBox(shell, SWT.YES | SWT.NO
                                | SWT.ICON_QUESTION);
                        box.setText("Update");
                        box.setMessage("There is a new version available. Update?\r\n"
                                + messagecontent
                                + "※You can turn off this notification in the Settings menu");

                        // OKを押されたらホームページへ移動する
                        if (box.open() == SWT.YES) {
                            if (questupdate) {
                                try {
                                    URL questURL = AppConstants.QUEST_TRANSLATION_URI.toURL();
                                    FileUtils.copyURLToFile(questURL, AppConstants.QUEST_TRANSLATION_FILE);
                                    GlobalContext.addConsole("Quest file has been updated to: " + latestquest);
                                } catch (IOException e) {
                                    LOG.warn("Failed to update quest file", e);
                                }
                            }
                            if (itemupdate) {
                                try {
                                    URL itemURL = AppConstants.ITEM_TRANSLATION_URI.toURL();
                                    FileUtils.copyURLToFile(itemURL, AppConstants.ITEM_TRANSLATION_FILE);
                                    GlobalContext.addConsole("Equipment file has been updated to: " + latestitem);
                                } catch (IOException e) {
                                    LOG.warn("Failed to update item file", e);
                                }
                            }
                            if (shipstyleupdate) {
                                try {
                                    URL shipstyleURL = AppConstants.SHIPSTYLE_TRANSLATION_URI.toURL();
                                    FileUtils.copyURLToFile(shipstyleURL, AppConstants.SHIPSTYLE_TRANSLATION_FILE);
                                    GlobalContext.addConsole("Hull types file has been updated to: " + latestshipstyle);
                                } catch (IOException e) {
                                    LOG.warn("Failed to update hull types file", e);
                                }
                            }
                            if (expnameupdate) {
                                try {
                                    URL itemURL = AppConstants.EXPEDITION_TRANSLATION_URI.toURL();
                                    FileUtils.copyURLToFile(itemURL, AppConstants.EXPEDITION_TRANSLATION_FILE);
                                    GlobalContext.addConsole("Expedition file has been updated to: " + latestexpname);
                                } catch (IOException e) {
                                    LOG.warn("Failed to update expedition file", e);
                                }
                            }
                            if (mapupdate) {
                                try {
                                    URL mapURL = AppConstants.MAPNAME_TRANSLATION_URI.toURL();
                                    FileUtils.copyURLToFile(mapURL, AppConstants.MAPNAME_TRANSLATION_FILE);
                                    GlobalContext.addConsole("Map file has been updated to: " + latestmap);
                                } catch (IOException e) {
                                    LOG.warn("Failed to update map file", e);
                                }
                            }
                            if (logbookupdate) {
                                try {
                                    Desktop.getDesktop().browse(AppConstants.GITHUB_PAGE_URI);
                                } catch (Exception e) {
                                    LOG.warn("Failed to open the website", e);
                                }
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            // アップデートチェック失敗はクラス名のみ
            LOG.info(e.getClass().getName() + " failed to do an update check");
        }
    }
}
