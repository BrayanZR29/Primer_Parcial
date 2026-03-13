import java.time.LocalDateTime;

public class Operacion {
    private String tipoOperacion;
    private double monto;
    private LocalDateTime fechaHoraOperacion;
    private Cuenta cuenta;

    public Operacion(String tipoOperacion, double monto, Cuenta cuenta) {
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
        this.fechaHoraOperacion = LocalDateTime.now();
        this.cuenta = cuenta;
    }

    public boolean ejecutar() {
        if(tipoOperacion.equalsIgnoreCase("RETIRO")) {
            return cuenta.retirar(monto);
        } else if(tipoOperacion.equalsIgnoreCase("CONSULTA")) {
            return true;
        }
        return false;
    }

    public Comprobante generarComprobante(String idTx, String sucursal) {
        return new Comprobante(
                idTx,
                tipoOperacion,
                fechaHoraOperacion,
                sucursal,
                monto,
                cuenta.consultarSaldo()
        );
    }
}
