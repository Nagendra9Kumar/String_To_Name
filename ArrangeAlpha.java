public class ArrangeAlpha {

    String[][] arrange(String[][] arr, String[][] arr1) {
        String result[][] = new String[6][18];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j + (arr1[i].length)] = arr1[i][j];
            }
        }
        return result;

    }
}
