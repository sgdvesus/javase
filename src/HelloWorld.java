public class HelloWorld {
    public static void main(String[] args) {
        double n = 4.1;
        System.out.println(Math.ceil(n));
        System.out.println(Math.floor(n));
        System.out.println(Math.pow(n, 2));
        System.out.println(Math.max(4, 6));
        System.out.println(Math.sqrt(n));
        System.out.println(Math.PI);

        double annualFee = 30.0;
        double months = 12.0;
        System.out.println(annualFee/months);

        //Stimated
        System.out.println((int) annualFee);
        int a = 30;
        int b = 12;
        //explicit cast 2.5
        System.out.println((double) a/b);

        //implicit cast 2.0
        double c = a/b;
        System.out.println(c);

        //int > char, no need cast
        char fora = 's';
        int forI = fora;
        System.out.println(forI);

        // char > short, need cast
        short forS = (short) fora;
        System.out.println(forS);
    }
}
