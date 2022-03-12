public class LoopFor {
    public static void main(String[] args) {
        int funds = 1000;
        int friends = 5;

        for (int i = 1; i < friends; i++){
            if(i == 1){
                System.out.println("For my best friend: " + funds + " Sent:" + funds/2);
                funds-=funds/2;

            } else if(i == 2){
                System.out.println("Is not your birthday");
                continue;

            } else if (i == 4){
                System.out.println("My second friend : " + funds + " Sent: " + funds/2);
                funds-=funds/2;
                break;
            } else{
                System.out.println("Sent $50: " + funds);
                funds-=50;
            }
        }
        System.out.println("Complete");
    }
}
