import java.util.Scanner;  
public class Task2{  
	public static void main(String args[]){ 
        
		    Scanner input = new Scanner(System.in); 
    
            System.out.println("Enter a whole number ");
	        int num = input.nextInt();

            //2^3=8        

            if (num%3 == 0 && num%5 == 0){
            if(num%15 == 0)
            System.out.println("Number is divisible by 3, 5 and 15");
            }   

            else if (num%3 != 0 && num%5 == 0){
            if(num%15 ==0)
            System.out.println("Number is divisible by 5, 15 but not 3");
            }

            else if (num%3 == 0 && num%5 != 0){
            if(num%15 == 0)
            System.out.println("Number is divisible by 3, 15 but not 5");
            }

            else if (num%3 == 0 && num%5 == 0){
            if(num%15 !=0)
            System.out.println("Number is divisible by 3, 5 but not 15");
            }

            else if (num%3 !=0 && num%5 != 0){
            if(num%15 !=0)
            System.out.println("Number is not divisible by 3 or 5 or 15");
            }
            


            if (num%3 == 0 && num%5 != 0){
            if (num%15 !=0)
            System.out.println("Number is divisible by 3 but not by 5 or 15");
            }

            else if (num%3 !=0 && num%5 == 0){
            if(num%15 !=0)
            System.out.println("Number is divisible by 5 but not by 3 or 15");
            }

            else if (num%3 !=0 && num%5 !=0){
            if(num%15 ==0)
            System.out.println("Number is divisible by 15 but not by 3 or 5");
            }

            else if (num%3 !=0 && num%5 != 0){
            if(num%15 !=0)
            System.out.println("Number is not divisible by 3 or 5 or 15");
            }

            input.close(); 
            
    }                   
}        
    
       
     
    