import java.util.Scanner;

public class ReverseStrn {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    StringBuilder sb = new StringBuilder(input);
    
    String reversed = "";
    for (int i = sb.length() - 1; i >=0;i--){
        reversed =reversed+ sb.charAt(i) ;
    }
    System.out.println(reversed);
    
    sc.close();
    }
}
