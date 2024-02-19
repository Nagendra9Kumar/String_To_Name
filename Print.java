public class Print {
    public void print(String[][] arr) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
