class FirstDigit {
    public static void main(String[] args) {
        int n = 12345;

        while (n >= 10)
            n /= 10;

        System.out.println(n);
    }
}
