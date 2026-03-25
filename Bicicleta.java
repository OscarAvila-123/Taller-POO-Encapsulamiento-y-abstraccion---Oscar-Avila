class Bicicleta extends Vehiculo {

    public Bicicleta(String marca) {
        super(marca);
    }

    public void acelerar() {
        setVelocidad(getVelocidad() + 5);
    }

    public void frenar() {
        setVelocidad(getVelocidad() - 3);
    }
}