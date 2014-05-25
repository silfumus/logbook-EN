package logbook.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 戦闘での評価
 *
 */
public class EvaluateExp {

    /**
     * 戦闘での評価プリセット値
     */
    private static final Map<String, Double> EVAL_EXP = new LinkedHashMap<String, Double>() {
        {
            this.put("Perfect S", 1.2d);
            this.put("S (Victory)", 1.2d);
            this.put("A (Victory)", 1.0d);
            this.put("B (Tactical Victory)", 1.0d);
            this.put("C (Tactical Defeat)", 0.8d);
            this.put("D (Defeat)", 0.7d);
        }
    };

    /**
     * 戦闘での評価を取得します
     * @return 戦闘での評価
     */
    public static Map<String, Double> get() {
        return Collections.unmodifiableMap(EVAL_EXP);
    }
}
