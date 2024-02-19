public class StarT {
    String t[][] = new String[6][6];

    StarT() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((i == 1 && (j >= 1 && j <= 5))
                        || (j == 3 && i <= 5)) {
                    t[i][j] = "* ";
                } else
                    t[i][j] = "  ";
            }

        }
    }
}