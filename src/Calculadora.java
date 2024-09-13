import java.util.Scanner;

class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Selecciona que tipo de operacion deseas realizar (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        Operacion op;

        switch (operacion) {
            case '+':
                op = new Suma(numero1, numero2);
                break;
            case '-':
                op = new Resta(numero1, numero2);
                break;
            case '*':
                op = new Multiplicacion(numero1, numero2);
                break;
            case '/':
                op = new Division(numero1, numero2);
                break;
            default:
                System.out.println("Operación no válida");
                return;
        }

        System.out.println("El resultado es: " + op.calcular());
    }
}

