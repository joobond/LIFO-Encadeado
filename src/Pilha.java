public class Pilha {

    private int tamanho;
    private Elemento topo;

    public Pilha() {
        this.tamanho = 0;
        this.topo = null;
    }

    public boolean isVazia(){
        return topo == null;
    }

    public void empilhar(Elemento elemento){
        if(!isVazia()){
            elemento.setProximo(topo);
            topo = elemento;
        }else{
            topo = elemento;
        }
        tamanho++;
    }

    public Elemento desempilhar(){
        if(!isVazia()){
            Elemento aux = topo;
            topo = aux.getProximo();
            aux.setProximo(null);
            tamanho--;
            return aux;
        }else{
            System.out.println("Ocorreu um erro ao desempilhar o elemento!");
            return null;
        }
    }

    public int getTamanho() {
        return tamanho;
    }
}
