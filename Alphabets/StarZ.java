public class StarZ {
    String z[][] = new String[6][6];

    StarZ() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((i == 1 && (j >= 1 && j <= 5)) || (i == 5 && (j >= 1 && j <= 5)) || (i == 2 && j == 4)
                        || (i == 4 && j == 2) || (i == 3 && j == 3)) {
                    z[i][j] = "* ";
                } else
                    z[i][j] = "  ";
            }

        }
    }
}
