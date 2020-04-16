import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args)

    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        num = sc.nextInt();
        System.out.println(" It is =" + num);
 
        if (num == 0) {
            System.out.println("given number is zero");
        } else if (num > 0) {
            System.out.println("given number is Positive");
        } else {
            System.out.println("given number is Negative");

        }

    }
}

