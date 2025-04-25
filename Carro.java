public class Carro {
 private String nome;
 String cor;
 double ano;
 boolean combustivel;
 double velocidade;
  


 void dadoscarro() {
   System.out.println("Nome: " + nome);
   System.out.println("cor: " + cor);
   System.out.println("ano: " + ano);
 }
   void andar(){
if (combustivel == true){
System.out.println("carro em movimento");
} else {
  System.out.println("carro não pode andar!");
}
  
  }


void acelerar(){
  velocidade++;
  System.out.println("Velocidade atual: " + velocidade);
}
 void frear(double novaVelo){
   
  velocidade -= novaVelo;
   
   if(velocidade <= 0){
     System.out.println("Carro parou");
   }else{
      System.out.println("Velocidade atual " + velocidade);
   }
 }   
public void setNome(String novoNome){
  this.nome = novoNome;
}

public void getNome(){
  System.out.println(nome);
   }
}
