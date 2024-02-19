public class ArrangeAlpha {

    String[][] arrange(String[][] arr, String[][] arr1) {
        String result[][] = new String[6][arr[1].length + arr1[1].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                result[i][j + (arr[i].length)] = arr1[i][j];
                // System.out.println(result[i].length);
            }
        }
        return result;

    }
}
