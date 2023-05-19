import java.util.Scanner;
class Task6 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in); 
            
            System.out.println("Enter a whole number for minimum range: ");
            int min = input.nextInt(); 
    
            System.out.println("Enter a whole number for maximum range: ");
            int max = input.nextInt(); 

            input.close();
            sum(min, max);
         
    }

            static void sum (int min, int max){
            float sum = 0;
            int r = 0;
            
            
            r = max-min;
            System.out.println("Range is from " + min + " to " +max);
            System.out.println(" ");
                for (int j=min; j<=max; j++){
                    
                if(min<max-1){
                min+=2;
               
                System.out.println(j + "/" + min);
                sum += (float)j/min;
                System.out.println("Division is: " + (float)j/min);
                
                j++;
                }
               
                
            }
    
            System.out.println("Sum is: " + (float)sum);
            
        }

}