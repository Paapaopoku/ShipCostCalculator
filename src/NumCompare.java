import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 =in.nextInt();
        if (num1 == num2 )
        {
            in.nextLine();
            System.out.println("The two number you entered are equal");
        }
        else if(num1 > num2)
        {
            in.nextLine();
            System.out.println("Your first number " + num1 + " is greater than " + num2);
        }
        else if(num1 < num2)
        {
            in.nextLine();
            System.out.println("Your first number " + num1 + " is less than " + num2);
        }
    }
}
