import java.util.Scanner;

public class Cuentas {
    public static void main(String[] args) {
        String nombre = "Elon Musk";
        String tipoDeCuenta = "Platinum";
        double saldo = 1599.99;
        int opcion = 0;


        System.out.println("*********************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + "Q" + saldo);

        System.out.println("\n*********************");
        String menu = """
                *** Escriba el numero de la accio deseada ***
                1 - Ronsultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("el saldo actualizado es: Q" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo Insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actual es: Q" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que desea depositar?");
                    double valorDepositado = teclado.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("El saldo actual es: Q" + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo, Gracias por usar LuGo banks");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }

    }
}
