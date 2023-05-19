import java.util.Scanner;
class Task5 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in); 
            System.out.println("Enter a 3-digit whole number: ");
            int num = input.nextInt();   

            if(num < 999){
            System.out.println("The value of the 3-digit number is: " + num);

            //calculations here
            int quotient1 = num/10;
            int remainder1 = num%10;
            
            int quotient2 = quotient1/10;
            int remainder2 = quotient1%10;
            
            int reverse = (remainder1*100)+(remainder2*10)+(quotient2*1);
            
            System.out.println("The reverse of the 3-digit number is: " + reverse);

            }
            
            else{
            System.out.println("The number you input is larger than 3-digit. Please try again." );
            }
             
            input.close();
    }
}