public class StarH {
    String h[][] = new String[6][6];

    StarH() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((j == 1) || j == 5 || (i == 3 && (j >= 1 && j <= 5))) {
                    h[i][j] = "* ";
                } else
                    h[i][j] = "  ";
            }

        }
    }
}