//public class Code {
//    public static void main(String[] args) {
//        System.out.println("Abhinandan Joshi");
//        int finalCount = 0;
//        int[][] matrix = {
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {1, 0, 0, 0, 0}
//        };
//        int x = 0, y = 0;
//
//        // Locate the initial position of '1'
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == 1) {
//                    x = i;
//                    y = j;
//                }
//            }
//        }
//
//        // Target position
//        int targetX = 3, targetY = 3;
//
//        // Move '1' towards target (3,3)
//        while (x != targetX || y != targetY) {
//            if (x < targetX) {
//                shiftRowForward(matrix, x, y);
//                x++;
//            } else if (x > targetX) {
//                shiftRowBackward(matrix, x, y);
//                x--;
//            }
//
//            if (y < targetY) {
//                shiftColumnForward(matrix, x, y);
//                y++;
//            } else if (y > targetY) {
//                shiftColumnBackward(matrix, x, y);
//                y--;
//            }
//
//            // Count one complete move
//            finalCount++;
//        }
//
//        System.out.println("Total shifts to reach target: " + (int)(finalCount+1));
//    }
//
//    public static void shiftRowForward(int[][] matrix, int x, int y) {
//        matrix[x][y] = 0;
//        matrix[x + 1][y] = 1;
//    }
//
//    public static void shiftRowBackward(int[][] matrix, int x, int y) {
//        matrix[x][y] = 0;
//        matrix[x - 1][y] = 1;
//    }
//
//    public static void shiftColumnForward(int[][] matrix, int x, int y) {
//        matrix[x][y] = 0;
//        matrix[x][y + 1] = 1;
//    }
//
//    public static void shiftColumnBackward(int[][] matrix, int x, int y) {
//        matrix[x][y] = 0;
//        matrix[x][y - 1] = 1;
//    }
//}

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int x = 0, y = 0;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }

        scanner.close();

        int finalCount = 0;
        int targetX = 3, targetY = 3;

        while (x != targetX || y != targetY) {
            if (x < targetX) {
                shiftRowForward(matrix, x, y);
                x++;
            } else if (x > targetX) {
                shiftRowBackward(matrix, x, y);
                x--;
            }

            if (y < targetY) {
                shiftColumnForward(matrix, x, y);
                y++;
            } else if (y > targetY) {
                shiftColumnBackward(matrix, x, y);
                y--;
            }

            finalCount++;
        }

        System.out.println((int)(finalCount+1));
    }

    public static void shiftRowForward(int[][] matrix, int x, int y) {
        matrix[x][y] = 0;
        matrix[x + 1][y] = 1;
    }

    public static void shiftRowBackward(int[][] matrix, int x, int y) {
        matrix[x][y] = 0;
        matrix[x - 1][y] = 1;
    }

    public static void shiftColumnForward(int[][] matrix, int x, int y) {
        matrix[x][y] = 0;
        matrix[x][y + 1] = 1;
    }

    public static void shiftColumnBackward(int[][] matrix, int x, int y) {
        matrix[x][y] = 0;
        matrix[x][y - 1] = 1;
    }
}
