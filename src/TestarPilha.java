public class TestarPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.empilhar(new Elemento(1));
        pilha.empilhar(new Elemento(2));
        pilha.empilhar(new Elemento(3));
        pilha.empilhar(new Elemento(4));
        pilha.empilhar(new Elemento(5));

        System.out.println("Tamanho da pilha: "+pilha.getTamanho());

        System.out.println(pilha.desempilhar().getValor());
        System.out.println(pilha.desempilhar().getValor());
        System.out.println(pilha.desempilhar().getValor());
        System.out.println(pilha.desempilhar().getValor());
        System.out.println(pilha.desempilhar().getValor());

        System.out.println("Tamanho da pilha: "+pilha.getTamanho());

    }
}
