import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        double sumaSalario = 0;
        int bandera = 1; /*1 - Esta encendido, 0 - Está apagado */
        while (bandera == 1) {
            System.out.println("Ingrese su salario: ");
            double salarioempleado = sc.nextDouble();
            sumaSalario += salarioempleado;
            i++;
            System.out.println("Desea ingresar otro salario? 1 -si/2 - No: ");
            int opcion = sc.nextInt();
            if (opcion == 2) {
                bandera = 0;
            }
        }
    }
}
