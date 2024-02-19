public class StarS {
    String s[][] = new String[6][6];

    StarS() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((i == 2 && j == 1)
                        || (i == 4 && j == 5)
                        || (i == 3 && (j == 2
                                || j == 3 || j == 4))
                        || (i == 1 && j > 1)
                        || (i == 5 && (j >= 1 && j <= 4))) {
                    s[i][j] = "* ";
                } else
                    s[i][j] = "  ";
            }

        }
    }
}