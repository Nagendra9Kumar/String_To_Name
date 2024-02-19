public class StarI {
    String i[][] = new String[6][6];

    StarI() {
        for (int k = 0; k <= 5; k++) {
            for (int j = 0; j <= 5; j++) {
                if ((k == 1 && (j >= 1 && j <= 5)) || (k == 5) && (j >= 1 && j <= 5) || (j == 3)) {
                    i[k][j] = "* ";
                } else
                    i[k][j] = "  ";
            }

        }
    }
}
