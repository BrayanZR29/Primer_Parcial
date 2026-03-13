import java.util.Scanner;
import java.util.UUID;

public class SistemaCajero {
    private Cliente cliente;
    private Cajero cajero;
    private Scanner sc;

    public SistemaCajero() {
        // Inicialización con saldo fijo y clave
        Cuenta cuenta = new Cuenta("123456", 435000, "Ahorros");
        Seguridad seguridad = new Seguridad("1234");
        cliente = new Cliente("1", "Juan Pérez", "100200300", cuenta, seguridad);
        cajero = new Cajero("C001", "Sucursal Centro");
        sc = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("=== Bienvenido a UniBankSalud ===");
        System.out.print("Ingrese su clave de 4 dígitos: ");
        String clave = sc.nextLine();

        if(!cliente.validarClave(clave)) {
            System.out.println("Clave incorrecta. Acceso denegado.");
            return;
        }

        boolean salir = false;
        while(!salir) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Cambiar clave");
            System.out.println("4. Salir");
            System.out.print("Seleccione opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1 -> consultarSaldo();
                case 2 -> retirarDinero();
                case 3 -> cambiarClave();
                case 4 -> salir = true;
                default -> System.out.println("Opción inválida.");
            }
        }
        System.out.println("Gracias por usar UniBankSalud.");
    }

    private void consultarSaldo() {
        Operacion op = new Operacion("CONSULTA", 0, cliente.getCuenta());
        op.ejecutar();
        Comprobante comp = op.generarComprobante(UUID.randomUUID().toString(), cajero.getUbicacion());
        comp.imprimir();
    }

    private void retirarDinero() {
        System.out.print("Ingrese monto a retirar: ");
        double monto = sc.nextDouble();
        sc.nextLine();

        if(!cajero.validarRetiro(monto)) {
            System.out.println("Retiro inválido. Verifique restricciones.");
            return;
        }

        Operacion op = new Operacion("RETIRO", monto, cliente.getCuenta());
        if(op.ejecutar()) {
            cajero.registrarOperacion(op);
            Comprobante comp = op.generarComprobante(UUID.randomUUID().toString(), cajero.getUbicacion());
            comp.imprimir();
        } else {
            System.out.println("No se pudo realizar el retiro. Saldo insuficiente.");
        }
    }

    private void cambiarClave() {
        System.out.print("Ingrese nueva clave de 4 dígitos: ");
        String nuevaClave = sc.nextLine();
        cliente.getSeguridad().cambiarClave(nuevaClave);
        System.out.println("Clave cambiada exitosamente.");
    }
}
