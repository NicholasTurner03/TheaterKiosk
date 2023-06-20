import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int Age;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your age:");
        Age = in.nextInt();

        if (Age >= 21) {
            System.out.println("You get a wristband");
        }
        else {
            System.out.println("You are under 21");
        }



    }
}
