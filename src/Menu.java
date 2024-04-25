import java.util.Scanner;

public class Menu {

    public static void mostrar() {
        Scanner scanner = new Scanner(System.in);
        String apiKey = " https://v6.exchangerate-api.com/v6/f5c3ac1f8bc37f0d63a67351/latest/USD";

        boolean salir = false;
        while (!salir){
            mostrarMenu();

            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    Conversor.convertirPesosADolares(apiKey);
                    break;
                case 2:
                    Conversor.convertirDolaresAPesos(apiKey);
                    break;
                case 3:
                    salir = true;
                    System.out.println(" Hasta luego ");
                    break;
                default:
                    System.out.println(" Opcion no valida. Por favor digita una opcion del menu: ");
            }

        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\t " + " \t" + "\t ");
        System.out.println(" ____________' BIENVENIDOS AL MENU DE CONVERSION'_____________________");
        System.out.println("1-) --Convertir pesos colombianos a dolares");
        System.out.println("2-) --Convertir dolares a pesos colombianos");
        System.out.println("3-) ' Salir '");
        System.out.println("***Elige una opcion*** ");
    }
}
