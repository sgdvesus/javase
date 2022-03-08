public class HelloWorld {
    public static void main(String[] args) {
        int feeMonth = 150;
        int month = 12;
        month -= 5;
        feeMonth *= month;
        System.out.println(feeMonth);

        int users = 500;
        users /= 3;
        System.out.println(users);

        int income = 321;
        income %= 2;
        System.out.println(income);

        //postfijo
        int currentIncome = 5;
        int result = 100 + currentIncome++;
        System.out.println("result: " + result + " Income: " + currentIncome);

        //prefijo
        result = 100 + ++currentIncome;
        System.out.println("result: " + result + " Income: " + currentIncome);
    }
}
