/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
import Interfaces.ICuentaCredito;
/**
 *
 * @author USER
 */
public class MiAhorroBase extends CuentaAhorro implements ICuentaCredito{
    public MiAhorroBase(){
    
    }
    
     @Override 
     public void calcularIntereses() {
         //monto=Integer.parseUnsignedInt(JOptionPane.showInputDialog("Ingrese el monto para su cuenta "));
         if(monto>=1000000){
         intereses = ((monto * 1.1)/100)*6;
         }else {
             System.out.println("El monto minimo para esta cuenta es de $1.000.000");
         } 
     
     }
     @Override
      public void calcularViabilidad()
      {
       
      }
}
