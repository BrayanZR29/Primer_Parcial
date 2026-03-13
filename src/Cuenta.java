import java.util.Scanner;

public class Cuenta {
    public int numero_cuenta;
    public double saldo;
    public String tipo_cuenta;

    Cliente cliente = new Cliente();

    public double depositar(double monto){
        return monto;
    }

    public double retirar(double monto){
        return monto;
    }

    public void consultar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\ndigite su usuario: ");
        cliente.nombre = teclado.nextLine();
        System.out.println("\ndigite su numero de documento: ");
        cliente.numero_documento = teclado.nextInt();
    }
}
