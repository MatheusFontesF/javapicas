public abstract class Bob {
    int numero;
    String nome;
    int idade;

    // Construtor padrão
    Bob() {
        this(0, "", 0);
    }

    // Construtor com parâmetros
    Bob(int num, String nome, int idade) {
        this.numero = num;
        this.nome = nome;
        this.idade = idade;
    }
}
