public class StarY {
    String y[][] = new String[6][6];

    StarY() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (((i == 1) && (j == 1 || j == 5)) ||
                        (i == 2) && (j == 2 || j == 4) ||
                        ((i == 3 || i == 4 || i == 5) && j == 3)) {
                    y[i][j] = "* ";
                } else
                    y[i][j] = "  ";
            }

        }
    }
}