import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de salarios: ");
        int salarios = sc.nextInt();
        double sumaSalarios = 0;
        
        // for (int i = 1; i <= salarios; i++) {
        //     System.out.println("Salario del empleado: ");
        //     double salarioEmpleado = sc.nextDouble();
        //     sumaSalarios = sumaSalarios + salarioEmpleado;
        // }

        // int i = 1;
        // while (i <= salarios) {
        //     System.out.println("Salario del empleado: ");
        //     double salarioEmpleado = sc.nextDouble();
        //     sumaSalarios += salarioEmpleado;
        //     i++;
        // }

        int i = 1;
        do {
            System.out.println("Salario del empleado: ");
            double salarioEmpleado = sc.nextDouble();
            sumaSalarios += salarioEmpleado;
            i++;
        } while (i <= salarios);

        System.out.println("Cantidad de salarios: " + salarios);
        System.out.println("El promedio salarial es: " + (sumaSalarios/salarios));
    }
}
