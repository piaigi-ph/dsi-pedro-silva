import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Horas trabalhadas por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Dias trabalhados no mês: ");
        int dias = scanner.nextInt();

        double totalHoras = horasPorDia * dias;

        System.out.print("Quanto você recebe por hora? ");
        double valorHora = scanner.nextDouble();

        System.out.print("Quanto tempo de serviço você tem? ");
        int tempoDeServico = scanner.nextInt();

        // salário bruto
        double salarioBruto = totalHoras * valorHora;

        // descontos
        double inss = salarioBruto * 0.085;

        double impostoRenda = 0;

        if (salarioBruto > 1500) {
            impostoRenda = salarioBruto * 0.15;

        } else if (salarioBruto >= 500 && salarioBruto <= 1500) {
            impostoRenda = salarioBruto * 0.08;
        }

        double totalDescontos = inss + impostoRenda;

        // salário líquido
        double salarioLiquido = salarioBruto - totalDescontos;

        // adicional
        double adic = 0;

        if (idade <= 40) {
            adic = salarioBruto * 0.20;

        } else if (tempoDeServico > 15) {
            adic = salarioBruto * 0.35;

        } else if (tempoDeServico > 5 && tempoDeServico <= 15 && idade > 30) {
            adic = salarioBruto * 0.15;
        }

        salarioLiquido += adic;

        // bonificação por filhos
        System.out.print("Você tem filhos? (true/false): ");
        boolean temFilhos = scanner.nextBoolean();

        if (temFilhos) {

            System.out.print("Quantos filhos você tem? ");
            int filhos = scanner.nextInt();

            double bonificacao = filhos * 50;

            salarioLiquido += bonificacao;
        }

        // resultados
        System.out.println("\n===== RESULTADO =====");

        System.out.println("Funcionário: " + nome);

        System.out.println("Salário Bruto: R$ " + salarioBruto);

        System.out.println("INSS: R$ " + inss);

        System.out.println("Imposto de Renda: R$ " + impostoRenda);

        System.out.println("Total de Descontos: R$ " + totalDescontos);

        System.out.println("Adicional: R$ " + adic);

        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}