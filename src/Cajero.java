public class Cajero {
    public String idcajero;
    public String ubicacion;
    public int retirosHoy;

   Cuenta cuenta = new Cuenta();

    public double validarRetiro(double monto){
        return monto;
    }

    public void registrarOperacion(){
        cuenta.consultar();
    }
    public void menu(){
        System.out.println("");
    }
}
