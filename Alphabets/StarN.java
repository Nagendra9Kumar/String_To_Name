public class StarN {
    String n[][] = new String[6][6];

    StarN() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || (j == 5) || (i == 2 && j == 2) || (i == 4 && j == 4) || (i == 3 && j == 3)) {
                    n[i][j] = "* ";
                } else
                    n[i][j] = "  ";
            }

        }
    }
}
