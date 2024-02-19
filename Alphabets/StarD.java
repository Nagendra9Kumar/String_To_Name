public class StarD {
    String d[][] = new String[6][6];

    StarD() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || (i == 1 && (j >= 1 && j <= 4)) || (i == 3 && j == 5) || (i == 5 && (j >= 1 && j <= 4))
                        || (i == 4 && j == 5)
                        || (i == 2 && j == 5)) {
                    d[i][j] = "* ";
                } else
                    d[i][j] = "  ";
            }

        }
    }
}