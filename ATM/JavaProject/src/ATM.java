import java.util.*;

public class ATM {

    public static void main(String[] args) {

        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner sc = new Scanner(System.in);

        // we have to take an input by an user
        System.out.println("Enter your Pin number");

        int password = sc.nextInt();

        if (password == pin) {
            System.out.println("Enter your name");
            name = sc.next();
            System.out.println("welcome " + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("press 4 to take recipt");
                System.out.println("Press 5 to exit");

                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println(" your current balance is " + balance);
                        break;

                    case 2:
                        System.out.println("How much amount do you want to add to your account");
                        AddAmount = sc.nextInt();
                        System.out.println("successfully Credited");
                        balance = AddAmount + balance;
                        break;

                    case 3:
                        System.out.println("How much do you want to take ");
                        TakeAmount = sc.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("insufficient balance");
                            System.out.println("try less than your available balance");
                        } else {
                            System.out.println("successfully taken");
                            balance = balance - TakeAmount;
                        }
                        break;

                    case 4:
                        System.out.println("Welcome To All");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited     " + AddAmount);
                        System.out.println("Amount taken         " + TakeAmount);
                        System.out.println("Thanks for coming");
                        break;
                }
                if(opt == 5){
                    System.out.println("Thank u");
                    break;
                }
            }
        }
        else{
            System.out.println("Wrong pin number");
        }
    }

}
