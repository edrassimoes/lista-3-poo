public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("João", 123, 3);
        Endereço endereço1 = new Endereço("Rio Azul", "Santa Maria", 10);
        Endereço endereço2 = new Endereço("Marechal Mario", "Centro", 25);

        p.addEndereço(endereço1);
        p.addEndereço(endereço2);

        p.mostraInfo();
    }

}
