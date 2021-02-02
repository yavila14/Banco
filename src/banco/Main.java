/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
import java.util.Scanner;


/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
       boolean s = false;
       int opc; //Guardaremos la opcion del usuario
      double aux;
       while(!s){
            
           System.out.println("Escribe Que tipo de cuenta desea abrir");
           
           System.out.println("1. Opción Gran Ahorro");
           System.out.println("2. Opcion Mi ahorro Base");
           System.out.println("3. Opcion Ahorra Negocio");
           System.out.println("4. Ninguna Opción");
            
           opc = sn.nextInt();
            
           switch(opc){
               case 1:
                    GranAhorro granahorro=new GranAhorro();
                    aux=sn.nextDouble();
                    granahorro.setmonto(aux);
                    granahorro.calcularIntereses();
                    granahorro.pintarIntereses();
                             
                   break;
               case 2:
                    MiAhorroBase miahorrobase=new MiAhorroBase();
                    miahorrobase.setmonto(1000000);
                    miahorrobase.calcularIntereses();
                    miahorrobase.pintarIntereses();
                    break;
                case 3:
                    AhorraNegocio ahorranegocio=new AhorraNegocio();
                    ahorranegocio.setmonto(10000000);
                    ahorranegocio.calcularIntereses();
                    ahorranegocio.pintarIntereses();
                   break;
                case 4:
                   s=true;
                   break;
                default:
                  System.out.println("Solo números entre 1 y 4");
           }
            
       }
    }
    
}
