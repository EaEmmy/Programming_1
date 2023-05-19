import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.println("Enter a floating Fahrenheit temperature: ");
        float F=input.nextFloat();
        System.out.println("You entered: " + F);

        float c1 = 5/9f;
        float c2 = F-32f;
        float celsius = c1*c2;

        System.out.println ("The temperature in Celsius degree is " + celsius);
       
        input.close();
    }
}