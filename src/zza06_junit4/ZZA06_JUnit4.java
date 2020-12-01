package zza06_junit4;

public class ZZA06_JUnit4 {

    public static double myDiv(double a, double b, double x) throws Exception {
        double y;
        if (x >= 4) {
            y = (x + 4 * a) / (a * a * b * b);
        } else {
            y = (x * x * x - a * b);
        }
        if (!(Double.isNaN(y)) && (!Double.isInfinite(y))) {
            return y;

        } else {
            throw new Exception();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(myDiv(5, 6, 880));
    }

}
