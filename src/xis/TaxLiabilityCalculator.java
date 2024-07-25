package xis;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class TaxLiabilityCalculator {
    private Map<Integer, TreeMap<Double, Function<Double, Double>>> taxBrackets;

    public TaxLiabilityCalculator() {
        this.taxBrackets = new HashMap<>();
        TreeMap<Double, Function<Double, Double>> map2024 = new TreeMap<>();
        taxBrackets.put(2024, map2024);
        map2024.put(0d, a -> 0.1 * a);
        map2024.put(11601d, a -> 0.12 * (a - 11600) + 1160);
        map2024.put(47151d, a -> 0.22 * (a - 47150) + 5426);
    }

    public double getLiability(Integer taxYear, Double income) {
        if (!taxBrackets.containsKey(taxYear)) {
            return 0.0;
        }
        TreeMap<Double, Function<Double, Double>> yearMap = taxBrackets.get(taxYear);
        return yearMap.floorEntry(income).getValue().apply(income);
    }

    public static void main(String[] args) {
        TaxLiabilityCalculator tlc = new TaxLiabilityCalculator();
        System.out.println(tlc.getLiability(2024, 10000D));
        System.out.println(tlc.getLiability(2024, 21600D));
    }
}
