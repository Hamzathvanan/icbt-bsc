public class MultiplicationTable {
    public static void printTable() {

        int[][] table = new int[11][11];


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                table[i][j] = i * j;
            }
        }


        System.out.print("X\t");
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + "\t");
        }
        System.out.println();


        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= 10; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
