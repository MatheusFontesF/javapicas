 class Estatistica {
    
     int CodigoCidade;
     String NomeCidade;
     int QtdAcidentes;
     
     Estatistica (){
         
         this (0, "", 0);
     }
     
     Estatistica (int cdEstatistica, String ncEstatistica, int qaEstatistica){
         CodigoCidade = cdEstatistica;
         NomeCidade = ncEstatistica;
         QtdAcidentes = qaEstatistica;
     }
}
