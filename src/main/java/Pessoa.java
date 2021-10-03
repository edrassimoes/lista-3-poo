public class Pessoa {

    public String nome;
    public int cpf;
    //Atributos auxiliares:
    Endereço[] end;
    private int q = 0;

    Pessoa(String nome, int cpf, int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        this.end = new Endereço[qtdEnd];
    }

    public void addEndereço(Endereço end){
        for(int i = 0; i < this.end.length; i++){
            if(this.end[i] == null){
                this.end[i] = end;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Capacidade total de endereços: " + end.length);
        for(int i = 0; i < this.end.length; i++){
            if(this.end[i] != null){
                this.q++;
            }
        }
        System.out.println("Quantidade de endereços ocupados: " + q);
        System.out.println(" ");

        for(int i = 0; i < this.end.length; i++){
            if(this.end[i] != null){
                System.out.println("Endereço " + (i+1) + ":");
                System.out.println("Rua: " + this.end[i].rua);
                System.out.println("Bairro: " + this.end[i].bairro);
                System.out.println("Número: " + this.end[i].num);
                System.out.println(" ");
            } else {
                System.out.println("Endereço " + (i + 1) + ":");
                System.out.println("[Capacidade para novo cadastro de endereço disponível]");
            }
        }
    }

}
