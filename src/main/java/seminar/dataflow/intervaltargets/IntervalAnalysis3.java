package seminar.dataflow.intervaltargets;

/**
 * For this target we will check divergence for non widening nor narrowing.
 * For the version of the analysis that implements them, it should converge
 */
public class IntervalAnalysis3 {
    public static int func() {
        int y = 0;
        int x = 7;
        int k = 3;
        // k goes down by subtracting a variable, not the constant -1 (k-- or k = k - 1 can
        // compile to k = k + (-1)): see "Why one and not k--?" in the assignment.
        int one = 1;
        x = x + 1;
        while(k > 0) {
            x = 7;
            x = x + 1;
            y = y + 1;
            k = k - one;
        }
        return x;
    }

}
