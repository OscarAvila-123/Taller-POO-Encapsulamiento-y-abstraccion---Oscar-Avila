abstract class Vehiculo {
    private String marca;
    private int velocidad;

    public Vehiculo(String marca) {
        this.marca = marca;
        setVelocidad(0);
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    protected void setVelocidad(int velocidad) {
        if (velocidad < 0) {
            this.velocidad = 0;
        } else {
            this.velocidad = velocidad;
        }
    }

    public abstract void acelerar();
    public abstract void frenar();
}