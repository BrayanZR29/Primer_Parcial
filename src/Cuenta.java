public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public Cuenta(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if(monto >= 20000 && monto <= 400000 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }
}
