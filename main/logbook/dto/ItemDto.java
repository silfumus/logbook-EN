package logbook.dto;

import javax.json.JsonObject;

import logbook.internal.ItemTranslated;
import logbook.internal.ItemType;

/**
 * 装備を表します
 *
 */
public final class ItemDto extends AbstractDto {

    private int id;
    private int type2;
    private int type3;
    private int atap;
    private int bakk;
    private int baku;
    private int houg;
    private int houk;
    private int houm;
    private int leng;
    private int luck;
    private String name;
    private int raig;
    private int raik;
    private int raim;
    private int rare;
    private int sakb;
    private int saku;
    private int soku;
    private int souk;
    private int taik;
    private int tais;
    private int tyku;

    /**
     * コンストラクター
     */
    public ItemDto() {
    }

    /**
     * コンストラクター
     * 
     * @param object JSON Object
     */
    public ItemDto(JsonObject object) {

        this.type2 = object.getJsonArray("api_type").getInt(2);
        this.type3 = object.getJsonArray("api_type").getInt(3);

        this.atap = object.getJsonNumber("api_atap").intValue();
        this.bakk = object.getJsonNumber("api_bakk").intValue();
        this.baku = object.getJsonNumber("api_baku").intValue();
        this.houg = object.getJsonNumber("api_houg").intValue();
        this.houk = object.getJsonNumber("api_houk").intValue();
        this.houm = object.getJsonNumber("api_houm").intValue();
        this.id = object.getJsonNumber("api_id").intValue();
        this.leng = object.getJsonNumber("api_leng").intValue();
        this.luck = object.getJsonNumber("api_luck").intValue();
        this.name = object.getString("api_name");
        this.raig = object.getJsonNumber("api_raig").intValue();
        this.raik = object.getJsonNumber("api_raik").intValue();
        this.raim = object.getJsonNumber("api_raim").intValue();
        this.rare = object.getJsonNumber("api_rare").intValue();
        this.sakb = object.getJsonNumber("api_sakb").intValue();
        this.saku = object.getJsonNumber("api_saku").intValue();
        this.soku = object.getJsonNumber("api_soku").intValue();
        this.souk = object.getJsonNumber("api_souk").intValue();
        this.taik = object.getJsonNumber("api_taik").intValue();
        this.tais = object.getJsonNumber("api_tais").intValue();
        this.tyku = object.getJsonNumber("api_tyku").intValue();
    }

    /**
     * コンストラクター
     * 
     * @param id
     * @param type2
     * @param type3
     * @param atap
     * @param bakk
     * @param baku
     * @param houg
     * @param houk
     * @param houm
     * @param leng
     * @param luck
     * @param name
     * @param raig
     * @param raik
     * @param raim
     * @param rare
     * @param sakb
     * @param saku
     * @param soku
     * @param souk
     * @param taik
     * @param tais
     * @param tyku
     */
    public ItemDto(int id, int type2, int type3, int atap, int bakk, int baku, int houg, int houk, int houm,
            int leng, int luck, String name, int raig, int raik, int raim, int rare, int sakb, int saku,
            int soku, int souk, int taik, int tais, int tyku) {
        this.id = id;
        this.type2 = type2;
        this.type3 = type3;
        this.atap = atap;
        this.bakk = bakk;
        this.baku = baku;
        this.houg = houg;
        this.houk = houk;
        this.houm = houm;
        this.leng = leng;
        this.luck = luck;
        this.name = name;
        this.raig = raig;
        this.raik = raik;
        this.raim = raim;
        this.rare = rare;
        this.sakb = sakb;
        this.saku = saku;
        this.soku = soku;
        this.souk = souk;
        this.taik = taik;
        this.tais = tais;
        this.tyku = tyku;
    }

    /**
     * @return type
     */
    public String getType() {
        return ItemType.get(this.type3);
    }

    /**
     * @return type2
     */
    public String getTypeId2() {
        return Long.toString(this.type2);
    }

    /**
     * @return type3
     */
    public String getTypeId3() {
        return Long.toString(this.type3);
    }

    /**
     * type2を取得します。
     * @return type2
     */
    public int getType2() {
        return this.type2;
    }

    /**
     * type2を設定します。
     * @param type2 type2
     */
    public void setType2(int type2) {
        this.type2 = type2;
    }

    /**
     * type3を設定します。
     * @param type3 type3
     */
    public void setType3(int type3) {
        this.type3 = type3;
    }

    /**
     * type3を取得します。
     * @return type3
     */
    public int getType3() {
        return this.type3;
    }

    /**
     * atapを取得します。
     * @return atap
     */
    public int getAtap() {
        return this.atap;
    }

    /**
     * atapを設定します。
     * @param atap atap
     */
    public void setAtap(int atap) {
        this.atap = atap;
    }

    /**
     * bakkを取得します。
     * @return bakk
     */
    public int getBakk() {
        return this.bakk;
    }

    /**
     * bakkを設定します。
     * @param bakk bakk
     */
    public void setBakk(int bakk) {
        this.bakk = bakk;
    }

    /**
     * bakuを取得します。
     * @return baku
     */
    public int getBaku() {
        return this.baku;
    }

    /**
     * bakuを設定します。
     * @param baku baku
     */
    public void setBaku(int baku) {
        this.baku = baku;
    }

    /**
     * hougを取得します。
     * @return houg
     */
    public int getHoug() {
        return this.houg;
    }

    /**
     * hougを設定します。
     * @param houg houg
     */
    public void setHoug(int houg) {
        this.houg = houg;
    }

    /**
     * houkを取得します。
     * @return houk
     */
    public int getHouk() {
        return this.houk;
    }

    /**
     * houkを設定します。
     * @param houk houk
     */
    public void setHouk(int houk) {
        this.houk = houk;
    }

    /**
     * houmを取得します。
     * @return houm
     */
    public int getHoum() {
        return this.houm;
    }

    /**
     * houmを設定します。
     * @param houm houm
     */
    public void setHoum(int houm) {
        this.houm = houm;
    }

    /**
     * idを取得します。
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * idを設定します。
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * lengを取得します。
     * @return leng
     */
    public int getLeng() {
        return this.leng;
    }

    /**
     * lengを設定します。
     * @param leng leng
     */
    public void setLeng(int leng) {
        this.leng = leng;
    }

    /**
     * luckを取得します。
     * @return luck
     */
    public int getLuck() {
        return this.luck;
    }

    /**
     * luckを設定します。
     * @param luck luck
     */
    public void setLuck(int luck) {
        this.luck = luck;
    }

    /**
     * nameを取得します。
     * @return name
     */
    public String getName() {
        return ItemTranslated.get(this.name);
    }

    /**
     * @return English name
     */
    public String getTranslated() {
        return ItemTranslated.get(this.name);
    }

    /**
     * nameを設定します。
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * raigを取得します。
     * @return raig
     */
    public int getRaig() {
        return this.raig;
    }

    /**
     * raigを設定します。
     * @param raig raig
     */
    public void setRaig(int raig) {
        this.raig = raig;
    }

    /**
     * raikを取得します。
     * @return raik
     */
    public int getRaik() {
        return this.raik;
    }

    /**
     * raikを設定します。
     * @param raik raik
     */
    public void setRaik(int raik) {
        this.raik = raik;
    }

    /**
     * raimを取得します。
     * @return raim
     */
    public int getRaim() {
        return this.raim;
    }

    /**
     * raimを設定します。
     * @param raim raim
     */
    public void setRaim(int raim) {
        this.raim = raim;
    }

    /**
     * rareを取得します。
     * @return rare
     */
    public int getRare() {
        return this.rare;
    }

    /**
     * rareを設定します。
     * @param rare rare
     */
    public void setRare(int rare) {
        this.rare = rare;
    }

    /**
     * sakbを取得します。
     * @return sakb
     */
    public int getSakb() {
        return this.sakb;
    }

    /**
     * sakbを設定します。
     * @param sakb sakb
     */
    public void setSakb(int sakb) {
        this.sakb = sakb;
    }

    /**
     * sakuを取得します。
     * @return saku
     */
    public int getSaku() {
        return this.saku;
    }

    /**
     * sakuを設定します。
     * @param saku saku
     */
    public void setSaku(int saku) {
        this.saku = saku;
    }

    /**
     * sokuを取得します。
     * @return soku
     */
    public int getSoku() {
        return this.soku;
    }

    /**
     * sokuを設定します。
     * @param soku soku
     */
    public void setSoku(int soku) {
        this.soku = soku;
    }

    /**
     * soukを取得します。
     * @return souk
     */
    public int getSouk() {
        return this.souk;
    }

    /**
     * soukを設定します。
     * @param souk souk
     */
    public void setSouk(int souk) {
        this.souk = souk;
    }

    /**
     * taikを取得します。
     * @return taik
     */
    public int getTaik() {
        return this.taik;
    }

    /**
     * taikを設定します。
     * @param taik taik
     */
    public void setTaik(int taik) {
        this.taik = taik;
    }

    /**
     * taisを取得します。
     * @return tais
     */
    public int getTais() {
        return this.tais;
    }

    /**
     * taisを設定します。
     * @param tais tais
     */
    public void setTais(int tais) {
        this.tais = tais;
    }

    /**
     * tykuを取得します。
     * @return tyku
     */
    public int getTyku() {
        return this.tyku;
    }

    /**
     * tykuを設定します。
     * @param tyku tyku
     */
    public void setTyku(int tyku) {
        this.tyku = tyku;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof ItemDto)) {
            return this.name.equals(((ItemDto) obj).getName());
        }
        return false;
    }
}
