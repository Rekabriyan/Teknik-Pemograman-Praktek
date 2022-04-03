/*
Nama    : Reka Briyan Cahya Heryana
Kelas   : D4-1A Teknik Informatika
 */
package strings;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
      
       //untuk scanner baru
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        
        System.out.println(A.length()+B.length());
        if ((A.compareTo(B) > 0)){
            System.out.println("Yes");
        }
        else if ((A.compareTo(B) < 0)){
            System.out.println("No");
        } 
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
       
    }
    
}
