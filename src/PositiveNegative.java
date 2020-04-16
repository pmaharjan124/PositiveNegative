import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args)

    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();


        if (num == 0) {
            System.out.println("It is zero");
        } else if (num > 0) {
            System.out.println("It is Positive");
        } else {
            System.out.println("It is Negative");

        }

    }
}

