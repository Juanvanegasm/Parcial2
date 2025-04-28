public class Bateria {
    protected int carga;

    public Bateria(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "carga=" + carga +
                '}';
    }
}
