public class Main {
    public static void main(String[] args) throws Exception {
        Pet pet1 = new Pet("Thor", "Cachorro", 4, 80.0);
        pet1.exibirInformacoes();

        Pet pet2 = new Pet("Cookie", "Gato", 1, 30.0);
        pet2.exibirInformacoes();

        Pet pet3 = new Pet("Cocoricó", "Galinha", 2, 10.0);
        pet3.exibirInformacoes();
    }
}
