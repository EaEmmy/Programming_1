import java.util.Scanner;

public class Task1 { 
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();

        System.out.println("Enter the third number: ");
        int n3 = input.nextInt();
        
        
        if(n1 >= n2 && n1 >= n3){
        System.out.println("The first number is the largest: " + n1);
        }
        else if (n2 >= n1 && n2 >= n3){
        System.out.println("The second number is the largest: " + n2);
        }   
        else{
        System.out.println("The third number is the largest: " + n3);
        }
            
          input.close();    
    }
}
  