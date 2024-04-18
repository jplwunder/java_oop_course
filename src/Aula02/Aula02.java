package Aula02;
public class Aula02 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Caneta c1 = new Caneta(); // Iniciando uma nova instância

        c1.cor = "Bic"; // Atributo
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar(); // Método
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.status();
        c1.rabiscar();

    }
}
