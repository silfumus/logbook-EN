package logbook.config;

import java.io.IOException;

import logbook.config.bean.AppConfigBean;
import logbook.constants.AppConstants;
import logbook.util.BeanUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * アプリケーション設定を保存・復元します
 * 
 */
public class AppConfig {
    /** ロガー */
    private static final Logger LOG = LogManager.getLogger(AppConfig.class);

    /** アプリケーション設定 */
    private static AppConfigBean configBean;

    /**
     * 設定ファイルに書き込みます
     */
    public static void store() throws IOException {
        if (configBean == null) {
            configBean = new AppConfigBean();
        }
        BeanUtils.writeObject(AppConstants.APP_CONFIG_FILE, configBean);
    }

    /**
     * アプリケーション設定を読み込みます
     */
    public static void load() {
        try {
            AppConfigBean bean = BeanUtils.readObject(AppConstants.APP_CONFIG_FILE, AppConfigBean.class);
            if (bean != null) {
                configBean = bean;
            } else {
                configBean = new AppConfigBean();
            }
        } catch (Exception e) {
            LOG.warn("アプリケーション設定を読み込みますに失敗しました", e);
        }
    }

    /**
     * アプリケーション設定を取得します
     * 
     * @return アプリケーション設定
     */
    public static AppConfigBean get() {
        return configBean;
    }
}
