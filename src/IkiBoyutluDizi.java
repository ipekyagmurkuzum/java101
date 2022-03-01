public class IkiBoyutluDizi {
    public static void main(String[] args) {

        int[][] uzaklik = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

        int[][] matris = new int[3][4];
        int number = 1;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = number++;
//                System.out.print(matris[i][j]+ " ");
//            }
//            System.out.println();
            }
        }

        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}

