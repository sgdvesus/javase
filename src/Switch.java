public class Switch {
    public static void main(String[] args) {
        int userChoose =  6;
        switch (userChoose){
            case 1:
                System.out.println("User select " + userChoose);
                break;
            case 2:
                System.out.println("Case 2 User select " + userChoose);
                break;
            default:
                System.out.println("User default " + userChoose);
                break;
        }
    }
}
