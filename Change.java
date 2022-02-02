import java.sql.SQLOutput;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti pretul comenzii:");
        int pret = sc.nextInt();
        System.out.println("Introduceti o bancnota (500, 200,100,50,10,5,1):");
        int bancnotaIntrodusa = sc.nextInt();
        if (bancnotaIntrodusa == 500 ||
                bancnotaIntrodusa == 200 ||
                bancnotaIntrodusa == 100 ||
                bancnotaIntrodusa == 50 ||
                bancnotaIntrodusa == 10 ||
                bancnotaIntrodusa == 5 ||
                bancnotaIntrodusa == 1) {
            if (bancnotaIntrodusa < pret) {
                System.out.println("Nu ai introdus suficienti bani.");
            } else {
                int rest = bancnotaIntrodusa - pret;
                System.out.println("Restul dvs. : " + rest);

                while (rest >= 200) {
                    System.out.print("200 ");
                    rest -= 200;
                }
                while (rest >= 100) {
                    System.out.print("100 ");
                    rest -= 100;
                }
                while (rest >= 50) {
                    System.out.print("50 ");
                    rest -= 50;
                }
                while (rest >= 10) {
                    System.out.print("10 ");
                    rest -= 10;
                }
                while (rest >= 5) {
                    System.out.print("5 ");
                    rest -= 5;
                }
                while (rest >= 1) {
                    System.out.print("1 ");
                    rest -= 1;
                }
            }
        } else {
            System.out.println("Nu ai introdus o bancnota existenta.");
        }
    }
}
