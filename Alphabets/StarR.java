public class StarR {
    String r[][] = new String[6][6];

    StarR() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) ||
                        ((i == 1 || i == 3) && (j >= 1 && j <= 4)) ||
                        (j == 5 && (i == 2)) ||
                        (i == 4 && j == 3) ||
                        (i == 5 && j == 4)) {
                    r[i][j] = "* ";
                } else
                    r[i][j] = "  ";
            }

        }
    }
}