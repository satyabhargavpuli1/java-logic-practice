import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Goal: Ask user their name and time (morning/afternoon/evening), and greet them
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        
        String name = sc.nextLine().toLowerCase();
           System.out.println("Enter the time (morning/afternoon/evening)");
           String time = sc.nextLine().toLowerCase();
           
           if(time.equals("morning") ){
               System.out.println("Hey" +" "+name +" "+"its"+ " "+time );
           }
           else if(time.equals("afternoon")){
                System.out.println("Hey" +" "+name +" "+"its"+ " "+time );
           }
           else if(time.equals("evening")){
                System.out.println("Hey" +" "+name +" "+"its"+ " "+time );
           }
           else {
               System.out.println("Hey" +" "+name +" "+"its"+ "! " );
           }
           
     
        sc.close();
         }
}
