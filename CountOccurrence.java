public class CountOccurrence {
    public static void main(String[] args) {
        int n = 122334;
        int digit = 2;
        int count = 0;

        while (n > 0) {
            if (n % 10 == digit)
                count++;

            n /= 10;
        }

        System.out.println(count);
    }
} {
    
}
