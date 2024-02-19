public class StarE {
    String e[][] = new String[6][6];

    StarE() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || (i == 1 && (j >= 1 && j <= 5)) || (i == 3 && (j >= 1 && j <= 3))
                        || (i == 5 && (j >= 1 && j <= 5))) {
                    e[i][j] = "* ";
                } else
                    e[i][j] = "  ";
            }

        }
    }
}