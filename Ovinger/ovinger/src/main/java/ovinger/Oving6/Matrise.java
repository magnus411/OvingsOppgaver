/**
 * It contains three methods, gange, pluss and transpose, which all take two matrices as input and
 * return a matrix as output
 */
package ovinger.Oving6;

public class Matrise {

    public int[][] gange(int[][] a, int[][] b) {

        try {

            int c[][] = new int[3][3];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {

                    // Kryss multiplikasjon
                    for (int k = 0; k < 3; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return c;

        } catch (Exception e) {
            System.out.println("Error!!!");
            return new int[0][0];

        }
    }

    public int[][] pluss(int[][] a, int[][] b) {

        try {
            int c[][] = new int[3][3];

            for (int i = 0; i < a.length; i++) {

                for (int j = 0; j < b.length; j++) {
                    c[i][j] = a[i][j] + b[i][j];

                }
            }
            return c;

        } catch (Exception e) {
            System.out.println("Error!!!");
            return new int[0][0];

        }

    }

    public int[][] transpose(int[][] a, int[][] b) {

        try {
            int c[][] = new int[3][3]; // 3 rows and 3 columns

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    c[i][j] = a[j][i];

                }
            }
            return c;

        } catch (Exception e) {
            System.out.println("Error!!!");
            return new int[0][0];
        }

    }

    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        Matrise matrise = new Matrise();
        int[][] g = matrise.gange(a, b);
        int[][] p = matrise.pluss(a, b);
        int[][] t = matrise.transpose(a, b);

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------");

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------");

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

    }

}
