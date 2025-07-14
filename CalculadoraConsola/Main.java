import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
 
        String opcion = "s";

        do {
           System.out.println("Bienvenido a la Calculadora, por favor ingrese el primer número:");
           double num1 = scanner.nextDouble();

           System.out.println("Por favor ingrese el operador:"); 
           char operador = scanner.next().charAt(0);
           
           System.out.println("Por favor ingrese el segundo número:");
           double num2 = scanner.nextDouble();


              double resultado = 0;

           switch (operador) {
            case '+':
                resultado = calculadora.sumar(num1, num2);
                break;
            case '-':
                resultado = calculadora.restar(num1, num2);
                break;
            case '*':
                resultado = calculadora.multiplicar(num1, num2);
                break;
            case '/':
                resultado = calculadora.dividir(num1, num2);
                break;
            default:
                System.out.println("❌ Operador no válido.");
                continue;
                
           }
           System.out.println("✅ Resultado: " + resultado);

        System.out.println("¿Desea realizar otra operación? (s/n) responder solo con 's' o 'n'");
       opcion = scanner.next();

        
        }   while (opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("si"));
;
;

        System.out.println("Gracias por usar la Calculadora. ¡Hasta luego!");
        
        scanner.close();
    }
}
