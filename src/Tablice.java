public class Tablice {
    public static void main(String[] args) {
      /*  String [] imiona = new String[3];
        imiona[0] = "Bartek";
        imiona[1] = "Basia";
        imiona[2] = "Michał";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);*/

        int[] lottoNumbers = new int[]{1, 2, 3, 4, 5, 6};
      /*  System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println(lottoNumbers.length);*/
// pętla nie nawiązująca do tabeli
     /*   for(int i=1; i<=6; i++) {
            System.out.println(i);*/
        //pętla nawiązująca do tabeli

        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
        }
    }
}
