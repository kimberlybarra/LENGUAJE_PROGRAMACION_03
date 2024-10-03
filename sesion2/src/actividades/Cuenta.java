package actividades;

public class Cuenta {
	protected double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if(monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if(monto > 0 && saldo >= monto) {
            saldo -= monto;
        }
    }

    public double consultar() {
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
