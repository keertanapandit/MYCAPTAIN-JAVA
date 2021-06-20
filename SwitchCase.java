
package switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
       int choice;
       System.out.println("Enter your choice:1.Hey\t 2.Hi\t 3.Hello\t");
       Scanner s= new Scanner(System.in);
       choice=s.nextInt();
       switch(choice){
           case 1: System.out.println("You chose Hey");
           break;
           case 2: System.out.println("You chose Hi");
           break;
           case 3: System.out.println("You chose Hello");
           break;
                
       }
    }
    
}
