package logbook.gui.listener;

import logbook.gui.QuestTable;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;

/**
 * Listener for Quest List
 *
 */
public final class QuestTableAdapter extends SelectionAdapter {

    /**
     * シェル
     */
    private final Shell shell;

    /**
     * コンストラクター
     */
    public QuestTableAdapter(Shell shell) {
        this.shell = shell;
    }

    @Override
    public void widgetSelected(SelectionEvent e) {
        new QuestTable(this.shell).open();
    }
}
