public class Task5 {
    public static void main (String[] args){

        //upside down triangle

        for (int i = 1; i <= 4; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k=5; k>=i; k--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


        //upright triangle
        for (int p = 1; p <= 5; p++) {
            for (int q = 4; q >=p; q--) {
                System.out.print(" ");
            }
            for (int r=1; r<=p; r++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
        

