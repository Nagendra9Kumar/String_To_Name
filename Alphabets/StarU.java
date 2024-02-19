public class StarU {
    String u[][] = new String[6][6];

    StarU() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1 && i <= 4) || (j == 5 && i <= 4) || (i == 5 && (j == 2 || j == 3 || j == 4))) {
                    u[i][j] = "* ";
                } else
                    u[i][j] = "  ";
            }

        }
    }
}