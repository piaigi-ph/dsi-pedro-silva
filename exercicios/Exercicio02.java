import java.util.Scanner;

public class Exercicio02 {  

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Quanto tempo você trabalha aqui? ");
        int tempoTrabalho = scanner.nextInt();

        scanner.nextLine(); // limpa o ENTER

        System.out.print("Digite seu sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Digite seu salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        double bonus = 0;

        if (sexo.equalsIgnoreCase("masculino") && tempoTrabalho >= 15) {

            bonus = salarioBruto * 0.20;

        } else if (sexo.equalsIgnoreCase("masculino") && tempoTrabalho >= 10) {

            bonus = salarioBruto * 0.25;

        } else {

            bonus = 100.0;
        }

        double salarioFinal = salarioBruto + bonus;

        System.out.println("\n===== RESULTADO =====");

        System.out.println("Funcionário: " + nome);

        System.out.println("Salário bruto: R$ " + salarioBruto);

        System.out.println("Bônus: R$ " + bonus);

        System.out.println("Salário final: R$ " + salarioFinal);

        scanner.close();
    }
}  