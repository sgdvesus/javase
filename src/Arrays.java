public class Arrays {
    public static void main(String[] args) {
        //Array 1-D
        String weekDays[] = new String[1];
        weekDays[0] = "Monday";
        System.out.println("Array 1-D");
        for (String item: weekDays) {
            System.out.println(item);
        }

        //Array 2-D
        System.out.println("Array 2-D");
        String GamesWins[][] = new String[1][2];
        GamesWins[0][1] = "Halo 3:";
        for (int i = 0; i < GamesWins[0].length; i++) {
            System.out.println(GamesWins[0][i]);
        }

        //Array 3-D
        System.out.println("Array 3-D");
        String GameWinsPost[][][] = new String[1][2][3];
        GameWinsPost[0][0][2] = "Team: ";
        for (int y = 0; y < GameWinsPost[0][0].length; y++) {
            System.out.println(GameWinsPost[0][0][y]);
        }

        //Array 4
        System.out.println("Array 4-D");
        String matrix[][][][] = new String[1][2][3][4];
        matrix[0][0][0][3] = "Matrix";
        for (int w = 0; w < matrix[0][0][0].length; w++) {
            System.out.println(matrix[0][0][0][w]);
        }
    }
}
