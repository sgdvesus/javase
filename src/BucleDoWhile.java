import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        int userResponse;
        int userFunds = 1200;
        do {
            System.out.println("Please select an option: ");
            System.out.println("[1] Login");
            System.out.println("[2] Transfer");
            System.out.println("[0]Exit");

            Scanner sc = new Scanner(System.in);
            userResponse = Integer.valueOf(sc.nextLine());

            switch (userResponse){
                case 0:
                    System.out.println("Bye!");
                    break;
                case 1:
                    System.out.println("Welcome, Alexander");
                    break;
                case 2:
                    System.out.println(userFunds);
                    DonateFunds(userFunds);
                    break;
                default:
                    System.out.println("Please, choose an valid option.");
                    break;
            }
        }while (userResponse != 0);
    }
    public static int DonateFunds(int balance){
        boolean successfully = false;
        int transferAmount = 300;
        while (balance>=transferAmount){
            balance -= transferAmount;
            System.out.println("Balance: " + balance + " Status: " + successfully);
            successfully = (successfully)?false:true;
        }
        return balance;
    }
}
