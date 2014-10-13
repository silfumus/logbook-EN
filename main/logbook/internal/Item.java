package logbook.internal;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import logbook.constants.AppConstants;
import logbook.dto.ItemDto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * アイテム
 *
 */
public class Item {

    /**
     * アイテムプリセット値
     */
    private static final Map<Integer, ItemDto> ITEM = new ConcurrentHashMap<Integer, ItemDto>() {
        {
            this.put(1, new ItemDto(1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, "12cm単装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 1));
            this.put(2, new ItemDto(2, 1, 1, 0, 0, 0, 2, 0, 0, 1, 0, "12.7cm連装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(3, new ItemDto(3, 1, 16, 0, 0, 0, 2, 0, 0, 1, 0, "10cm連装高角砲", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 7));
            this.put(4, new ItemDto(4, 2, 2, 0, 0, 0, 1, 0, 0, 2, 0, "14cm単装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(5, new ItemDto(5, 2, 2, 0, 0, 0, 5, 0, 0, 2, 0, "15.5cm三連装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 3));
            this.put(6, new ItemDto(6, 2, 2, 0, 0, 0, 7, 0, 0, 2, 0, "20.3cm連装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 3));
            this.put(7, new ItemDto(7, 3, 3, 0, 0, 0, 14, 0, 0, 3, 0, "35.6cm連装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 4));
            this.put(8, new ItemDto(8, 3, 3, 0, 0, 0, 20, 0, 0, 3, 0, "41cm連装砲", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 4));
            this.put(9, new ItemDto(9, 3, 3, 0, 0, 0, 26, 0, 0, 4, 0, "46cm三連装砲", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 5));
            this.put(10, new ItemDto(10, 4, 16, 0, 0, 0, 2, 0, 1, 1, 0, "12.7cm連装高角砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 4));
            this.put(11, new ItemDto(11, 4, 4, 0, 0, 0, 1, 0, 1, 2, 0, "15.2cm単装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(12, new ItemDto(12, 4, 4, 0, 0, 0, 7, 0, 2, 2, 0, "15.5cm三連装副砲", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 3));
            this.put(13, new ItemDto(13, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, "61cm三連装魚雷", 5, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(14, new ItemDto(14, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, "61cm四連装魚雷", 7, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(15, new ItemDto(15, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, "61cm四連装(酸素)魚雷", 10, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(16, new ItemDto(16, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, "九七式艦攻", 5, 0, 16, 0,
                    0, 1, 0, 0, 0, 4, 0));
            this.put(17, new ItemDto(17, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, "天山", 7, 0, 24, 1,
                    0, 1, 0, 0, 0, 3, 0));
            this.put(18, new ItemDto(18, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, "流星", 10, 0, 56, 2,
                    0, 1, 0, 0, 0, 4, 0));
            this.put(19, new ItemDto(19, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "九六式艦戦", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(20, new ItemDto(20, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "零式艦戦21型", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 5));
            this.put(21, new ItemDto(21, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "零式艦戦52型", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 6));
            this.put(22, new ItemDto(22, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "烈風", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 10));
            this.put(23, new ItemDto(23, 7, 7, 0, 0, 5, 0, 0, 0, 0, 0, "九九式艦爆", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 3, 0));
            this.put(24, new ItemDto(24, 7, 7, 0, 0, 8, 0, 0, 0, 0, 0, "彗星", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 3, 0));
            this.put(25, new ItemDto(25, 10, 10, 0, 0, 1, 0, 0, 1, 0, 0, "零式水上偵察機", 0, 0, 10, 0,
                    0, 5, 0, 0, 0, 2, 1));
            this.put(26, new ItemDto(26, 11, 10, 0, 0, 4, 0, 0, 1, 0, 0, "瑞雲", 0, 0, 13, 1,
                    0, 6, 0, 0, 0, 4, 2));
            this.put(27, new ItemDto(27, 12, 11, 0, 0, 0, 0, 0, 1, 0, 0, "13号対空電探", 0, 0, 3, 1,
                    0, 3, 0, 0, 0, 0, 2));
            this.put(28, new ItemDto(28, 12, 11, 0, 0, 0, 0, 0, 3, 0, 0, "22号対水上電探", 0, 0, 10, 1,
                    0, 5, 0, 0, 0, 0, 0));
            this.put(29, new ItemDto(29, 12, 11, 0, 0, 0, 0, 0, 5, 0, 0, "33号対水上電探", 0, 0, 12, 2,
                    0, 7, 0, 0, 0, 0, 0));
            this.put(30, new ItemDto(30, 13, 11, 0, 0, 0, 0, 0, 2, 0, 0, "21号対空電探", 0, 0, 3, 2,
                    0, 4, 0, 0, 0, 0, 4));
            this.put(31, new ItemDto(31, 13, 11, 0, 0, 0, 0, 0, 8, 0, 0, "32号対水上電探", 0, 0, 15, 3,
                    0, 10, 0, 0, 0, 0, 0));
            this.put(32, new ItemDto(32, 13, 11, 0, 0, 0, 0, 0, 4, 0, 0, "14号対空電探", 0, 0, 3, 4,
                    0, 5, 0, 0, 0, 0, 6));
            this.put(33, new ItemDto(33, 17, 19, 0, 0, 0, 0, 6, 0, 0, 0, "改良型艦本式タービン", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(34, new ItemDto(34, 17, 19, 0, 0, 0, 0, 10, 0, 0, 0, "強化型艦本式缶", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(35, new ItemDto(35, 18, 12, 0, 0, 0, 0, 0, 0, 0, 0, "三式弾", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 5));
            this.put(36, new ItemDto(36, 19, 13, 0, 0, 0, 8, 0, 1, 0, 0, "九一式徹甲弾", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(37, new ItemDto(37, 21, 15, 0, 0, 0, 0, 1, 0, 0, 0, "7.7mm機銃", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(38, new ItemDto(38, 21, 15, 0, 0, 0, 0, 1, 0, 0, 0, "12.7mm単装機銃", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 3));
            this.put(39, new ItemDto(39, 21, 15, 0, 0, 0, 0, 1, 0, 0, 0, "25mm連装機銃", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 5));
            this.put(40, new ItemDto(40, 21, 15, 0, 0, 0, 0, 1, 0, 0, 0, "25mm三連装機銃", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 6));
            this.put(41, new ItemDto(41, 22, 5, 0, 0, 0, 0, 0, 0, 0, 0, "甲標的", 12, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(42, new ItemDto(42, 23, 14, 0, 0, 0, 0, 0, 0, 0, 0, "応急修理要員", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(43, new ItemDto(43, 23, 14, 0, 0, 0, 0, 0, 0, 0, 0, "応急修理女神", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(44, new ItemDto(44, 15, 17, 0, 0, 0, 0, 0, 0, 0, 0, "九四式爆雷投射機", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 5, 0));
            this.put(45, new ItemDto(45, 15, 17, 0, 0, 0, 0, 0, 0, 0, 0, "三式爆雷投射機", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 8, 0));
            this.put(46, new ItemDto(46, 14, 18, 0, 0, 0, 0, 0, 1, 0, 0, "九三式水中聴音機", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 6, 0));
            this.put(47, new ItemDto(47, 14, 18, 0, 0, 0, 0, 0, 2, 0, 0, "三式水中探信儀", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 10, 0));
            this.put(48, new ItemDto(48, 1, 16, 0, 0, 0, 1, 0, 0, 1, 0, "12.7cm単装高角砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 3));
            this.put(49, new ItemDto(49, 21, 15, 0, 0, 0, 0, 1, 0, 0, 0, "25mm単装機銃", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 4));
            this.put(50, new ItemDto(50, 2, 2, 0, 0, 0, 9, 0, 0, 2, 0, "20.3cm(3号)連装砲", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 4));
            this.put(51, new ItemDto(51, 21, 15, 0, 0, 0, 0, 0, 0, 0, 0, "12cm30連装噴進砲", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 8));
            this.put(52, new ItemDto(52, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, "流星改", 13, 0, 0, 3,
                    0, 2, 0, 0, 0, 3, 0));
            this.put(53, new ItemDto(53, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "烈風改", 0, 0, 0, 4,
                    0, 0, 0, 0, 0, 0, 12));
            this.put(54, new ItemDto(54, 9, 9, 0, 0, 0, 0, 0, 2, 0, 0, "彩雲", 0, 0, 0, 2,
                    0, 9, 0, 0, 0, 0, 0));
            this.put(55, new ItemDto(55, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "紫電改二", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 9));
            this.put(56, new ItemDto(56, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "震電改", 0, 0, 0, 5,
                    0, 0, 0, 0, 0, 0, 15));
            this.put(57, new ItemDto(57, 7, 7, 0, 0, 10, 0, 0, 0, 0, 0, "彗星一二型甲", 0, 0, 0, 2,
                    0, 1, 0, 0, 0, 3, 0));
            this.put(58, new ItemDto(58, 5, 5, 0, 0, 0, 0, 0, 1, 1, 0, "61cm五連装(酸素)魚雷", 12, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(59, new ItemDto(59, 10, 10, 0, 0, 1, 0, 0, 2, 0, 0, "零式水上観測機", 0, 0, 0, 1,
                    0, 6, 0, 0, 0, 4, 2));
            this.put(60, new ItemDto(60, 7, 7, 0, 0, 4, 0, 0, 0, 0, 0, "零式艦戦62型(爆戦)", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 3, 4));
            this.put(61, new ItemDto(61, 9, 9, 0, 0, 0, 0, 0, 3, 0, 0, "二式艦上偵察機", 0, 0, 0, 1,
                    0, 7, 0, 0, 0, 0, 1));
            this.put(62, new ItemDto(62, 11, 10, 0, 0, 11, 0, 0, 1, 0, 0, "試製晴嵐", 0, 0, 0, 4,
                    0, 6, 0, 0, 0, 6, 0));
            this.put(63, new ItemDto(63, 1, 1, 0, 0, 0, 3, 0, 0, 1, 0, "12.7cm連装砲B型改二", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(64, new ItemDto(64, 7, 7, 0, 0, 9, 0, 0, 1, 0, 0, "Ju87C改", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 5, 0));
            this.put(65, new ItemDto(65, 2, 2, 0, 0, 0, 3, 0, 2, 2, 0, "15.2cm連装砲", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 3));
            this.put(66, new ItemDto(66, 4, 16, 0, 0, 0, 1, 0, 1, 1, 0, "8cm高角砲", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 6));
            this.put(67, new ItemDto(67, 5, 5, 0, 0, 0, 0, 0, 2, 1, 0, "53cm艦首(酸素)魚雷", 15, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(68, new ItemDto(68, 24, 20, 0, 0, 0, 0, 0, 0, 0, 0, "大発動艇", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(69, new ItemDto(69, 25, 21, 0, 0, 0, 0, 0, 1, 0, 0, "カ号観測機", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 9, 0));
            this.put(70, new ItemDto(70, 26, 22, 0, 0, 0, 0, 0, 2, 0, 0, "三式指揮連絡機(対潜)", 0, 0, 0, 1,
                    0, 1, 0, 0, 0, 7, 0));
            this.put(71, new ItemDto(71, 4, 16, 0, 0, 0, 1, 0, 1, 1, 0, "10cm連装高角砲(砲架)", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 7));
            this.put(72, new ItemDto(72, 27, 23, 0, 0, 0, 0, -2, 0, 0, 0, "増設バルジ(中型艦)", 0, 0, 0, 2,
                    0, 0, 0, 7, 0, 0, 0));
            this.put(73, new ItemDto(73, 28, 23, 0, 0, 0, 0, -3, 0, 0, 0, "増設バルジ(大型艦)", 0, 0, 0, 2,
                    0, 0, 0, 9, 0, 0, 0));
            this.put(74, new ItemDto(74, 29, 24, 0, 0, 0, 0, 0, 0, 0, 0, "探照灯", 0, 0, 0, 0,
                    0, 2, 0, 0, 0, 0, 0));
            this.put(75, new ItemDto(75, 30, 25, 0, 0, 0, 0, 0, 0, 0, 0, "ドラム缶(輸送用)", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(76, new ItemDto(76, 3, 3, 0, 0, 0, 15, 0, 1, 3, 0, "38cm連装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 1));
            this.put(77, new ItemDto(77, 4, 4, 0, 0, 0, 4, 0, 2, 2, 0, "15cm連装副砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 1));
            this.put(78, new ItemDto(78, 1, 1, 0, 0, 0, 2, 0, 1, 1, 0, "12.7cm単装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(79, new ItemDto(79, 11, 10, 0, 0, 6, 0, 0, 1, 0, 0, "瑞雲(六三四空)", 0, 0, 0, 2,
                    0, 6, 0, 0, 0, 5, 2));
            this.put(80, new ItemDto(80, 11, 10, 0, 0, 7, 0, 0, 1, 0, 0, "瑞雲12型", 0, 0, 0, 3,
                    0, 6, 0, 0, 0, 5, 3));
            this.put(81, new ItemDto(81, 11, 10, 0, 0, 9, 0, 0, 1, 0, 0, "瑞雲12型(六三四空)", 0, 0, 0, 4,
                    0, 7, 0, 0, 0, 6, 3));
            this.put(82, new ItemDto(82, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, "九七式艦攻(九三一空)", 6, 0, 0, 2,
                    0, 2, 0, 0, 0, 7, 0));
            this.put(83, new ItemDto(83, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, "天山(九三一空)", 9, 0, 0, 3,
                    0, 2, 0, 0, 0, 8, 0));
            this.put(84, new ItemDto(84, 21, 15, 0, 0, 0, 0, 0, 1, 0, 0, "2cm 四連装FlaK 38", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 7));
            this.put(85, new ItemDto(85, 21, 15, 0, 0, 0, 1, 0, 1, 0, 0, "3.7cm FlaK M42", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 8));
            this.put(86, new ItemDto(86, 31, 26, 0, 0, 0, 0, 0, 0, 0, 0, "艦艇修理施設", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(87, new ItemDto(87, 17, 19, 0, 0, 0, 0, 13, 0, 0, 0, "新型高温高圧缶", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(88, new ItemDto(88, 12, 11, 0, 0, 0, 0, 0, 8, 0, 0, "22号対水上電探改四", 0, 0, 0, 3,
                    0, 5, 0, 0, 0, 2, 0));
            this.put(89, new ItemDto(89, 13, 11, 0, 0, 0, 0, 1, 3, 0, 0, "21号対空電探改", 0, 0, 0, 3,
                    0, 6, 0, 0, 0, 0, 5));
            this.put(90, new ItemDto(90, 2, 2, 0, 0, 0, 8, 0, 1, 2, 0, "20.3cm(2号)連装砲", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 3));
            this.put(91, new ItemDto(91, 1, 16, 0, 0, 0, 2, 1, 1, 1, 0, "12.7cm連装高角砲(後期型)", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 1, 5));
            this.put(92, new ItemDto(92, 21, 15, 0, 0, 0, 0, 1, 0, 0, 0, "毘式40mm連装機銃", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 6));
            this.put(93, new ItemDto(93, 8, 8, 0, 0, 0, 0, 0, 3, 0, 0, "九七式艦攻(友永隊)", 11, 0, 0, 4,
                    0, 4, 0, 0, 0, 5, 1));
            this.put(94, new ItemDto(94, 8, 8, 0, 0, 0, 0, 0, 3, 0, 0, "天山一二型(友永隊)", 14, 0, 0, 5,
                    0, 5, 0, 0, 0, 6, 1));
            this.put(95, new ItemDto(95, 32, 5, 0, 0, 0, 0, 0, 3, 1, 0, "潜水艦53cm艦首魚雷(8門)", 16, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(96, new ItemDto(96, 6, 6, 0, 0, 0, 0, 2, 2, 0, 0, "零式艦戦21型(熟練)", 0, 0, 0, 3,
                    0, 1, 0, 0, 0, 0, 8));
            this.put(97, new ItemDto(97, 7, 7, 0, 0, 7, 0, 0, 2, 0, 0, "九九式艦爆(熟練)", 0, 0, 0, 3,
                    0, 2, 0, 0, 0, 4, 1));
            this.put(98, new ItemDto(98, 8, 8, 0, 0, 0, 0, 0, 2, 0, 0, "九七式艦攻(熟練)", 8, 0, 0, 3,
                    0, 2, 0, 0, 0, 5, 0));
            this.put(99, new ItemDto(99, 7, 7, 0, 0, 10, 0, 0, 4, 0, 0, "九九式艦爆(江草隊)", 0, 0, 0, 4,
                    0, 3, 0, 0, 0, 5, 0));
            this.put(100, new ItemDto(100, 7, 7, 0, 0, 13, 0, 0, 4, 0, 0, "彗星(江草隊)", 0, 0, 0, 5,
                    0, 4, 0, 0, 0, 5, 1));
            this.put(101, new ItemDto(101, 33, 27, 0, 0, 0, 0, 0, 0, 0, 0, "照明弾", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(102, new ItemDto(102, 10, 10, 0, 0, 0, 0, 0, 1, 0, 0, "九八式水上偵察機(夜偵)", 0, 0, 0, 3,
                    0, 3, 0, 0, 0, 1, 0));
            this.put(103, new ItemDto(103, 3, 3, 0, 0, 0, 18, 0, 2, 3, 0, "試製35.6cm三連装砲", 0, 0, 0, 4,
                    0, 0, 0, 0, 0, 0, 5));
            this.put(104, new ItemDto(104, 3, 3, 0, 0, 0, 14, 1, 1, 3, 0, "35.6cm連装砲(ダズル迷彩)", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 5));
            this.put(105, new ItemDto(105, 3, 3, 0, 0, 0, 22, 0, 2, 3, 0, "試製41cm三連装砲", 0, 0, 0, 4,
                    0, 0, 0, 0, 0, 0, 5));
            this.put(106, new ItemDto(106, 12, 11, 0, 0, 0, 0, 1, 2, 0, 0, "13号対空電探改", 0, 0, 0, 3,
                    0, 4, 0, 0, 0, 0, 4));
            this.put(107, new ItemDto(107, 34, 28, 0, 0, 0, 0, 1, 1, 0, 0, "艦隊司令部施設", 0, 0, 0, 5,
                    0, 1, 0, 0, 0, 0, 1));
            this.put(108, new ItemDto(108, 35, 29, 0, 0, 0, 10, 0, 1, 3, 0, "熟練艦載機整備員", 0, 0, 0, 3,
                    0, 1, 0, 0, 0, 0, 1));
            this.put(109, new ItemDto(109, 6, 6, 0, 0, 0, 0, 1, 1, 0, 0, "零戦52型丙(六〇一空)", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 9));
            this.put(110, new ItemDto(110, 6, 6, 0, 0, 0, 0, 2, 1, 0, 0, "烈風(六〇一空)", 0, 0, 0, 4,
                    0, 0, 0, 0, 0, 0, 11));
            this.put(111, new ItemDto(111, 7, 7, 0, 0, 11, 0, 0, 1, 0, 0, "彗星(六〇一空)", 0, 0, 0, 3,
                    0, 1, 0, 0, 0, 4, 0));
            this.put(112, new ItemDto(112, 8, 8, 0, 0, 0, 0, 0, 1, 0, 0, "天山(六〇一空)", 10, 0, 0, 3,
                    0, 2, 0, 0, 0, 4, 0));
            this.put(113, new ItemDto(113, 8, 8, 0, 0, 0, 0, 0, 1, 0, 0, "流星(六〇一空)", 13, 0, 0, 4,
                    0, 3, 0, 0, 0, 5, 0));
            this.put(114, new ItemDto(114, 3, 3, 0, 0, 0, 17, 0, 3, 3, 0, "38cm連装砲改", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(115, new ItemDto(115, 10, 10, 0, 0, 1, 0, 0, 2, 0, 0, "Ar196改", 0, 0, 0, 2,
                    0, 5, 0, 0, 0, 5, 1));
            this.put(116, new ItemDto(116, 19, 13, 0, 0, 0, 9, 0, 2, 0, 0, "一式徹甲弾", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(117, new ItemDto(117, 3, 3, 0, 0, 0, 23, 0, 1, 4, 0, "試製46cm連装砲", 0, 0, 0, 4,
                    0, 0, 0, 0, 0, 0, 4));
            this.put(118, new ItemDto(118, 10, 10, 0, 0, 1, 0, 0, 1, 0, 0, "紫雲", 0, 0, 0, 4,
                    0, 8, 0, 0, 0, 2, 0));
            this.put(501, new ItemDto(501, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, "5inch単装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(502, new ItemDto(502, 1, 1, 0, 0, 0, 2, 0, 0, 1, 0, "5inch連装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(503, new ItemDto(503, 1, 16, 0, 0, 0, 1, 0, 0, 1, 0, "3inch単装高角砲", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 1));
            this.put(504, new ItemDto(504, 2, 2, 0, 0, 0, 2, 0, 0, 2, 0, "5inch単装高射砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(505, new ItemDto(505, 2, 2, 0, 0, 0, 8, 0, 0, 2, 0, "8inch三連装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(506, new ItemDto(506, 2, 2, 0, 0, 0, 3, 0, 0, 2, 0, "6inch連装速射砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 3));
            this.put(507, new ItemDto(507, 3, 3, 0, 0, 0, 10, 0, 0, 3, 0, "14inch連装砲", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 4));
            this.put(508, new ItemDto(508, 3, 3, 0, 0, 0, 15, 0, 0, 3, 0, "16inch連装砲", 0, 0, 16, 1,
                    0, 0, 0, 0, 0, 0, 4));
            this.put(509, new ItemDto(509, 3, 3, 0, 0, 0, 20, 0, 0, 3, 0, "16inch三連装砲", 0, 0, 10, 2,
                    0, 0, 0, 0, 0, 0, 5));
            this.put(510, new ItemDto(510, 4, 16, 0, 0, 0, 1, 0, 0, 1, 0, "5inch単装高射砲", 0, 0, 10, 0,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(511, new ItemDto(511, 4, 4, 0, 0, 0, 1, 0, 0, 2, 0, "6inch単装砲", 0, 0, 13, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(512, new ItemDto(512, 4, 4, 0, 0, 0, 7, 0, 0, 2, 0, "12.5inch連装副砲", 0, 0, 3, 1,
                    0, 0, 0, 0, 0, 0, 3));
            this.put(513, new ItemDto(513, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, "21inch魚雷前期型", 2, 0, 8, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(514, new ItemDto(514, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, "21inch魚雷後期型", 5, 0, 6, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(515, new ItemDto(515, 5, 5, 0, 0, 0, 0, 0, 0, 1, 0, "高速深海魚雷", 10, 0, 4, 1,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(516, new ItemDto(516, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, "深海棲艦攻", 4, 0, 0, 0,
                    0, 5, 0, 0, 0, 2, 0));
            this.put(517, new ItemDto(517, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, "深海棲艦攻 Mark.II", 6, 0, 2, 1,
                    0, 5, 0, 0, 0, 4, 0));
            this.put(518, new ItemDto(518, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, "深海棲艦攻 Mark.III", 11, 0, 0, 2,
                    0, 5, 0, 0, 0, 7, 4));
            this.put(519, new ItemDto(519, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "深海棲艦戦", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(520, new ItemDto(520, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "深海棲艦戦 Mark.II", 0, 0, 24, 0,
                    0, 0, 0, 0, 0, 0, 5));
            this.put(521, new ItemDto(521, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "深海棲艦戦 Mark.III", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 0, 9));
            this.put(522, new ItemDto(522, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, "飛び魚艦戦", 0, 0, 7, 3,
                    0, 0, 0, 0, 0, 0, 13));
            this.put(523, new ItemDto(523, 7, 7, 0, 0, 3, 0, 0, 0, 0, 0, "深海棲艦爆", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 1, 0));
            this.put(524, new ItemDto(524, 7, 7, 0, 0, 6, 0, 0, 0, 0, 0, "深海棲艦爆 Mark.II", 0, 0, 0, 1,
                    0, 0, 0, 0, 0, 2, 0));
            this.put(525, new ItemDto(525, 10, 10, 0, 0, 1, 0, 0, 0, 0, 0, "深海棲艦偵察機", 0, 0, 0, 0,
                    0, 5, 0, 0, 0, 1, 1));
            this.put(526, new ItemDto(526, 10, 10, 0, 0, 4, 0, 0, 0, 0, 0, "飛び魚偵察機", 0, 0, 0, 1,
                    0, 10, 0, 0, 0, 2, 2));
            this.put(527, new ItemDto(527, 12, 11, 0, 0, 0, 0, 0, 5, 0, 0, "対空レーダ― Mark.I", 0, 0, 0, 1,
                    0, 5, 0, 0, 0, 0, 5));
            this.put(528, new ItemDto(528, 12, 11, 0, 0, 0, 0, 0, 10, 0, 0, "水上レーダ― Mark.I", 0, 0, 0, 1,
                    0, 5, 0, 0, 0, 0, 0));
            this.put(529, new ItemDto(529, 12, 11, 0, 0, 0, 0, 0, 15, 0, 0, "水上レーダ― Mark.II", 0, 0, 0, 2,
                    0, 10, 0, 0, 0, 0, 0));
            this.put(530, new ItemDto(530, 13, 11, 0, 0, 0, 0, 0, 5, 0, 0, "対空レーダ― Mark.II", 0, 0, 21, 2,
                    0, 10, 0, 0, 0, 0, 10));
            this.put(531, new ItemDto(531, 13, 11, 0, 0, 0, 0, 3, 24, 0, 0, "深海水上レーダー", 0, 0, 13, 3,
                    0, 16, 0, 0, 0, 5, 5));
            this.put(532, new ItemDto(532, 13, 11, 0, 0, 0, 0, 2, 16, 0, 0, "深海対空レーダ―", 0, 0, 13, 4,
                    0, 12, 0, 0, 0, 5, 18));
            this.put(533, new ItemDto(533, 17, 19, 0, 0, 0, 0, 10, 0, 0, 0, "改良型深海タービン", 0, 0, 17, 0,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(534, new ItemDto(534, 17, 19, 0, 0, 0, 0, 15, 0, 0, 0, "強化型深海缶", 0, 0, 4, 1,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(535, new ItemDto(535, 18, 12, 0, 0, 0, 0, 0, 0, 0, 0, "対空散弾", 0, 0, 10, 0,
                    0, 0, 0, 0, 0, 0, 10));
            this.put(536, new ItemDto(536, 19, 13, 0, 0, 0, 15, 0, 5, 0, 0, "劣化徹甲弾", 0, 0, 8, 1,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(537, new ItemDto(537, 21, 15, 0, 0, 0, 0, 0, 0, 0, 0, "12.7mm機銃", 0, 0, 5, 0,
                    0, 0, 0, 0, 0, 0, 2));
            this.put(538, new ItemDto(538, 21, 15, 0, 0, 0, 0, 0, 0, 0, 0, "20mm機銃", 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 4));
            this.put(539, new ItemDto(539, 21, 15, 0, 0, 0, 0, 0, 0, 0, 0, "40mm二連装機関砲", 0, 0, 3, 1,
                    0, 0, 0, 0, 0, 0, 8));
            this.put(540, new ItemDto(540, 21, 15, 0, 0, 0, 0, 0, 0, 0, 0, "40mm四連装機関砲", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 0, 12));
            this.put(541, new ItemDto(541, 22, 5, 0, 0, 0, 0, 0, 5, 0, 0, "深海烏賊魚雷", 18, 0, 0, 4,
                    0, 0, 0, 0, 0, 0, 0));
            this.put(542, new ItemDto(542, 15, 17, 0, 0, 0, 0, 0, 0, 0, 0, "深海爆雷投射機", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 7, 0));
            this.put(543, new ItemDto(543, 14, 18, 0, 0, 0, 0, 0, 0, 0, 0, "深海ソナー", 0, 0, 0, 2,
                    0, 0, 0, 0, 0, 9, 0));
            this.put(544, new ItemDto(544, 15, 17, 0, 0, 0, 0, 0, 0, 0, 0, "深海爆雷投射機 Mk.II", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 13, 0));
            this.put(545, new ItemDto(545, 14, 18, 0, 0, 0, 0, 0, 0, 0, 0, "深海ソナー Mk.II", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 16, 0));
            this.put(546, new ItemDto(546, 7, 7, 0, 0, 10, 0, 0, 0, 0, 0, "飛び魚艦爆", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 7, 8));
            this.put(547, new ItemDto(547, 6, 6, 0, 0, 0, 0, 0, 1, 0, 0, "深海猫艦戦", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 10));
            this.put(548, new ItemDto(548, 7, 7, 0, 0, 11, 0, 0, 3, 0, 0, "深海地獄艦爆", 0, 0, 0, 3,
                    0, 3, 0, 0, 0, 4, 0));
            this.put(549, new ItemDto(549, 8, 8, 0, 0, 0, 0, 0, 2, 0, 0, "深海復讐艦攻", 13, 0, 0, 3,
                    0, 5, 0, 0, 0, 5, 4));
            this.put(550, new ItemDto(550, 1, 16, 0, 0, 0, 2, 0, 3, 2, 0, "5inch連装両用莢砲", 0, 0, 0, 3,
                    0, 0, 0, 0, 0, 0, 9));
        }
    };

    private static final Logger LOG = LogManager.getLogger(Item.class);

    private static final Map<String, String> ITEMTRANSLATED = new ConcurrentHashMap<String, String>();
    static {
        try {
            // Populate the HashMap with the translation data
            // Column: Quest Code, titleJP, titleEN, detailJP, detailEN, api_no
            TranslationDto.fillMap(ITEMTRANSLATED, AppConstants.ITEM_TRANSLATION_FILE, 1, 2);
        } catch (IOException e) {
            LOG.warn("Failed to read item translation.", e);
        }
    }

    /**
     * Get the equipment name
     * 
     * @param jpname JP equipment name
     * @return English name
     */
    public static String getTranslated(String jpname) {
        return ITEMTRANSLATED.containsKey(jpname) ? ITEMTRANSLATED.get(jpname) : jpname;
    }

    /**
     * アイテムを設定します
     */
    public static void set(int id, ItemDto item) {
        ITEM.put(id, item);
    }

    /**
     * アイテムを取得します
     * 
     * @param type ID
     * @return アイテム
     */
    public static ItemDto get(int type) {
        return ITEM.get(type);
    }

    /**
     * IDの一覧を取得します
     * 
     * @return IDの一覧
     */
    public static Set<Integer> keySet() {
        return ITEM.keySet();
    }
}
