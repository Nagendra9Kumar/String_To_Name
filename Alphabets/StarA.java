public class StarA {
    String a[][] = new String[6][6];

    StarA() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j == 1 || (i == 1 && (j >= 1 && j <= 5)) || (i == 3 && (j >= 1 && j <= 5)) || j == 5) {
                    a[i][j] = "* ";
                } else
                    a[i][j] = "  ";
            }

        }
    }
}