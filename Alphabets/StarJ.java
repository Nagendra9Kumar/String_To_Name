public class StarJ {
    String j[][] = new String[6][6];

    StarJ() {
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 5; k++) {
                if ((i == 1 && (k >= 1 && k <= 5)) || (k == 3 && i <= 4) || (i == 4 && k == 1)
                        || (i == 5 && (k >= 1 && k <= 3))) {
                    j[i][k] = "* ";
                } else
                    j[i][k] = "  ";
            }

        }
    }
}