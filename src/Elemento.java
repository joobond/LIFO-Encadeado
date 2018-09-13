public class Elemento {

    private Elemento proximo;
    private int valor;

    public Elemento(int valor) {
        this.valor = valor;
        this.proximo =  null;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
