import java.util.Scanner;

/**
 * Created by oso on 05.03.2015.
 */
public class userLogin {
    public static void main(String[] args) {

        String user = "";
        String pass = "";
        boolean isCorrect = false;


        do {
            Scanner read = new Scanner(System.in);
            System.out.println("user: ");
            user = read.nextLine();
            System.out.println("password: ");
            pass = read.nextLine();
            if (user.equals("Andrei") && pass.equals("pass")) {
                isCorrect =true;
                System.out.println("Accepted !");
                Runtime run = Runtime.getRuntime();
                try {
                    run.exec("notepad");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else
                System.out.println("Please,try again !");
                System.out.println();

        }while( ! isCorrect);

    }
}
