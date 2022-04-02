package MayinTarlasi;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int mineNumber, selectedRow, selectedCol;
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int occupiedSpots = 0, count = 0;
    boolean isGameOver = false;

    public MineSweeper(int rowNumber, int colNumber) {
        String[][] matrix = new String[rowNumber][colNumber];
        mineNumber = (rowNumber * colNumber) / 4;

        while (occupiedSpots < mineNumber) {
            int x = random.nextInt(rowNumber);
            int y = random.nextInt(colNumber);
            matrix[x][y] = "*";
            occupiedSpots++;
        }
        System.out.println("Mayınların Konumu");

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = "-";
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("=============");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = "-";
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }


        while (!isGameOver) {
            int nearMines = 0;
            System.out.println("Satır sayısı giriniz: ");
            selectedRow = scan.nextInt() - 1;
            System.out.println("Sütun sayısı giriniz: ");
            selectedCol = scan.nextInt() - 1;
            System.out.println("======================");
            if (selectedRow < 0 || selectedRow >= rowNumber) {
                System.out.println("Hatalı sayı girişi!");
            } else if (selectedCol < 0 || selectedCol >= colNumber) {
                System.out.println("Hatalı sayı girişi!");
            } else if (Objects.equals(matrix[selectedRow][selectedCol], "*")) {
                isGameOver = true;
                System.out.println("Game Over!");
            } else if (Objects.equals(matrix[selectedRow][selectedCol], "-")) {
                count++;
                for (int i = selectedRow - 1; i <= selectedRow + 1; i++) {
                    for (int j = selectedCol - 1; j <= selectedCol + 1; j++) {
                        if ((i < rowNumber && i >= 0) && (j < colNumber && j >= 0)) {
                            if (Objects.equals(matrix[i][j], "*")) {
                                nearMines++;
                            }
                        }
                    }
                }
                matrix[selectedRow][selectedCol] = String.valueOf(nearMines);
                for (String[] row : matrix) {
                    for (String col : row) {
                        if (col.equals("*")) {
                            System.out.print("-");
                        } else {
                            System.out.print(col);
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Bu satır zaten açıldı.");
            }
            if (count == rowNumber * colNumber - mineNumber) {
                System.out.print("Tebrikler kazandınız!");
                break;
            }
        }
    }

    public static void run() {
    }
}
