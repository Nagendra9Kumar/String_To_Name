public class StarV {
    String v[][] = new String[6][6];

    StarV() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1 && i < 4) || (j == 5 && i < 4) || (i == 5 && j == 3) || (i == 4 && (j == 2 || j == 4))) {
                    v[i][j] = "* ";
                } else
                    v[i][j] = "  ";
            }

        }
    }
}