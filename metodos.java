import javax.swing.*;
import java.io.*;
import java.io.FileWriter;
        

public class Metodos {
    public Bob [] GravarChamada (Bob [] bob)throws IOException{
        int i; String pasta = "chamada.txt";
        BufferedWriter grava = new BufferedWriter (new FileWriter(pasta));
        for (i=0;i<3; i++) { bob[i] = new Bob () {};}
        for (i = 0; i <3; i++){
            
            bob[i].numero = Integer.parseInt(JOptionPane.showInputDialog("digite o seu numero de chamada"));
            grava.write(Integer.toString(bob[i].numero)); grava.newLine ();
            bob[i].nome = JOptionPane.showInputDialog("Digite o nome do aluno");
            grava.write(bob[i].nome); grava.newLine ();
            bob[i].idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            grava.write(Integer.toString(bob[i].idade)); grava.newLine();
            
            
            
            
        }
        System.out.println("Gravação realizada");
        grava.close();
       
               
        return bob;
    }
    
    public void LerBob (Bob[] bob)throws IOException{
        int i;
        String pasta = "chamada.txt";
        BufferedReader ler = new BufferedReader(new FileReader(pasta));
        for (i= 0; i<3;i++){
            bob [i] = new Bob () {};
        }
        for (i= 0; i<3; i++){
            
            bob[i].numero = Integer.parseInt(ler.readLine ());
            bob [i].nome = ler.readLine();
            bob[i].idade = Integer.parseInt(ler.readLine());
            
            
        }
        for (i=0;i<3;i++) {
            System.out.println("aluno " + bob[i].numero + " nome " + bob[i].nome + " idade " + bob[i].idade);
        }
        ler.close();
        
    }
    
}
