import java.util.Locale;
import java.util.Scanner;

public class Revision {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            Locale.setDefault(Locale.US);
            int sum = 0;
            int media;
            int[] y = new int[10];
            int maior = -1;
            int menor = 1000;
            for (int i = 0; i < y.length; i++) {
                System.out.print("Enter the 10 notes:");
                y[i] = input.nextInt();
                sum += y[i];
                if (y[i] < menor) {
                    menor = y[i];
                }
                if (y[i] > maior) {
                    maior = y[i];
                }
            }
            media = sum / y.length;
            System.out.println("The Value of the Average is:" + media);
            System.out.println("The Value of the Smaller is:" + menor);
            System.out.println("The Value of the Bigger is:" + maior);
            input.close();
     }
 }

