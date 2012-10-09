/**
 * Created with IntelliJ IDEA.
 * User: nenchevn
 * Date: 10/9/12
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;

public class InputClass {

    public static void main(String[] arg){

    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = in.next();
    System.out.printf("Welcome back, %s!%n", name);
    System.out.println("Enter your age: ");
    int age = in.nextInt();
    System.out.printf("%s | %d %n", name, age);

    }
}
