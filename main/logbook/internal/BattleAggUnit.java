package logbook.internal;

/**
 * 出撃統計の単位
 */
public enum BattleAggUnit {
    /** デイリー */
    DAILY("Daily"),

    /** ウィークリー */
    WEEKLY("Weekly"),

    /** マンスリー */
    MONTHLY("Monthly"),

    /** 先週 */
    LAST_WEEK("Last Week"),

    /** 先月 */
    LAST_MONTH("Last Month");

    /** 名前 */
    private String name;

    /**
     * コンストラクター 
     */
    private BattleAggUnit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
