import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: nenchevn
 * Date: 10/11/12
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayDemo {
        public static void main ( String [ ] args ) {
        int[] anArray ; // declares an array of integers

        anArray = new int[10] ; // allocates memory for 10 integers

        anArray [ 0 ] = 100; // initialize first element
        anArray [ 1 ] = 200; // etc.
        anArray [ 2 ] = 300; // etc .

         System . out . println ( "Element at index 0 : " + anArray [ 0 ] ) ;
         System . out . println ( "Element at index 1 : " + anArray [ 1 ] ) ;
         System . out . println ( "Element at index 2 : " + anArray [ 2 ] ) ;

         Arrays.sort(anArray);
         System.out.println(Arrays.toString(anArray));

            int zx = 1000;
            if (Arrays.binarySearch(anArray,zx) > 0){
                System.out.println("100 e v masiv anArray");
            }
            else{
                System.out.println(zx + " ne e v masiva");
            }


         String [] names = { "Pesho", "Gosho", "Ivan" };
         System.out.println(names.length);
         System.out.println(Arrays.toString(names));

         for (int i=0; i < (names.length) ; i++) {
              System.out.printf("Name : %s%n", names[i]);
              }
         }
     }

