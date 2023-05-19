import java.util.Scanner;
class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.println("Enter a floating number for the meal cost:");
        float mealCost = input.nextFloat();   
        
        System.out.println("Enter a floating number for the tip percent:");
        float tipPercent = input.nextFloat();   

        float tip = tipPercent/100f;
        float totalTip = tip*mealCost;
        float totalBill = totalTip + mealCost;

        System.out.println("The meal cost is: " + mealCost);
        System.out.println("The tip percent is: " + tipPercent);
        System.out.println("The total tip is: " + totalTip);
        System.out.println("The total bill is: " + totalBill);

        input.close();
    }
}