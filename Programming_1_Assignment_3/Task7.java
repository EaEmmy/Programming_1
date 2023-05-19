import java.util.Scanner;  
public class Task7{  
	public static void main(String args[]){ 
        
		Scanner input = new Scanner(System.in); 
		int total = 0;
        
		for (int i = 1; i < 11; i += 1){ 
            System.out.println("Enter a whole positive number " + i);
	        int num = input.nextInt();
            
            total += num;
            
            while (num < 0){
                System.out.println("Invalid. Please enter a positive number.");   
                i--;
                break;  
            }

            if (i==10){
            System.out.println("The total is = " + total);
            int average = total/10;
            System.out.println("The average of the 10 numbers entered is: " + average);
            }
        }
            input.close();
    }
     
}
