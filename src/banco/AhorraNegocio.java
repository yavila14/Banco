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
public class AhorraNegocio extends CuentaAhorro implements ICuentaCredito{
   public AhorraNegocio(){
    
    }
    
     @Override 
     public void calcularIntereses() {
         if(monto>=10000000){
            intereses = ((monto * 2.0)/100)*12;
         }else {
             System.out.println("El monto minimo para esta cuenta es de $10.000.000");
         } 
}
     @Override
      public void calcularViabilidad()
      {
       
      }
}