import java.util.Scanner;  
public class Task3{  
	public static void main(String args[]){ 
        
		    Scanner input = new Scanner(System.in); 
    
            System.out.println("Enter a whole number ");
	        int num = input.nextInt();

            if (num%2 == 0 && num>0){
            System.out.println("The number is even & positive: " + num);
            }
            else if (num%2 != 0 && num>0){
            System.out.println("The number is odd & positive: " + num);
            }
            else if (num%2 != 0 && num<0){
            System.out.println("The number is odd & negative: " + num);
            }
            else if (num%2 == 0 && num<0){
            System.out.println("The number is even & negative: " + num);
            }
            else if (num == 0){
            System.out.println("The number is 0 ");
            }

            //odd & positive, even & positive, odd & negative, even & negative or 0. 
            
            input.close();
      } 
      
}
       
     
    