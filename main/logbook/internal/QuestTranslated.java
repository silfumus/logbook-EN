package logbook.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Quest
 *
 */
public final class QuestTranslated {

    /**
     * Quest title predefined value
     */
    private static final Map<String, String> QUESTTITLE = new ConcurrentHashMap<String, String>() {
        {
            this.put("中規模潜水艦隊を編成せよ！", "Form a Medium-Sized Submarine Fleet!"); //A27
            this.put("「第六戦隊」を編成せよ！", "Form the CruDiv 6!"); //A28
            this.put("「第5艦隊」を編成せよ！", "Form the 5th Fleet!"); //A29
            this.put("「第1水雷戦隊」を編成せよ！", "Form the Torpedo Squadron 1!"); //A30
            this.put("「第八駆逐隊」を編成せよ！", "Form the DesDiv 8!"); //A31
            this.put("「第十八駆逐隊」を編成せよ！", "Form the DesDiv 18!"); //A32
            this.put("「第三十駆逐隊(第一次)」を編成せよ！", "Form the DesRon 30 (1st Gen)!"); //A33
            this.put("「第三十駆逐隊(第二次)」を編成せよ！", "Form the DesRon 30 (2nd Gen)!"); //A34
            this.put("「第五戦隊」を編成せよ！", "Form the 5th Fleet!"); //A35
            this.put("新編「第二航空戦隊」を編成せよ！", "Form the 2nd CarDiv!"); //A36
            this.put("潜水艦隊「第六艦隊」を編成せよ！", "Form the 6th Fleet!"); //A37
            // B
            this.put("新編「第二航空戦隊」出撃せよ！", "Deploy the 2nd CarDiv"); //B25
            this.put("あ号作戦", "Weekly Sortie 1"); //Bw1
            // C
            this.put("はじめての「演習」！", "First Exercise!"); //C1
            this.put("「演習」で練度向上！", "Daily Exercises 1"); //C2
            this.put("「演習」で他提督を圧倒せよ！", "Daily Exercises 2"); //C3
            this.put("大規模演習", "Weekly Exercises"); //C4
            // D
            this.put("はじめての「遠征」！", "First Expedition"); //D1
            this.put("「遠征」を３回成功させよう！", "Daily Expeditions 1"); //D2
            this.put("「遠征」を１０回成功させよう！", "Daily Expeditions 2"); //D3
            this.put("大規模遠征作戦、発令！", "Weekly Expeditions"); //D4
            this.put("第一次潜水艦派遣作戦", "The First Submarine Operation"); //D5
            this.put("第二次潜水艦派遣作戦", "The Second Submarine Operation"); //D6
            this.put("潜水艦派遣作戦による技術入手の継続！", "Continuation of Submarine Operations"); //D7
            this.put("遠洋潜水艦作戦を実施せよ！", "Engage the Blue Waters Submarine Operation"); //D13
            this.put("遠洋潜水艦作戦の成果を拡大せよ！", "Extended Blue Waters Submarine Operation"); //D14
            // E
            this.put("はじめての「補給」！", "First Supply"); //E1
            this.put("はじめての「入渠」！", "First Docking"); //E2
            this.put("艦隊大整備！", "Daily Repairs"); //E3
            this.put("艦隊酒保祭り！", "Daily Resupplies"); //E4
            // F
            this.put("はじめての「建造」！", "First Construction");
            this.put("はじめての「開発」！", "First Development");
            this.put("はじめての「解体」！", "First Dismantlement");
            this.put("はじめての「廃棄」！", "First Disposal");
            this.put("新装備「開発」指令", "Daily Equipment Development 1");
            this.put("新造艦「建造」指令", "Daily Ship Construction 1");
            this.put("装備「開発」集中強化！", "Daily Development 2");
            this.put("艦娘「建造」艦隊強化！", "Daily Construction 2");
            this.put("軍縮条約対応！", "Daily Dismantlement");
            this.put("「大型艦建造」の準備！(その弐)", "Preparation for LCS (Part 2)");
            this.put("輸送用ドラム缶の準備", "Preparation for Transport Drum Canisters");
            this.put("資源の再利用", "Weekly Dismantlement");
            this.put("機種転換", "Bomber conversion"); //F13
            this.put("Sample", "Sample");
        }
    };

    /**
     * Quest detail predefined value
     */
    private static final Map<String, String> QUESTDETAIL = new ConcurrentHashMap<String, String>() {
        {
            this.put("2隻以上の艦で編成される「艦隊」を編成せよ！", "Have 2 ships in your main fleet."); //A1
            this.put("「睦月」「弥生」「卯月」「望月」4隻による第三十駆逐隊(第二次)を編成せよ！",
                    "Have only Mutsuki, Yayoi, Uzuki, and Mochizuki in your fleet."); //A34
            this.put("「妙高」「那智」「羽黒」を基幹とした第五戦隊を編成せよ！", "Have Myoukou, Nachi, and Haguro in your fleet."); //A35
            this.put("「飛龍改二」(※旗艦)及び「蒼龍」を基幹とした二航戦(要駆逐艦2隻)を編成せよ！",
                    "Have Hiryuu Kai2 (flagship), Souryuu, and 2 DD in your main fleet."); //A36
            this.put("「潜水母艦」と複数の潜水艦(4隻以上)からなる潜水艦隊「第六艦隊」を編成せよ！",
                    "Have a submarine tender (AS) and 4 SS in your main fleet."); //A37
            this.put("新型電探運用試験のため、第一艦隊の旗艦に「妙高改二」を配備せよ！", "Have Myoukou Kai2 as flagship in your main fleet."); //A38
            this.put("「蒼龍改二」（※旗艦）及び「飛龍改二」を旗艦とした二航戦（要駆逐艦2隻）を編成せよ！", "Have Souryuu Kai2 (flagship), Hiryuu Kai2, and 2 DD in your main fleet."); //A39
            //Sortie Quests - B
            this.put("航空戦艦2隻を基幹とする艦隊で、西方海域カスガダマ島の敵勢力を撃破せよ！", "Have 2 BBV ships in your main fleet and score a victory against World 4-4 boss."); //B23
            this.put("「第三十駆逐隊(第二次)」は直ちに抜錨！鎮守府正面の対潜哨戒を実施せよ！", "Deploy Mutsuki, Yayoi, Uzuki, and Mochizuki and encounter World 1-5 boss."); //B24
            this.put("新編「二航戦」を基幹とした艦隊で、珊瑚諸島沖に出撃、敵機動部隊を撃滅せよ！",
                    "Deploy a fleet with Hiryuu Kai2 (flagship), Souryuu, 2 DD, and 2 additional ships. Score S rating against World 5-2 boss."); //B25
            this.put("錬成を終え再編成「二航戦」を基幹とした艦隊で、敵リランカ島を空襲、破砕せよ！", "Deploy a fleet with Souryuu Kai2 (flagship), Hiryuu Kai2, 2 DD, and 2 additional ships. Score S rating against World 4-3 boss."); //B26
            this.put("艦隊を出撃させ、敵艦隊を捕捉、これを撃滅せよ！", "Defeat an enemy fleet."); //Bd1
            this.put("艦隊を出撃させ、敵艦隊「主力」を捕捉！これを撃滅せよ！", "Defeat the flagship of an enemy fleet."); //Bd2
            this.put("艦隊全力出撃！遊弋する敵艦隊を10回邀撃せよ！", "Defeat 10 enemy fleets."); //Bd3
            this.put("艦隊の脅威となる敵空母群。これを捕捉撃滅し、3隻轟沈せよ！", "Sink 3 enemy aircraft carriers."); //Bd4
            this.put("艦隊を出撃させ、敵補給艦を捕捉、これを撃滅せよ！", "Sink 3 enemy transport ships."); //Bd5
            this.put("敵の輸送船5隻以上を撃沈し、敵の補給路を寸断せよ！", "Sink 5 enemy transport ships."); //Bd6
            this.put("艦隊を南西諸島海域に全力出撃させ、多数の敵艦隊「主力」群を捕捉、撃滅せよ！", "Defeat 5 bosses in World 2."); //Bd7
            this.put("対潜能力の充実した艦隊で出撃、敵潜水艦狩りを実施せよ！", "Sink 6 enemy submarines."); //Bd8
            this.put("1週間の全力出撃を行い、可能な限り多くの敵艦隊を捕捉、これを迎撃せよ！",
                    "Deploy your fleet 36 times, encounter 24 bosses, defeat 12 bosses and get 6 Perfect S RATING victories."); //Bw1
            this.put("有力な母艦航空隊で1週間の全力出撃を行い、可能な限り多くの敵空母を撃滅せよ！", "Sink 20 aircraft carriers.");
            this.put("1週間で敵輸送船を20隻以上撃沈せよ！", "Sink 20 transport ships.");
            this.put("1週間の全力出撃を行い、敵輸送船団を捕捉・撃滅、敵の補給路を寸断せよ！", "Sink 50 transport ships.");
            this.put("有力な対潜能力を持つ海上護衛隊によって、可能な限り多くの敵潜水艦を撃滅せよ！", "Sink 15 submarines.");
            this.put("西方海域に出撃し、敵東方艦隊の主力を捕捉、これを撃滅せよ！", "Defeat 12 bosses in World 4.");
            this.put("北方海域の深部に出撃し、敵北方艦隊の主力艦隊を捕捉、これを撃滅せよ！", "Defeat 5 bosses in World 3-3 and 3-4.");
            this.put("西方海域カスガダマ島沖に出撃し、敵東方中枢艦隊を捕捉、これを撃破せよ！", "Defeat a boss in World 4-4.");
            this.put("南方海域珊瑚諸島沖に出撃し、敵機動部隊本体を捕捉撃滅、これに完全勝利せよ！",
                    "Defeat 2 bosses in World 5-2 with S RATING victory or higher."); //Bw9
            this.put("「第五戦隊」は沖ノ島沖の戦闘哨戒を実施、敵艦隊主力を捕捉、これを撃滅せよ！", "Deploy a fleet with Myoukou, Nachi, Haguro, and additional ships. Score S rating against world 2-5 boss."); //Bm1
            //Practice Quests - C
            this.put("他の提督(プレイヤー)の艦隊と「演習」を行おう！", "Challenge another fleet in practice mode."); //C1
            this.put("本日中に他の司令官の艦隊に対して3回「演習」を挑もう！", "Challenge 3 other fleets in practice mode within the same day."); //C2
            this.put("本日中に他の司令官の艦隊との「演習」で5回以上「勝利」をおさめよう！", "Get 5 victories in practice mode within the same day."); //C3
            this.put("今週中に「演習」で他の提督の艦隊に対して20回「勝利」しよう！", "Get 20 victories in practice mode within the same week."); //C4
            //Expedition Quests - D
            this.put("艦隊を「遠征」に出発させよう！", "Perform an expedition."); //D1
            this.put("本日中に「遠征」３回成功させよう！", "Perform 3 successful expeditions within the same day."); //D2
            this.put("本日中に「遠征」10回成功させよう！", "Perform 10 successful expeditions within the same day."); //D3
            this.put("今週中に「遠征」30回成功させよう！", "Perform 30 successful expeditions within the same week."); //D4
            this.put("はじめての潜水艦派遣作戦を成功させよう！", "Complete Expedition 30."); //D5
            this.put("第２次潜水艦派遣作戦を成功させよう！", "Complete Expedition 30 one more time."); //D6
            this.put("第3次及び第4次潜水艦派遣作戦を成功させ、他国製技術の導入に努めよ！", "Complete Expedition 30 two more times."); //D7
            this.put("有力な潜水艦隊派遣による海外艦との接触作戦を成功させよ！", "Complete Expedition 31 to receive German DD Z1!"); //D8
            this.put("激戦海域である南方海域への「東京急行」系遠征を敢行、これを成功させよ！", "Complete expedition 37 or 38."); //D9
            this.put("「航空戦艦運用演習」を実施し、航空火力艦の運用の強化に努めよ！", "Complete Expedition 23."); //D10
            this.put("今週中に「東京急行」系遠征を継続的に実施、同種作戦を7回成功させよう！", "Complete expedition 37 or 38 a total of 7 times in a week."); //D11
            this.put("「航空戦艦運用演習」を継続実施し、航空火力艦の運用の強化に引き続き努めよ！", "Complete expedition 23 four more times."); //D12
            this.put("「遠洋潜水艦作戦」を実施し、潜水艦隊の練度向上と敵艦隊漸減に努めよ！", "Complete Expedition 39."); //D13
            this.put("「遠洋潜水艦作戦」を継続実施し、潜水艦隊の練度向上と敵艦隊漸減に努めよ！", "Complete expedition 39 two more times."); //D14
            //Supply / Docking Quests - E
            this.put("補給は大事です！燃料・弾薬を艦に「補給」しよう！", "Resupply a ship.");
            this.put("戦闘で傷ついた艦を「入渠」させて修理して、次の出撃に備えよう！", "Repair a ship.");
            this.put("各艦隊から整備が必要な艦を5隻以上ドック入りさせ、大規模な整備をしよう！", "Repair 5 ships."); //E3
            this.put("艦隊酒保祭り！各艦に延べ15回以上の補給を実施しよう！", "Resupply your ships 15 times."); //E4
            ///Building Quests - F
            this.put("「工廠」で鋼材などの資材を使って新しい艦を「建造」しよう！", "Craft a ship."); //F1
            this.put("「工廠」でボーキサイトなどの資材を使って新しい装備アイテムを「開発」しよう！", "Craft a piece of equipment.");
            this.put("「工廠」で不要な艦を「解体」してみよう！", "Dismantle a ship.");
            this.put("「工廠」で不要な装備アイテムを「廃棄」してみよう！", "Scrap a piece of equipment.");
            this.put("「工廠」で装備アイテムを新たに「開発」しよう(失敗もOK)！", "Craft a piece of equipment. (Failures are OK)");
            this.put("「工廠」で艦娘を本日中に新たに「建造」しよう！", "Craft a ship.");
            this.put("「工廠」で装備アイテムを本日中に3回「開発」しよう(失敗もOK)！", "Craft 3 pieces of equipment. (Failures are OK)");
            this.put("艦隊強化のため、「工廠」で艦娘を本日中に3隻「建造」しよう！", "Craft 3 ships.");
            this.put("少し艦隊規模が大きくなりすぎました！「工廠」で不要な艦を2隻「解体」してください！", "Scrap 2 ships.");
            this.put("大型艦建造の準備をします！「工廠」で装備アイテムを4回「廃棄」してみてください！", "Scrap equipment 4 times."); //F10
            this.put("「工廠」で装備アイテムを3回「廃棄」して、輸送用のドラム缶を準備します。", "Scrap equipment 3 times.");
            this.put("「工廠」で余剰の装備アイテムをなるべく多く「廃棄」して、鋼材の再利用に努めよう！", "Scrap equipment 24 times."); //F12
            this.put("「九七式艦攻(友永隊)」搭載空母を秘書艦にした状態で新たに「天山」を2つ廃棄！",
                    "Have flagship equipped with Type 97 Torpedo Bomber (Tomonaga Sqn) and scrap 2 Tenzan."); //F13
            this.put("「九九式艦爆（江草隊）」搭載空母を秘書艦にした状態で新たに「彗星」を2つ廃棄！", "Have flagship equipped with Type 99 Dive Bomber (Egusa Sqn) and scrap 2 Suisei."); //F14
            ///Modernization Quests - G
            this.put("任意の艦を近代化改修(合成)して、強化せよ！", "Perform a successful modernization.");
            this.put("近代化改修を実施して、２回以上これを成功させよ！", "Perform 2 successful modernizations within the same day.");
            this.put("一週間の間に、近代化改修を１5回成功させよ！", "Perform 15 successful modernizations within the same week.");
            this.put("大型艦/新型艦建造のための準備を行う。任意の艦で近代化改修を4回成功させよ！", "Perform 4 successful modernizations.");
            this.put("Sample", "Sample");
            ///Marriage Quests - W
            this.put("式の準備をします！「工廠」で装備アイテムを2回「廃棄」して身の回りの整理を！", "Scrap equipment 2 times to show your love!.");
            this.put("本日中に「演習」で2回以上「勝利」をおさめ、式への気持ちを整理しよう！", "Show your love by getting 2 victories in practice mode!");
            this.put("第一艦隊旗艦に練度の高い(Lv.90以上～99以下)艦娘を配備して気持ちを整理せよ！", "Organize your feelings and deploy your fleet with a high level flagship (Lv.90~99)!");
            this.put("練度の高い(Lv.90以上～99以下）第一艦隊旗艦で出撃し、オリョール海の暁に勝利を刻め！", "Deploy a fleet with a high level flagship (Lv.90~99) and score S rating against world 2-3 boss.");
            this.put("第一艦隊旗艦に強い絆を結んだLv.100以上の艦娘を配備した6隻の艦隊を編成せよ！", "Organize a fleet of 6 ships with Lv.100 married ship as flagship");
            this.put("強い絆を結んだ艦娘を旗艦とした第一艦隊でリランカ島へ出撃、敵中枢を撃滅せよ！", "Deploy a fleet with Lv.100 married ship as flagship and score S rating against world 4-3 boss.");
        }
    };

    /**
     * Retrieve the translated title
     * 
     * @param jpname Japanese title
     * @return Translated title
     */
    public static String gettitle(String jpname) {
        return QUESTTITLE.containsKey(jpname) ? QUESTTITLE.get(jpname) : jpname;
    }

    /**
     * Retrieve the translated quest detail
     * 
     * @param jpname Japanese detail
     * @return Translated detail
     */
    public static String getdetail(String jpname) {
        return QUESTDETAIL.containsKey(jpname) ? QUESTDETAIL.get(jpname) : jpname;
    }
}
