package Aula03;

public class Aula03 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta(); // Iniciando uma nova instância
        System.out.println("Hello, World!");
        c1.modelo = "BIC Cristal";
        c1.cor = "AZUL";
        // c1.ponta = 0.5; -> protegido
        c1.carga = 2;
        // c1.tampada = true;
        c1.status();
        c1.rabiscar();
        c1.tampar(); // posso mexer em um atributo privado através de um método público
        c1.destampar();
    }
}
