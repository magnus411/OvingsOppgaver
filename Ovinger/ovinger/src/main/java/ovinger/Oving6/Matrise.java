package ovinger.Oving6;

public class Matrise {
    




    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matrix2[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int c[][]=new int[matrix.length][matrix2.length];





        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }



        System.out.println(matrix);

    }



}
