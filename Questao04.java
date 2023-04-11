import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        if (numero%2 == 0){
            double resultado = Math.cbrt(numero);
            System.out.println("A raiz cubica de " + numero + " eh: " + resultado);
        }else{
            double resultado = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " eh: " + resultado);
        }

        input.close();
    }

}