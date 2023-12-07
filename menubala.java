import javax.swing.JOptionPane;
import java.io.*;

public class menubala {
    public static void main (String args[])throws IOException
    {
       Bob [] bob = new Bob [3]; 
       Metodos m = new Metodos(); 
       
       int opc = 0;
       while (opc!=9){
           
          opc = Integer.parseInt(JOptionPane.showInputDialog("1 - grava aluno\n2 - Ordena aluno\n3 - Le aluno\n4 - mostra ordenado"));
           switch (opc){
               
               case 1:
                   m.GravarChamada(bob);
                break;
               case 2: 
                   bob = ordena(bob);
                   break;
               case 3: 
                   m.LerBob(bob);
                   break;
               case 4: 
                    Mostra (bob);
               case 9:
                   JOptionPane.showMessageDialog(null, "Programa finalizado");
               break;
               default: JOptionPane.showMessageDialog(null, "Opção invalida");
               break;
           }
       }
        
        
    }
    
   public static Bob[] ordena(Bob[] bob) {
    int i, j;
    Bob aux;

    for (i = 0; i < bob.length - 1; i++) {
        for (j = i + 1; j < bob.length; j++) {
            if (bob[i].numero > bob[j].numero) {
                aux = bob[i];
                bob[i] = bob[j];
                bob[j] = aux;
            }
        }
    }
    return bob;
}
   
   public static void Mostra (Bob[]bob) {
       int i;
       for (i=0;i<3;i++){
           
         System.out.println ("Ordenado fica: " + bob[i].numero + " " + bob[i].nome + " " + bob[i].idade)  ;
   }
   
}
}
