public class Currency {
    public static void main(String[] args) {
        double AmountWallet = 3000;
        ConvertCurrency(AmountWallet, "MXN");
        ConvertCurrency(AmountWallet, "YN");
        ConvertCurrency(AmountWallet, "US");
    }

    double userAmount = 0;
    /**
     * Description: Converts a certain amount of coins to another currency.
     * @param amount Amount of money.
     * @param currency Type currency: select the new currency type
     * @return amount Return amount equivalent for the new currency.
     * */
    public static void ConvertCurrency(double amount, String currency){
        switch (currency){
            case "MXN":
                double coinToMXN = 2.5;
                System.out.println("For coin to MXN: " + amount/coinToMXN);
                break;
            case "YN":
                double coinToYN = 300;
                System.out.println("For coin to YN: " + amount/coinToYN);
                break;
            default:
                double coinToUSD = 1000;
                System.out.println("For coin to USD: " + amount/coinToUSD);
                break;
        }
    }
}
