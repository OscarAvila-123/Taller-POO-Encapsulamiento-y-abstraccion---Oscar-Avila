public class Main {
    public static void main(String[] args) {

        Vehiculo moto = new Moto("Yamaha");
        Vehiculo carro = new Carro("Toyota");
        Vehiculo bicicleta = new Bicicleta("GW");

        System.out.println("========== PRUEBA DE VEHÍCULOS ==========\n");

        // MOTO
        System.out.println(">> MOTO (" + moto.getMarca() + ")");
        System.out.println("Velocidad inicial: " + moto.getVelocidad());
        moto.acelerar();
        System.out.println("Acelera → " + moto.getVelocidad());
        moto.acelerar();
        System.out.println("Acelera → " + moto.getVelocidad());
        moto.frenar();
        System.out.println("Frena   → " + moto.getVelocidad());
        System.out.println("-----------------------------------------\n");

        // CARRO
        System.out.println(">> CARRO (" + carro.getMarca() + ")");
        System.out.println("Velocidad inicial: " + carro.getVelocidad());
        carro.acelerar();
        System.out.println("Acelera → " + carro.getVelocidad());
        carro.frenar();
        System.out.println("Frena   → " + carro.getVelocidad());
        System.out.println("-----------------------------------------\n");

        // BICICLETA
        System.out.println(">> BICICLETA (" + bicicleta.getMarca() + ")");
        System.out.println("Velocidad inicial: " + bicicleta.getVelocidad());
        bicicleta.acelerar();
        System.out.println("Acelera → " + bicicleta.getVelocidad());
        bicicleta.frenar();
        System.out.println("Frena   → " + bicicleta.getVelocidad());
        System.out.println("-----------------------------------------\n");

        System.out.println("=========== FIN DE LA PRUEBA ===========");
    }
}