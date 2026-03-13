public class Seguridad {
    private String clave;

    public Seguridad(String clave) {
        this.clave = clave;
    }

    public boolean validarClave(String claveIngresada) {
        return clave.equals(claveIngresada);
    }

    public void cambiarClave(String nuevaClave) {
        this.clave = nuevaClave;
    }
}
