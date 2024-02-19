public class StarX {
    String x[][] = new String[6][6];

    StarX() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (((i == 1 || i == 5) && (j == 1 || j == 5)) ||
                        (i == 2 || i == 4) && (j == 2 || j == 4) ||
                        (i == 3 && j == 3)) {
                    x[i][j] = "* ";
                } else
                    x[i][j] = "  ";
            }

        }
    }
}