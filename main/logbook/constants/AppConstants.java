package logbook.constants;

import java.io.File;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.TimeZone;

import org.eclipse.swt.graphics.RGB;

/**
 * アプリケーションで使用する共通の定数クラス
 *
 */
public class AppConstants {

    /**　アプリケーション名 */
    public static final String NAME = "logbook";

    /** バージョン */
    public static final String VERSION = "0.7.5";

    /** ホームページ */
    public static final URI HOME_PAGE_URI = URI.create("https://kancolle.sanaechan.net/");

    /** アップデートチェック先 */
    public static final URI UPDATE_CHECK_URI = URI
            .create("https://raw.githubusercontent.com/silfumus/logbook-EN/master/checkversion.txt");

    /** Quest Translation Source */
    public static final URI QUEST_TRANSLATION_URI = URI
            .create("https://raw.githubusercontent.com/silfumus/logbook-EN/master/data/quest.csv");

    /** Item Translation Source */
    public static final URI ITEM_TRANSLATION_URI = URI
            .create("https://raw.githubusercontent.com/silfumus/logbook-EN/master/data/item.csv");

    /** Hull Type Source */
    public static final URI SHIPSTYLE_TRANSLATION_URI = URI
            .create("https://raw.githubusercontent.com/silfumus/logbook-EN/master/data/shipstyle.csv");

    /** Expedition Translation Source */
    public static final URI EXPEDITION_TRANSLATION_URI = URI
            .create("https://raw.githubusercontent.com/silfumus/logbook-EN/master/data/expedition.csv");

    /** World Map Translation Source */
    public static final URI MAPNAME_TRANSLATION_URI = URI
            .create("https://raw.githubusercontent.com/silfumus/logbook-EN/master/data/map.csv");

    /** GitHub Translation */
    public static final URI GITHUB_PAGE_URI = URI.create("https://github.com/silfumus/logbook-EN");

    /** 日付書式 */
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /** 日付書式(時刻のみ) */
    public static final String DATE_SHORT_FORMAT = "HH:mm:ss";

    /** 日付書式(日付のみ) */
    public static final String DATE_DAYS_FORMAT = "yyyy-MM-dd";

    /** 日付書式(ミリ秒を含む) */
    public static final String DATE_LONG_FORMAT = "yyyy-MM-dd HH-mm-ss.SSS";

    /** タイムゾーン(任務が更新される05:00JSTに0:00になるタイムゾーン) */
    public static final TimeZone TIME_ZONE_MISSION = TimeZone.getTimeZone("GMT+04:00");

    /** 疲労赤色 */
    public static final int COND_RED = 19;

    /** 疲労オレンジ色 */
    public static final int COND_ORANGE = 29;

    /** 疲労緑色 */
    public static final int COND_GREEN = 50;

    /** 遠征色 */
    public static final RGB MISSION_COLOR = new RGB(102, 51, 255);

    /** 入渠色 */
    public static final RGB NDOCK_COLOR = new RGB(0, 102, 153);

    /** 疲労赤色 */
    public static final RGB COND_RED_COLOR = new RGB(255, 16, 0);

    /** 疲労オレンジ色 */
    public static final RGB COND_ORANGE_COLOR = new RGB(255, 140, 0);

    /** 疲労緑色 */
    public static final RGB COND_GREEN_COLOR = new RGB(0, 128, 0);

    /** 5分前 */
    public static final RGB TIME_IN_5_MIN = new RGB(255, 215, 0);

    /** 10分前 */
    public static final RGB TIME_IN_10_MIN = new RGB(255, 239, 153);

    /** 20分前 */
    public static final RGB TIME_IN_20_MIN = new RGB(255, 247, 203);

    /** テーブル行(偶数行)背景色 */
    public static final RGB ROW_BACKGROUND = new RGB(246, 246, 246);

    /** 小破(75%) */
    public static final float SLIGHT_DAMAGE = 0.75f;

    /** 中破(50%) */
    public static final float HALF_DAMAGE = 0.5f;

    /** 大破(25%) */
    public static final float BADLY_DAMAGE = 0.25f;

    /** 補給(少) */
    public static final float LOW_SUPPLY = 0.77f;

    /** 補給(空) */
    public static final float EMPTY_SUPPLY = 0.33f;

    /** 文字コード(Shift_JIS) */
    public static final Charset CHARSET = Charset.forName("UTF-8");

    /** アプリケーション設定ファイル  */
    public static final File APP_CONFIG_FILE = new File("./config/internal.xml");

    /** 艦娘設定ファイル  */
    public static final File SHIP_CONFIG_FILE = new File("./config/ship.xml");

    /** 装備一覧設定ファイル  */
    public static final File ITEM_CONFIG_FILE = new File("./config/item.xml");

    /** 装備マスター設定ファイル  */
    public static final File ITEM_MST_CONFIG_FILE = new File("./config/itemmst.xml");

    /** 建造ドック設定ファイル  */
    public static final File KDOCK_CONFIG_FILE = new File("./config/kdock.xml");

    /** 所有艦娘グループ設定ファイル  */
    public static final File GROUP_CONFIG_FILE = new File("./config/group.xml");

    /** Quest Translation File  */
    public static final File QUEST_TRANSLATION_FILE = new File("./data/quest.csv");

    /** Item Translation File  */
    public static final File ITEM_TRANSLATION_FILE = new File("./data/item.csv");

    /** Hull Classification Translation File  */
    public static final File SHIPSTYLE_TRANSLATION_FILE = new File("./data/shipstyle.csv");

    /** Hull Classification Translation File  */
    public static final File EXPEDITION_TRANSLATION_FILE = new File("./data/expedition.csv");

    /** World Map Translation File  */
    public static final File MAPNAME_TRANSLATION_FILE = new File("./data/map.csv");

    /** 保有資材:燃料 */
    public static final int MATERIAL_FUEL = 1;

    /** 保有資材:弾薬 */
    public static final int MATERIAL_AMMO = 2;

    /** 保有資材:鋼材 */
    public static final int MATERIAL_METAL = 3;

    /** 保有資材:ボーキサイト */
    public static final int MATERIAL_BAUXITE = 4;

    /** 保有資材:バーナー */
    public static final int MATERIAL_BURNER = 5;

    /** 保有資材:高速修復材 */
    public static final int MATERIAL_BUCKET = 6;

    /** 保有資材:開発資材 */
    public static final int MATERIAL_RESEARCH = 7;

    /** 報告書のオンメモリ記憶数 */
    public static final int MAX_LOG_SIZE = 50;

    /** /resources/icon/add.png */
    public static final String R_ICON_ADD = "/resources/icon/add.png";

    /** /resources/icon/delete.png */
    public static final String R_ICON_DELETE = "/resources/icon/delete.png";

    /** /resources/icon/error.png */
    public static final String R_ICON_ERROR = "/resources/icon/error.png";

    /** /resources/icon/exclamation.png */
    public static final String R_ICON_EXCLAMATION = "/resources/icon/exclamation.png";

    /** /resources/icon/folder_star.png */
    public static final String R_ICON_FOLDER_STAR = "/resources/icon/folder_star.png";

    /** /resources/icon/star.png */
    public static final String R_ICON_STAR = "/resources/icon/star.png";

    /** 艦隊タブの艦娘ラベルに設定するツールチップテキスト */
    public static final String TOOLTIP_FLEETTAB_SHIP = "HP:{0}/{1} Fuel:{2}/{3} Ammo:{4}/{5}\nNext:{6}exp";

    /** メッセージ 出撃できます。 */
    public static final String MESSAGE_GOOD = "Ready to sortie! ";

    /** メッセージ {0} 出撃はできません。 */
    public static final String MESSAGE_BAD = "{0} ";

    /** メッセージ 大破している艦娘がいます  */
    public static final String MESSAGE_BADLY_DAMAGE = "There are severely damaged ships. ";

    /** メッセージ 入渠中の艦娘がいます  */
    public static final String MESSAGE_BATHWATER = "Ships are being repaired. ";

    /** メッセージ 遠征中です。  */
    public static final String MESSAGE_MISSION = "On an expedition. ";

    /** メッセージ 疲労している艦娘がいます */
    public static final String MESSAGE_COND = "\nMorale will be fully recovered at {0}. ";

    /** メッセージ 大破している艦娘がいます */
    public static final String MESSAGE_STOP_SORTIE = "There are severely damaged ships. Stop the sortie! ";

    /** メッセージ  索敵値計:{0} */
    public static final String MESSAGE_SAKUTEKI = "\nEffective LoS: {0} ";

    /** メッセージ 制空値:{0} */
    public static final String MESSAGE_SEIKU = "\nAir Superiority: {0}";

    /** メッセージ  艦隊合計Lv:{0} */
    public static final String MESSAGE_TOTAL_LV = "\nTotal Level: {0}";

    /** 海戦・ドロップ報告書.csv */
    public static final String LOG_BATTLE_RESULT = "Drop Log.csv";

    /** 海戦・ドロップ報告書_alternativefile.csv */
    public static final String LOG_BATTLE_RESULT_ALT = "Drop Log2.csv";

    /** 建造報告書.csv */
    public static final String LOG_CREATE_SHIP = "Build Log.csv";

    /** 建造報告書_alternativefile.csv */
    public static final String LOG_CREATE_SHIP_ALT = "Build Log2.csv";

    /** 開発報告書.csv */
    public static final String LOG_CREATE_ITEM = "Craft Log.csv";

    /** 開発報告書_alternativefile.csv */
    public static final String LOG_CREATE_ITEM_ALT = "Craft Log2.csv";

    /** 遠征報告書.csv */
    public static final String LOG_MISSION = "Expedition Log.csv";

    /** 遠征報告書.csv */
    public static final String LOG_MISSION_ALT = "Expedition Log2.csv";

    /** 資材ログ.csv */
    public static final String LOG_RESOURCE = "Material Log.csv";

    /** 資材ログ_alternativefile.csv */
    public static final String LOG_RESOURCE_ALT = "Material Log2.csv";
}
