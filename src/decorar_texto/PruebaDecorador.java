/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorar_texto;

/**
 *
 * @author Carlos Loaeza
 */
public class PruebaDecorador {
    public static void main(String [] args){
        Texto textob = new TextoC();
        textob.setTexto("Ejemplo Decorador");
//        System.out.println("Texto -> "+textob.getTexto());
//        
//        Alinear a = new Alinear(textob);
//        a.setAlinear('C');
//        System.out.println(a.getTexto());

        Texto ta = new Alinea(textob,'C');
        System.out.println(ta.getTexto());
        
        Texto tb = new Alinea(ta,'c');
        System.out.println(tb.getTexto());
    
        //Lo que vamos a hacer
        //Texto tv =  new Vertical(new Alinear(new Texto("")));
        
    }
}
