public class Pet {
    private String nome;
    private String especie;
    private int idade;
    private double valorServico;

    // Metodo construtor
    public Pet(String nome, String especie, int idade, double valorServico) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.valorServico = valorServico;
    }

    // Metodos getters and setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return this.especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getValorServico() {
        return this.valorServico;
    }
    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    // Metodos da classe Pet.java
    public void exibirInformacoes(){
        System.out.println("Nome do pet: " + getNome());
        System.out.println("Espécie do pet: " + getEspecie());
        System.out.println("Idade do pet: " + getIdade());
        System.out.println("Valor do serviço: R$" + getValorServico());
        System.out.println("Valor do serviço com desconto: R$" + calcularValorComDesconto());
    }

    public double calcularValorComDesconto(){
        return getValorServico() * 0.10;
    }
}
