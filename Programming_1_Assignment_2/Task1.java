import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.println("Enter a floating number: ");
        float num = input.nextFloat();   
        
        int quotient = (int) num;

        System.out.println("You entered: " + quotient);
     
        input.close();
    }
}