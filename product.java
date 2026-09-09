class ProductDigits {
    public static void main(String[] args) {
        int n = 1234;
        int product = 1;

        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }

        System.out.println(product);
    }
}
