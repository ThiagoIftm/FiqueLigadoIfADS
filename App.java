import domain.*;

public class App {
    public static void main(String[] args) throws Exception{
        Area area=new Area(1, "Computação");
        Local local=new Local(1, 
                              "Auditorio IFTM Udi Centro", 
                              "Rua Blanche Galassi", 
                              1150, 
                              "Morada da Colina", 
                              "Uberlândia", 
                              "38400000", 
                              120, 
                              "Dentro do campus");

     //   public Local(Integer id, String nome, String rua, Integer numero, String bairro, String cidade,
     //  String cep, Integer capacidade, String referencia){
     
        Pessoa pessoa = new Pessoa(1, "Carlos Eduardo", "/home/cadu.jpg", "Professor", "carloseduardodantas@iftm.edu.br");
        System.out.println(area);
        System.out.println(local);
        System.out.println(pessoa);

    }
}
