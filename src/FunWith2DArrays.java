public class FunWith2DArrays {
    public static int totalElements(int[][] num) {
        int totalNum = 0;
        for (int[] row : num) {
            for (int elements : row) {
                totalNum++;
            }
        }
        return totalNum;
    }

    public static void fourCorners(String[][] str) {
        String[] corner = new String[4];
        corner[0] = str[0][0];
        corner[1] = str[0][str[0].length - 1];
        corner[2] = str[str.length - 1][0];
        corner[3] = str[str.length - 1][str[0].length - 1];

        System.out.println(corner[0]);
        System.out.println(corner[1]);
        System.out.println(corner[2]);
        System.out.println(corner[3]);
    }

    public static void swapFrontAndBackRows(String[][] str) {
        String[] temp = str[0];
        str[0] = str[str.length - 1];
        str[str.length - 1] = temp;
    }
}
