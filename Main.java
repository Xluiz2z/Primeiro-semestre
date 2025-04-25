class Main {
 public static void main(String[] args) {
  Carro c1 = new Carro();


   //c1.nome = "UpTSI";
   c1.cor = "Branco";
   c1.ano = 2022;
   c1.combustivel = true;
   c1.velocidade = 210;

   c1.setNome("UpTSI");
   c1.getNome();
   
   //  c1.dadosCarro();

   c1.andar();
   c1.acelerar();
  
  // c1.dadosCarro();
  // c2.dadosCarro();

   c1.frear(210);
 
 }
  
}