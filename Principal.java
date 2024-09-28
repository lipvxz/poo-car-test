package POO;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.marca = "Volkswagen";
        carro.cor = "Preto";
        carro.ano = 1978;

        carro.dadosCarro();
    }
}
