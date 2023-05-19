import java.util.Scanner;
public class Task4 { 
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a whole positive number");
        int num = input.nextInt();

        //1 is neither a prime nor a composite.
        for (int i=2; i<=num; i++){
            if (num==i)
        System.out.println("The number is a prime number");   

        else if (num%i == 0){
        System.out.println("The number is not a prime number");    
        break;
            }
        }
              input.close();    
    }
}
