public class StarL {
    String l[][] = new String[6][6];

    StarL() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || i == 5 && (j >= 1 && j <= 5)) {
                    l[i][j] = "* ";
                } else
                    l[i][j] = "  ";
            }

        }
    }
}