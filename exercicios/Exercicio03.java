import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        double temp;

        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        if (c > a) {
            temp = a;
            a = c;
            c = temp;
        }

        if (c > b) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("\nLados em ordem decrescente:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);

        if (a >= b + c) {

            System.out.println("Não formam um triângulo.");

        } else {

            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {

                System.out.println("Triângulo Retângulo.");

            } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {

                System.out.println("Triângulo Obtusângulo.");

            } else {

                System.out.println("Triângulo Acutângulo.");
            }

            if (a == b && b == c) {

                System.out.println("Triângulo Equilátero.");

            } else if (a == b || a == c || b == c) {

                System.out.println("Triângulo Isósceles.");
            }
        }

        scanner.close();
    }
}