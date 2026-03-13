public class Cajero {
    private String idCajero;
    private String ubicacion;
    private int retirosHoy;

    public Cajero(String idCajero, String ubicacion) {
        this.idCajero = idCajero;
        this.ubicacion = ubicacion;
        this.retirosHoy = 0;
    }

    public boolean validarRetiro(double monto) {
        if(retirosHoy >= 3) return false;
        if(monto < 20000 || monto > 400000) return false;
        retirosHoy++;
        return true;
    }

    public void registrarOperacion(Operacion op) {
        System.out.println("Operación registrada en cajero " + idCajero);
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
