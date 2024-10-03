package actividades;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;
    private double minSaldo;

    public CuentaAhorro(double saldoInicial, double tasaInteres, double minSaldo) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
        this.minSaldo = minSaldo;
    }

    public void setTasaInteres(double interes) {
        this.tasaInteres = interes;
    }

    public void retirar(double monto) {
        super.retirar(monto);
        if (getSaldo() < minSaldo) {
            System.out.println("Saldo por debajo del mínimo permitido.");
        }
    }

    public double consultar() {
        double interes = minSaldo * tasaInteres / 100;
        depositar(interes);
        return getSaldo();
    }
}

