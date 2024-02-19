public class StarW {
    String w[][] = new String[6][6];

    StarW() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || j == 5 || (i == 4 && (j == 2 || j == 4)) || (i == 3 && j == 3)) {
                    w[i][j] = "* ";
                } else
                    w[i][j] = "  ";
            }

        }
    }
}