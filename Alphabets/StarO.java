public class StarO {
    String o[][] = new String[6][6];

    StarO() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (((i == 1 || i == 5) && (j > 1 && j < 5)) ||
                        ((i > 1 && i < 5) && (j == 1 || j == 5))) {
                    o[i][j] = "* ";
                } else
                    o[i][j] = "  ";
            }

        }
    }
}