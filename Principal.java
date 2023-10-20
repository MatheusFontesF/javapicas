import javax.swing.*;

class Menu {
    public static void main(String args[]) {

        Estatistica[] estatistica = new Estatistica[3];
        int i;

        for (i = 0; i < 3; i++) {
            estatistica[i] = new Estatistica();
        }
        int opc = 0;
        while (opc != 9) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra Dados "
                    + "\n 2 - Consulta Dados \n 3 - Consulta por menor e maior  \n 9 - finaliza programa"));

            switch (opc) {

                case 1:
                    estatistica = FCadastro(estatistica);
                    break;

                case 2:
                    Fconsultaacidente (estatistica);
                    break;
                case 3: 
                    FConsulto(estatistica);

                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado :3");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }
    }

    static Estatistica[] FCadastro(Estatistica[] estatistica) {
        for (int i = 0; i < 3; i++) {
            estatistica[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade"));
            estatistica[i].NomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade");
            estatistica[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes"));
        }
        return estatistica;
    }

    static void FConsulto(Estatistica[] estatistica) {
    int mai = estatistica[0].QtdAcidentes; // Inicialize mai e men com o primeiro elemento do array
    int men = estatistica[0].QtdAcidentes;
    String cidadeMaior = estatistica[0].NomeCidade;
    String cidadeMenor = estatistica[0].NomeCidade;

    for (int i = 1; i < 3; i++) { // Comece a partir do segundo elemento do array
        if (estatistica[i].QtdAcidentes > mai) {
            mai = estatistica[i].QtdAcidentes;
            cidadeMaior = estatistica[i].NomeCidade;
        } else if (estatistica[i].QtdAcidentes < men) {
            men = estatistica[i].QtdAcidentes;
            cidadeMenor = estatistica[i].NomeCidade;
        }
    }

    System.out.println("A maior quantidade de acidentes está em: " + cidadeMaior);
    System.out.println("A menor quantidade de acidentes está em: " + cidadeMenor);
}

    
    static void Fconsultaacidente(Estatistica[] estatistica){
        
        for (int i = 0; i < 3; i++){
        
        if (estatistica[i].QtdAcidentes > 100 & estatistica[i].QtdAcidentes < 500){
            
            System.out.println("as cidades que estão entre 100 e 500 acidente são: " + estatistica[i].CodigoCidade + ""+ estatistica[i].NomeCidade);
    }
        
    }
}
    
   static void Pacima (Estatistica [] estatistica)
   {
       int i;
       int soma;
       int média;
       
       for
       
   }
}
