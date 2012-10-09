/**
 * Created with IntelliJ IDEA.
 * User: nenchevn
 * Date: 10/9/12
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;
import  java.io.*;

public class InputClass {

    public static void main(String[] arg) throws
            FileNotFoundException {
    /*
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = in.next();
    System.out.printf("Welcome back, %s!%n", name);
    System.out.println("Enter your age: ");
    int age = in.nextInt();
    System.out.printf("%s | %d %n", name, age);
      */
        File someFile = new File ("someFile .txt");
        PrintWriter pw = new PrintWriter ( someFile );
        pw.write ("One \n");
        pw.write ("Two \n");
        pw.write ("Three \n");
        pw.flush ();
        Scanner infile = new Scanner ( someFile );
        System.out.println (infile.nextLine ());
        System.out.println (infile.nextLine ());
        System.out.println (infile.nextLine ());
        pw.close();
    }
}
