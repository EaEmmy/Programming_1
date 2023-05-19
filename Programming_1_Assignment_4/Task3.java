import java.util.Scanner;
public class Task3{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            
            int userArray[] = new int[5];
            
            for(int a=0 ; a < 5 ; a++){
                System.out.println("Enter a number: ");
               userArray[a] = input.nextInt();
            }
            
            System.out.println("Array values are: ");
            for(int v:userArray){
                System.out.print(v + " ");
            }  
    
            System.out.println(" ");

            ////////////

            
            System.out.print("Reverse array:");
            for (int i = userArray.length - 1; i >= 0; i--) {

            int revArray[] = new int [5];
            revArray = userArray;
            System.out.print(" " + revArray[i]);
            }
            input.close();
        }
    }