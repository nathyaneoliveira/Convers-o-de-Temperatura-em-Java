import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        double kelvin = celsius + 273.15;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin);

        scanner.close();
    }

}
