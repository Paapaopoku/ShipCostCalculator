import java.util.Scanner;

public class BMon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthMonth = 0;

        System.out.print("Enter your birth month number [1 - 12]: ");
        birthMonth = in.nextInt();

        if (birthMonth <= 12 && birthMonth > 0)
        {
            in.nextLine();
            System.out.println("You said your birth month is: " + birthMonth);
        }
        else
        {
            in.nextLine();
            System.out.println("You entered an incorrect month value");
        }

    }

}