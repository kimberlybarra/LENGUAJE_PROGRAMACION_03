package actividades;

import java.util.Scanner;

public class actividad5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuenta[] cuentas = new Cuenta[10];
        cuentas[0] = new CuentaAhorro(1000, 0.03, 500);
        cuentas[1] = new CuentaAhorro(1100, 0.03, 500);
        cuentas[2] = new CuentaAhorro(1200, 0.03, 500);
        cuentas[3] = new CuentaAhorro(1300, 0.03, 500);
        cuentas[4] = new CuentaAhorro(1400, 0.03, 500);
        
        cuentas[5] = new CuentaCorriente(500, 3);
        cuentas[6] = new CuentaCorriente(600, 3);
        cuentas[7] = new CuentaCorriente(700, 3);
        cuentas[8] = new CuentaCorriente(800, 3);
        cuentas[9] = new CuentaCorriente(900, 3);

        while (true) {
            System.out.println("===========MENU===========");
            System.out.println("D)epositar");
            System.out.println("R)etirar");
            System.out.println("C)onsultar");
            System.out.println("S)alir");
            System.out.print("elija una opcion: ");
            String opcion = scanner.nextLine().toUpperCase();

            if (!opcion.equals("D") && !opcion.equals("R") && !opcion.equals("C") && !opcion.equals("S")) {
                System.out.println("opción no valida, elija D, R, C o S");
                continue;
            }

            if (opcion.equals("S")) {
                break;
            }

            System.out.print("ingrese el numero de cuenta, de 0 a 4 para cuenta de ahorro y de 5 a 9 para cuenta corriente (solo un valor): ");
            int numCuenta = scanner.nextInt();

            if (numCuenta < 0 || numCuenta >= cuentas.length) {
                System.out.println("numero no valido.");
                scanner.nextLine(); // Limpiar buffer
                continue;
            }

            Cuenta cuentaSeleccionada = cuentas[numCuenta];

            switch (opcion) {
                case "D":
                    System.out.print("ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    if (montoDeposito <= 0) {
                        System.out.println("debe ser mayor de 0 ");
                    } else {
                        cuentaSeleccionada.depositar(montoDeposito);
                    }
                    break;

                case "R":
                    System.out.print("ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    cuentaSeleccionada.retirar(montoRetiro);
                    break;

                case "C":
                    System.out.println("El saldo es:  " + cuentaSeleccionada.consultar());
                    break;
            }
            System.out.println();
            scanner.nextLine();
        }
        scanner.close();
    }
}
