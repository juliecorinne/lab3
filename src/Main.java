import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        int i;
        String userInput;

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Please enter a number: ");
            n = scan.nextInt();

            System.out.printf("%-12s%-12s%s\n", "Number:","Squared:","Cubed:");
            System.out.printf("%-12s%-12s%s\n", "=======","========","======");

                for (i = 1; i <= n; i++) {

                System.out.printf("%-12d%-12d%-7d\n",i,i*i,i*i*i);

                }

            System.out.println();
            System.out.println("Would you like to continue? yes/no");
            scan.nextLine();
            userInput = scan.nextLine();
        } while (userInput.equalsIgnoreCase("yes"));

    }

}
