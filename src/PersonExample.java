import java.util.*;
import com.home.javabegin.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created with IntelliJ IDEA.
 * User: nenchevn
 * Date: 10/11/12
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonExample {

    public static void main(String[] args) throws Exception {


        /*
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(1980,Calendar.SEPTEMBER,03);
        System.out.println(calendar.getTime());
        //calendar.set(1995,10,29); // Date set to 29th November 1999

        Person np1 = new Person("Nikolay Nenchev",null,32,calendar.getTime());
        np1.displayPersonDetails();
        */
        Person np2 = new Person("Nikolay Nenchev",21,null,"NL","Utrecht","Road lane",32);
        System.out.println("##################################################");
        np2.displayPersonDetails();
        System.out.println(np2.getAddress());
        np2.setCity("SOFIA");
        System.out.println(np2.getCity());

        System.out.println(np2.getAddress());

        Person np3 = new Person();
        System.out.println(np3.getAddress().toString());


        if(!np3.getAddress().equals(np3.getAddress())){
            System.out.println("greshka!!!");
        }

        Random radNumber = new Random();
        np3.setAge(radNumber.nextInt(100));
        System.out.println(np3.getAge());
        /*
        np3.getName();
        np3.getAddress();

        if (np3 instanceof Address)    {
            Address p = (Address) np3;
            System.out.println(p.getAddress());
            System.out.println(p.getClass().toString());
            System.out.println(p.toString());
            System.out.println(p.hashCode());
        }
          */


        /*
        Employee emp1 = new Employee("Nikolay",32,"CEO","BOSS");
        System.out.println(emp1.getEmployee());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getPosition());
          */




        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = in.nextLine();

        int age;
        do {
            System.out.print("Please enter your age [1-149]: ");
            while (!in.hasNextInt()) {
                System.out.println("That's not a valid integer number!");
                System.out.print("Try again:!");
                in.next();
            }
            age = in.nextInt();
        } while (!(age > 0 && age < 150));

        System.out.println("Enter Address: ");
        String address = in.nextLine();

        Person np3 = new Person("");
        np3.displayPersonDetails();
              */

        /*
        np1.sayPerson("who's the best!!!");
        np1.setName("NN");
        np1.sayPerson("test","test1111");
        */

        /*
       Person np = new Person();
       np.setName("nikolay");
       np.setAge(32);

        if(np.getAge() > 30 ){
          System.out.println("He is an old person!!!");
        }

       System.out.println(np.getName().toUpperCase());
       */
    }
}
