import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

    
    Scanner input = new Scanner(System.in); 
    
    int array[] = {1,2,3,4,5,6,7,8,9,10};
      
    System.out.print("Array numbers are: ");
    for(int d:array){  
        System.out.print(d + ",");
    }  

    System.out.println(" ");
    System.out.println("Enter a whole number: ");
    int num = input.nextInt();

    input.close();
       for(int i=0 ; i < array.length; i++){
        //for(int d:array){   
        if (i==num){
        System.out.println("The array contains the user entered number");
        }
        
        /*I'm not sure which condition to use to display ---> System.out.println("The array does not contains the user entered number");
        without having it be affected by the first for loop 

        else if (){
        System.out.println("The array does not contains the user entered number");
        break;}              
        */ 
    }
    
    
  }
}  