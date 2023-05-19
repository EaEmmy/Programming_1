class gradebook{

    double maths;
    double science; 
    double language;  
     

    
    double calculateTotal(){
        return maths+science+language; 
    }
    double calculatePercentage(){
        double percent = maths+science+language;
        return percent/300*100;

        
    }
    boolean finalGrade(){
        if (calculatePercentage() < 60){
            System.out.println("FAIL");
            return true; 
        }
         else{
          System.out.println("PASS");
          return false;
         }
        
    }

    gradebook(double m, double s, double l){
        maths = m;
        science = s;
        language = l;
    }
}


public class Task5 {
    public static void main(String[] args) {

        gradebook S01 = new gradebook(80, 79, 90 );
        System.out.println("Total grade of student 01 is: " + S01.calculateTotal());
        System.out.println("Percentage of student 01 is: " + S01.calculatePercentage());
        S01.finalGrade();
        System.out.println(" ");


     

        gradebook S02 = new gradebook(82, 83, 92 );
        System.out.println("Total grade of student 02 is: " + S02.calculateTotal());
        System.out.println("Percentage of student 02 is: " + S02.calculatePercentage());
        S02.finalGrade();
        System.out.println(" ");


    

        gradebook S03 = new gradebook(60, 50, 39 );
        System.out.println("Total grade of student 03 is: " + S03.calculateTotal());
        System.out.println("Percentage of student 03 is: " + S03.calculatePercentage());
        S03.finalGrade();


    }

}
      