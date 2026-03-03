import java.util.Scanner;

public class DivisibleBy18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean div2 = num % 2 == 0;

        int temp = num;
        int sum = 0;

        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        boolean div9 = sum % 9 == 0;

        if(div2 && div9)
            System.out.println(num + " is divisible by 18");
        else
            System.out.println(num + " is not divisible by 18");
    }
}
