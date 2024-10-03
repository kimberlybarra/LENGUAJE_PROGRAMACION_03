package actividades;

public class CuentaCorriente extends Cuenta{
	private int retiros;

    public CuentaCorriente(double saldoInicial, int retiros) {
        super(saldoInicial);
        this.retiros = retiros;
    }

    public void retirar(double monto) {
        final int LIBRE_RETIROS = 3;
        final double TARIFA_TRANSACCION = 3.5;
        super.retirar(monto);
        retiros++;
        if (retiros > LIBRE_RETIROS) {
            super.retirar(TARIFA_TRANSACCION);
            System.out.println("Se ha cobrado una tarifa de transacción de " + TARIFA_TRANSACCION);
        }
    }

    public double consultar() {
        retiros = 0;
        return getSaldo();
    }

}
