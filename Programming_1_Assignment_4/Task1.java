import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {



        simpleInterest();
     
        
        }
        static void simpleInterest(){
            
            System.out.print("Enter Principal Amount (double value): ");
            Scanner input = new Scanner(System.in);
            double p = input.nextDouble(); 
           
            System.out.print("Enter Rate of interest per annum (double value): ");
            double r = input.nextDouble(); 
            
            System.out.print("Enter Number of years (double value): ");
            double t = input.nextDouble(); 
            input.close();
            
            double accruedAmount = p*(1+r*t);
            
            System.out.println("Simple interest is: " + accruedAmount); 
        }
         

}
   
