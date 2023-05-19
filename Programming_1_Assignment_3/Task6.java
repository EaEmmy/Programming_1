import java.util.Scanner;  
public class Task6{  
	public static void main(String args[]){ 
        
		Scanner input = new Scanner(System.in); 
		
        int choice;

        System.out.println("Enter a first number: ");
        int n1 = input.nextInt(); 	
    
        System.out.println("Enter a second number: ");
        int n2 = input.nextInt(); 

        do{
            System.out.println("Options: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Quotient of the Division");
            System.out.println("5. Remainder of the Division");
            System.out.println("Choose an option: ");
            choice = input.nextInt();
            }while(choice<1 || choice>5);
           
            switch(choice){
                case 1 :
                System.out.println("1. Addition: " + n1 + "+" + n2 + "=" + (n1+n2));
                break;
                case 2 :
                System.out.println("2. Subtraction: " + n1 + "-" + n2 + "=" + (n1-n2));
                break;
                case 3 :
                System.out.println("3. Multiplication: " + n1 + "*" + n2 + "=" + (n1*n2));
                break;
                case 4 :
                System.out.println("4. Quotient of the Division: " + n1 + "/" + n2 + "=" + (n1/n2));
                break;
                case 5 :
                System.out.println("5. Remainder of the Division: " + n1 + "%" + n2 + "=" + (n1%n2));
                break;
                }
             
                 input.close();
            }
       
	}
