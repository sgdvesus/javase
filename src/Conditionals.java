public class Conditionals {
    public static void main(String[] args) {
        boolean enable = true;
        short filesSent = 0;
        String content = "Hello";

        if (enable && filesSent == 1){
            System.out.println(content);
            filesSent++;
        } else if (enable == true && filesSent == 0){
            System.out.println("First file send:" + content);
        } else {
            System.out.println("Error");
        }

    }
}
