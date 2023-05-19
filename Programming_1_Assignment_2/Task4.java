import java.util.Scanner;
class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        String result;
        result = ((num%2 == 0) ? "The given number is even" : "The given number is odd");
        System.out.println(result);

        input.close();
    }
}