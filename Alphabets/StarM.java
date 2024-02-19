public class StarM {
    String m[][] = new String[6][6];

    StarM() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || j == 5 || (i == 2 && (j == 2 || j == 4)) || (i == 3 && j == 3)) {
                    m[i][j] = "* ";
                } else
                    m[i][j] = "  ";
            }

        }
    }
}