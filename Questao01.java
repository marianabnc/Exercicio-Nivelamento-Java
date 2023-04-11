import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();

        switch(sobrenome){
            case "Wayne":
                System.out.println("Acesso liberado, Sr. Wayne");
                break;
            case "Kent":
                System.out.println("Sai dai, mane!");
                break;
            case "Diana":
                System.out.println("Bem-vinda, Princesa de Themyscara");
                break;
            default:
                System.out.println("Cai fora!");
                break;
        }
        teclado.close();

    }

}