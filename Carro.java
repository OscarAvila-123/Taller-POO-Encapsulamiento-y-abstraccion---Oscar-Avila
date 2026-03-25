class Carro extends Vehiculo {

    public Carro(String marca) {
        super(marca);
    }

    public void acelerar() {
        setVelocidad(getVelocidad() + 20);
    }

    public void frenar() {
        setVelocidad(getVelocidad() - 10);
    }
}