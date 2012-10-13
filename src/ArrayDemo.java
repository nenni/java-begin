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
        int [ ] anArray ; // d e c l a r e s an ar ray o f i n t e g e r s

        anArray = new int[10] ; // a l l o c a t e s memory f o r 10 i n t e g e r s

        anArray [ 0 ] = 100; // i n i t i a l i z e f i r s t element
        anArray [ 1 ] = 200; // i n i t i a l i z e second element
        anArray [ 2 ] = 300; // e t c .


         System . out . println ( "Element at index 0 : " + anArray [ 0 ] ) ;
         System . out . println ( "Element at index 1 : " + anArray [ 1 ] ) ;
         System . out . println ( "Element at index 2 : " + anArray [ 2 ] ) ;

         Arrays.sort(anArray);
         System.out.println(Arrays.toString(anArray));

            if (Arrays.binarySearch(anArray,100) > 0){
                System.out.println("100 e v masiv anArray");
            }
            else{
                System.out.println("100 ne e v masiva");
            }


         String [] names = { "Pesho", "Gosho", "Ivan" };
         System.out.println(names.length);
         System.out.println(Arrays.toString(names));

         for (int i=0; i < (names.length) ; i++) {
              System.out.printf("Name : %s%n", names[i]);
              }
         }
     }

