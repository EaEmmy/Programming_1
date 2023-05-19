import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in); 

            //Grade n1
            System.out.println("Enter the first grade out of 100: ");
            int n1 = input.nextInt();   
           
            if(n1 > 100){
            System.out.println("Please enter a grade out of 100");
            }
            else{
            System.out.println("You entered for the first grade: " + n1);
            }


            //Grade n2
            System.out.println("Enter the second grade out of 100: ");
            int n2 = input.nextInt();

            if(n2 > 100){
            System.out.println("Please enter a grade out of 100");
            }
            else{
            System.out.println("You entered for the second grade: " + n2);
            }

           
            //Grade n3
            System.out.println("Enter the third grade out of 100: ");
            int n3 = input.nextInt();
            
            if(n3 > 100){
            System.out.println("Please enter a grade out of 100");
            }
            else{
            System.out.println("You entered for the third grade: " + n3);
            }

            int sum = n1+n2+n3;
            int average = sum/3; 

            if(sum <= 300){
            System.out.println("The total marks is: " + sum);
            }
            else{
            System.out.println("Invalid total marks");    
            }

            if(average <= 100){
            System.out.println("The average of three subjects is: " + average);
            }
            else{
            System.out.println("Invalid average");
            }

            input.close();
    }
}