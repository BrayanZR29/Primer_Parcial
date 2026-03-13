
import java.time.LocalDateTime;

public class Comprobante {
        private String idTx;
        private String tipoOperacion;
        private LocalDateTime fechaHora;
        private String sucursal;
        private double valorRetiro;
        private double saldoResultante;

        public Comprobante(String idTx, String tipoOperacion, LocalDateTime fechaHora,
                           String sucursal, double valorRetiro, double saldoResultante) {
            this.idTx = idTx;
            this.tipoOperacion = tipoOperacion;
            this.fechaHora = fechaHora;
            this.sucursal = sucursal;
            this.valorRetiro = valorRetiro;
            this.saldoResultante = saldoResultante;
        }


    public void comprobante(){
        System.out.println("--- Comprobante De Transaccion ---" +
                "\nID TX:" + idTx +
                "\nFecha:"+fechaHora+
                "\nOperacion:"+tipoOperacion +
                "\nSucursal"+sucursal+
                "\nValor Retiro:" +valorRetiro+
                "\nSaldo Resultante:"+saldoResultante+
                "\n---------------------------------------------");
    }

    public void imprimir() {
        System.out.println("=== Comprobante ===");
        System.out.println("ID TX: " + idTx);
        System.out.println("Tipo: " + tipoOperacion);
        System.out.println("Fecha/Hora: " + fechaHora);
        System.out.println("Sucursal: " + sucursal);
        if(tipoOperacion.equalsIgnoreCase("RETIRO")) {
            System.out.println("Valor Retiro: $" + valorRetiro);
        }
        System.out.println("Saldo Resultante: $" + saldoResultante);
    }

    public void mostrarDetalle() {
        imprimir();
    }
}
