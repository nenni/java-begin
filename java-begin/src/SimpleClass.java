/**
 * Created with IntelliJ IDEA.
 * User: nenchevn
 * Date: 10/9/12
 * Time: 8:23 PM
 * To change this template use File | Settings | File Templates.
 */


import java.util.*;

public class SimpleClass {

    public static void main(String[] arg){
        System.out.println("Hello Java");
        System.out.println("Hello Java");

        StringBuilder mdn = new StringBuilder();
         mdn.append("359878010228");
        System.out.println(mdn.toString());

        System.out.printf ("Today is %tc %n", new Date ());
        System.out.printf ("%15.3f%n", 333.444) ;

        String mdn1 = String.format("%s%3.2f", mdn, 2.222);
        System.out.println(mdn1);

    }
}
