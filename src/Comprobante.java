public class Comprobante {
    public String idTX;
    public String tipoOperacion;
    public String fechaHora;
    public String sucursal;
    public double valorRetiro;
    public double saldoResultante;


    public void comprobante(){
        System.out.println("--- Comprobante De Transaccion ---" +
                "\nID TX:" + idTX +
                "\nFecha:"+fechaHora+
                "\nOperacion:"+tipoOperacion +
                "\nSucursal"+sucursal+
                "\nValor Retiro:" +valorRetiro+
                "\nSaldo Resultante:"+saldoResultante+
                "---------------------------------------------");
    }
}
