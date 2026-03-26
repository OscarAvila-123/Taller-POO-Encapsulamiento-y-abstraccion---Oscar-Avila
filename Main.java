public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("12345", 1000);

        System.out.println("====== CUENTA BANCARIA ======\n");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        System.out.println("\n--- Operaciones ---");

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000); // prueba error

        System.out.println("\nSaldo final: $" + cuenta.getSaldo());
        System.out.println("\n=============================");
    }
}