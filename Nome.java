public class Nome {

    String nome;
    int idade;
    int altura;
    String informacaorara;
    
    public Nome (String nome, int idade, int altura, String informacaorara){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.informacaorara = informacaorara;
    }

    public void informacoes() {
        System.out.println("Aluno: " + nome);
        System.out.println("Formulário:");
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + "cm");
        System.out.println("È gay? " + informacaorara);
        System.out.println();
    }
    public static void main(String[] args) {
        Nome Caio = new Nome("Caio", 20, 180, "Não");
        Nome Gustavo = new Nome("Gustavo", 19, 182, "Sim");

        Caio.informacoes();
        Gustavo.informacoes();
    }

}