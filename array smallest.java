import java.util.Scanner;

class MatrixSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;
        System.out.print("Enter rows: ");
        r = sc.nextInt();
        System.out.print("Enter columns: ");
        c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        int smallest = a[0][0];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (a[i][j] < smallest)
                    smallest = a[i][j];

        System.out.println("Smallest = " + smallest);
    }
}
