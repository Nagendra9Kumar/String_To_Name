
public class Ex {
    public static void main(String[] args) {
        ArrangeAlpha a1 = new ArrangeAlpha();
        ArrangeAlpha a2 = new ArrangeAlpha();
        StarA a = new StarA();
        StarD d = new StarD();
        // StarE e = new StarE();
        String result[][] = new String[6][2 * 6];
        String result1[][] = new String[6][12];
        result = a1.arrange(a.a, d.d);
        result1 = a2.arrange(result, a.a);
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < result1[i].length; j++) {
                // System.out.print(result[i][j]);
                System.out.print(result1[i][j]);
            }
            System.out.println();
        }
    }
}
