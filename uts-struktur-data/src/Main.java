public class Main {
    public static void main(String[] args) {
        int arrang[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("bilangan genap");
        for (int i = 0; i< arrang.length; i++){
            if (arrang[i]%2 == 0){
                System.out.println(arrang[i]);
            }
        }
        System.out.println("bilangan ganjil");
        for (int i =0; i<arrang.length; i++){
            if (arrang[i]%2!= 0){
                System.out.println(arrang[i]);
            }
        }
    }
}