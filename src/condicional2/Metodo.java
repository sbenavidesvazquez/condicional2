package condicional2;

import javax.swing.JOptionPane;

public class Metodo {
   private float numero1, numero2;
   
   public Metodo(){
          }
   
   public Metodo(float n1, float n2){
       numero1=n1;
       numero2=n2;
   }
   
   public float pedirDato(){
       String resposta=JOptionPane.showInputDialog("introducir numero");
       float valor= Float.parseFloat(resposta);
       return valor;
   }
   
   public void condicionDoble(){
       if(numero1>numero2)
           System.out.println(numero1+" é maior");
       else if(numero1<numero2)
           System.out.println("é maior o "+numero2);
   }
   
   public void condicionDoble(float n1, float n2){
     if (n1>n2)
       JOptionPane.showMessageDialog(null,"o maior é"+ n1);
     else if (n1<n2)
       JOptionPane.showMessageDialog(null,"o maior é "+ n2);
   }
}
