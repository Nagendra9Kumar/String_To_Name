public class StarK {
    String k[][] = new String[6][6];

    StarK() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || ((i == 2 || i == 4) && j == 3) || ((i == 1 || i == 5) && j == 4)
                        || (i == 3 && j == 2)) {
                    k[i][j] = "* ";
                } else
                    k[i][j] = "  ";
            }

        }
    }
}