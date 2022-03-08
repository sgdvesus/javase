public class HelloWorld {
    public static void main(String[] args) {
        //strings
        String username = "Alexander ";
        username += "Salgado ";
        username += "Velazquez";
        System.out.println(username);
        //char
        char myChar = 'z';
        System.out.println("For char: " + myChar);

        //bool
        boolean premiumAccount = true;
        boolean freeAccount = false;
        System.out.println("is premium: " + premiumAccount + ". Is free: " + freeAccount);

        //integers
        byte age = 127;
        short limitBalance  = 32767;
        int currentBalance = 2400; //default
        long bankBalance = 9223372036854775807L;
        System.out.println("Age: " + age + " limit user: " + limitBalance);
        System.out.println("Current user balance: " + currentBalance + "bank: " + bankBalance);

        //float
        double commision = 2.9d;
        float clientDeposit = 19.8F;
        System.out.println("Bank commision: " + commision + "clientDeposit " + clientDeposit);


        //for Java 10 ^ can use "var" keyword
        // var result = currentBalance*0.16
    }
}
