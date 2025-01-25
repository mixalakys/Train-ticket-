import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws Exception {
        Scanner myObjName = new Scanner((System.in));
        System.out.println("Where are you travelling today? :");

        String Name1 = myObjName.nextLine();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter The date you are travelling:");

        String num = myObj.nextLine();

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the Day you are leaving:");

        String num2 = myObj.nextLine();

        if (num.equals("12/2")) {

            System.out.println("the prce is 50$ for both of your tickets");

        } else if (num.equals("13/3")) {

            System.out.println("The price is 70$ for both of your tickets");

        } else {
            System.out.println("The price is 100$ for both of your tickets");
        }
    }
}