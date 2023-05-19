import java.util.Scanner;  
public class Task4{  
	public static void main(String args[]){ 
                
                leapYear();

            }       
            

                static void leapYear(){

                Scanner input = new Scanner(System.in);
                int num;
    
                do{
                System.out.println("Enter a year between 1800 and 2200");
                num = input.nextInt();
                }while(num < 1800 || num >2200);
            
                System.out.println("Year entered: " + num);

                if (num%4 == 0 && num%100 != 0){
                        System.out.println("is a leap year");
                }   
                else if (num%400 == 0) {
                        System.out.println("is a leap year");
                }
                else{
                        System.out.println("is NOT a leap year");
                }
                       
                        input.close();
                }
        }


