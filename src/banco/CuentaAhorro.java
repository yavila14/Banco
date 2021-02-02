/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author USER
 */
public abstract class CuentaAhorro {
    protected double monto;
    protected double intereses;
    
     public double getIntereses(){
        return intereses;
    }
     
     public void setIntereses(double intereses){
        this.intereses=intereses;
    }
    
    public void pintarIntereses(){
        System.out.println(this.intereses);
        
     }
    public double getmonto(){
         return monto;
     }
     public void setmonto (double monto){
         this.monto= monto;
     
     }
     public void pintarmonto(){
        System.out.println(this.monto);
        
     }
    public abstract void calcularIntereses();
        
    
    
}
