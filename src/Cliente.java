public class Cliente {
    public String id;
    public String nombre;
    public int numero_documento;
    public String cuenta;

    public String getCuenta() {
        return cuenta;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero_documento() {
        return numero_documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
