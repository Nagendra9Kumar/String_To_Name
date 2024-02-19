public class StarC {
    String c[][] = new String[6][6];

    StarC() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (((i > 1 && i < 5) && j == 1)
                        || (i == 1 && (j > 1 && j <= 5))
                        || (i == 5 && (j > 1 && j <= 5))) {
                    c[i][j] = "* ";
                } else
                    c[i][j] = "  ";
            }

        }
    }
}