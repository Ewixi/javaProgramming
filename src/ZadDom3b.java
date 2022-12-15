import java.util.Arrays;

public class ZadDom3b {
    public static void main(String[] args) {
        Integer[] liczby = new Integer[] {1,3,5};
       /*System.out.println(liczby[0]);
        System.out.println(liczby[1]);
        System.out.println(liczby[2]);*/

       /* System.out.println(liczby[2]);
        System.out.println(liczby[1]);
        System.out.println(liczby[0]);*/

        /*for (int i =liczby.length-1; i>=0 ;i = i-1){
            System.out.println(liczby[i]);*/

        for (int i = 0; i<(liczby.length/2);i++) {
            int temp = liczby[i]; // dla i = 0 1 i=1 3
            liczby[i] = liczby[liczby.length - 1 - i]; // 4 -> 0 3 => 7
            liczby[liczby.length - 1 - i] = temp; // 1 // liczby[3] = 3
             System.out.println("Iteracja numer "+ i);
        }
        for(int i =0; i < liczby.length; i++) {
            System.out.println(liczby[i]);



        }



    }
}
