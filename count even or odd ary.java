import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c, even = 0, odd = 0;

        System.out.print("Enter rows: ");
        r = sc.nextInt();
        System.out.print("Enter columns: ");
        c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
