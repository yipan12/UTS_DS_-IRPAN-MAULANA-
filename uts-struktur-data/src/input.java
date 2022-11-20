import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayuser[] = new int[10];

        for (int i = 0; i < arrayuser.length; i++) {

            arrayuser[i] = in.nextInt();
        }
        System.out.println("Nilai array nya yaitu : ");
        for (int i = 0; i < arrayuser.length; i++) {
            System.out.print(arrayuser[i] + ", ");
        }
        System.out.println("");
        System.out.println("sesudah di sorting");
        for(int lastUnsortedIndex = arrayuser.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(arrayuser[i] > arrayuser[i + 1]){
                    swap(arrayuser, i , i+ 1);
                }
            }
        }
        for( int i = 0; i < arrayuser.length; i++){
            System.out.println(arrayuser[i]);
        }

    }
    public static void swap (int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
