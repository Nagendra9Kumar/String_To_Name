public class StarG {
    String g[][] = new String[6][6];

    StarG() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((i == 1 && (j >= 1 && j <= 5)) || (j == 1) || (i == 5 && (j >= 1 && j <= 3)) || (i == 3 && j >= 3)
                        || (i == 4 && j == 3)
                        || (i == 4 && j == 5) || (i == 5 && j == 5)) {
                    g[i][j] = "* ";
                } else
                    g[i][j] = "  ";
            }

        }
    }
}