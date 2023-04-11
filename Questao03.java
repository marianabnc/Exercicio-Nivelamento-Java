import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do numero: ");
        double numero = input.nextDouble();

        System.out.println("Informe uma das opcoes:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciacao");
        System.out.println("6 - Raiz quadrada");
        System.out.println("7 - Raiz cubica");
        System.out.println("8 - Todas as operacoes");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor do segundo numero: ");
                double numero2 = input.nextDouble();
                double resultado = soma(numero, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                System.out.print("Digite o valor do segundo numero: ");
                numero2 = input.nextDouble();
                resultado = subtracao(numero, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                System.out.print("Digite o valor do segundo numero: ");
                numero2 = input.nextDouble();
                resultado = multiplicacao(numero, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                System.out.print("Digite o valor do segundo numero: ");
                numero2 = input.nextDouble();
                if (numero2 == 0) {
                    System.out.println("Erro: divisao por zero.");
                    break;
                }
                resultado = divisao(numero, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            case 5:
                System.out.print("Digite o valor do expoente: ");
                int expoente = input.nextInt();
                resultado = Math.pow(numero, expoente);
                System.out.println("Resultado: " + resultado);
                break;
            case 6:
                resultado = Math.sqrt(numero);
                System.out.println("Resultado: " + resultado);
                break;
            case 7:
                resultado = Math.cbrt(numero);
                System.out.println("Resultado: " + resultado);
                break;
            case 8:
                System.out.print("Digite o valor do segundo numero: ");
                numero2 = input.nextDouble();
                resultado = soma(numero, numero2);
                System.out.println("Soma: " + resultado);

                resultado = subtracao(numero, numero2);
                System.out.println("Subtracao: " + resultado);

                resultado = multiplicacao(numero, numero2);
                System.out.println("Multiplicacao: " + resultado);
                if (numero2 != 0) {
                    resultado = divisao(numero, numero2);
                    System.out.println("Divisao: " + resultado);
                }

                System.out.print("Digite o valor do expoente: ");
                expoente = input.nextInt();
                resultado = Math.pow(numero, expoente);
                System.out.println("Potenciacao: " + resultado);

                resultado = Math.sqrt(numero);
                System.out.println("Raiz quadrada: " + resultado);

                resultado = Math.cbrt(numero);;
                System.out.println("Raiz cubica: " + resultado);
                break;
            default:
                System.out.println("Operacao invalida!");
        }

        input.close();
    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }
}
