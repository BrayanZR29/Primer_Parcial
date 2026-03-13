public class Cliente {
    private String id;
    private String nombre;
    private String numeroDocumento;
    private Cuenta cuenta;
    private Seguridad seguridad;

    public Cliente(String id, String nombre, String numeroDocumento, Cuenta cuenta, Seguridad seguridad) {
        this.id = id;
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.cuenta = cuenta;
        this.seguridad = seguridad;
    }

    public boolean validarClave(String clave) {
        return seguridad.validarClave(clave);
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public Seguridad getSeguridad() {
        return seguridad;
    }
}
