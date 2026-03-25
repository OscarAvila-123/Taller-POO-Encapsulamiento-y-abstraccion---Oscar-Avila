class Moto extends Vehiculo {

    public Moto(String marca) {
        super(marca);
    }

    public void acelerar() {
        setVelocidad(getVelocidad() + 15);
    }

    public void frenar() {
        setVelocidad(getVelocidad() - 8);
    }
}