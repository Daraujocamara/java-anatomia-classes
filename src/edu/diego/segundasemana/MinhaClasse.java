package edu.diego.segundasemana;
public class MinhaClasse {
    
  public static void main(String[] args) {

    String primeiroNome = "Diego";
    String segundoNome = "Araujo";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

    System.out.println(nomeCompleto);
   
  } 
  
  public static String nomeCompleto ( String primeiroNome, String segundoNome){
    return "Resultado do metodo" + primeiroNome.concat(" ").concat(segundoNome);
  }

}
