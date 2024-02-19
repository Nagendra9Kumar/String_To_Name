public class StarP {
    String p[][] = new String[6][6];

    StarP() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) ||
                        ((i == 1 || i == 3) && (j >= 1 && j <= 4)) ||
                        (j == 5 && (i == 2))) {
                    p[i][j] = "* ";
                } else
                    p[i][j] = "  ";
            }

        }
    }
}
