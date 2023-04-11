import java.util.Scanner;

public class Questao02  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = input.nextDouble();

        System.out.println("Digite a escala (Celsius, Fahrenheit ou Kelvin): ");
        String escala = input.next();

        switch (escala) {
            case "Celsius":
                System.out.println("Temperatura em Fahrenheit: " + (temperatura * 1.8 + 32));
                System.out.println("Temperatura em Kelvin: " + (temperatura + 273.15));
                System.out.println("Temperatura em Celsius: " + temperatura);
                break;
            case "Fahrenheit":
                System.out.println("Temperatura em Fahrenheit: " + temperatura);
                System.out.println("Temperatura em Celsius: " + ((temperatura - 32) / 1.8));
                System.out.println("Temperatura em Kelvin: " + ((temperatura + 459.67) / 1.8));
                break;
            case "Kelvin":
                System.out.println("Temperatura em Celsius: " + (temperatura - 273.15));
                System.out.println("Temperatura em Fahrenheit: " + (temperatura * 1.8 - 459.67));
                System.out.println("Temperatura em Kelvin: " + temperatura);
                break;
            default:
                System.out.println("Escala inválida!");
        }
    }
}