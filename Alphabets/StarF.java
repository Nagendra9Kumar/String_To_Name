public class StarF {
    String f[][] = new String[6][6];

    StarF() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if ((j == 1) || (i == 1 && (j >= 1 && j <= 5)) || (i == 3 && (j >= 1 && j <= 5))) {
                    f[i][j] = "* ";
                } else
                    f[i][j] = "  ";
            }

        }
    }
}