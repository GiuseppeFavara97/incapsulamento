public class Auto {
    private String cilindrata, taga, marca, modello;

    public Auto(String cilindrata, String taga, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.taga = taga;
        this.marca = marca;
        this.modello = modello;
    }
    //prendere il valore
    public String getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTaga() {
        return taga;
    }

    public void setTaga(String taga) {
        this.taga = taga;
    }

    public String getMarca() {
        return marca;
    }
    //mettere un valore
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
    //stampa classe
    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata='" + cilindrata + '\'' +
                ", taga='" + taga + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
