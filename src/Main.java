import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Liczenie pierwiastków wielomianu");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj stopień wielomianu");
        int stopienWielomianu = scanner.nextInt();

        double[] arrayElements = new double[stopienWielomianu+1];

        for(int i = 0; i<arrayElements.length; i++){
            int x = i+1;
            System.out.println("Podaj element " + x + " wielomianu");
            double liczbaWielomianu = scanner.nextDouble();
            arrayElements[i] = liczbaWielomianu;
        }

        System.out.println("Podaj pierwiastek wielomianu do sprawdzenia");
        double root = scanner.nextDouble();

        boolean sprawdzPierwiastek = isRoot(root,arrayElements);
        if(sprawdzPierwiastek) System.out.println("Pierwiastek: " + root + " jest pierwiastkiem wielomianu");
        else System.out.println("Pierwiastek: " + root + " nie jest pierwiastkiem wielomianu");
    }
    public static boolean isRoot(double root, double[] arrayElements) {
        double result = 0;
        int arraySize = arrayElements.length;
        for(int i = 0; i<arraySize; i++) {
            result += arrayElements[i] * Math.pow(root, arraySize - i - 1);
        }
            if(result==0){
                return true;
            }
            else{
                return false;
            }

    }
}