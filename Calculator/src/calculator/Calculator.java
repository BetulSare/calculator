
package calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter first integer: ");
        int n1 = scan.nextInt();
        System.out.print("please enter second integer: ");
        int n2 = scan.nextInt();

        System.out.print("1-toplama \n2-çıkarma \n3-çarpma \n4-bölme \nplease select an operation:");
        int operation = scan.nextInt();
        int resault=0;
        switch (operation) {
            case 1:
                resault = n1 + n2;
                break;
            case 2:
                resault = n1 - n2;
                break;
            case 3:
                resault = n1 * n2;
                break;
            case 4:
                resault = n1 / n2;
                break;

        }
        System.out.printf("The resault is: %d",resault);

    }

}
