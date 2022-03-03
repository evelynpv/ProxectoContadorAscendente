public class ContadorAscendente {

    int valorActual;

    public ContadorAscendente(int valorActual) {
        this.valorActual = valorActual;
    }

    public int getValorActual() {
        return valorActual;
    }

    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }

    @Override
    public String toString() {
        return "ContadorAscendente{" +
                "valorActual=" + valorActual +
                '}';
    }
}
