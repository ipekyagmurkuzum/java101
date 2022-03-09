public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matris = {
                {2, 6, 2},
                {5, 9, 8}};

        int[][] transpoz = new int[matris[0].length][matris.length];

        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[0].length; j++) {
                transpoz[i][j] = matris[j][i];
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}