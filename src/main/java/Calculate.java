import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first Number: ");
        int x = input.nextInt();

        System.out.print("Enter second Number: ");
        int y = input.nextInt();

        add(x,y);
        subtract(x,y);
    }

    public static int add(int x, int y){
        int sum = 0;

            sum = x + y;
            System.out.print("\nSum: " + sum);

        return sum;
    }

    public static int subtract(int x, int y){
        int diff = 0;

        diff = x - y;
        System.out.print("\nDifference: " + diff);

        return diff;
    }

    public static int product(int x, int y){
        int prod = 0;

        prod = x * y;
        System.out.print("\nProduct: " + prod);

        return prod;

    }

}
