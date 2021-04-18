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

    public static void main(String[] args) {
        Texto textob = new TextoC("Ejemplo Decorador");
        //textob.setTexto("Ejemplo Decorador");
//        System.out.println("Texto -> "+textob.getTexto());
//        
//        Alinear a = new Alinear(textob);
//        a.setAlinear('C');
//        System.out.println(a.getTexto());

        Texto ta = new Alinea(textob, 'C');
        System.out.println(ta.getTexto());

        Texto tb = new Alinea(ta, 'c');
        System.out.println(tb.getTexto());

        //Lo que vamos a hacer
        //Texto tv =  new Vertical(new Alinear(new Texto("")));
        Vertical v = new Vertical(new Alinear(new TextoC("Carlos")));
        System.out.println(v.getTexto());

        Justificar j = new Justificar(new Alinear(new TextoC("Los patrones de diseño son unas técnicas para resolver problemas comunes en el desarrollo de software y otros ámbitos referentes al diseño de interacción o interfaces. Un patrón de diseño resulta ser una solución a un problema de diseño. Para que una solución sea considerada un patrón debe poseer ciertas características. Una de ellas es que debe haber comprobado su efectividad resolviendo problemas similares en ocasiones anteriores. Otra es que debe ser reutilizable, lo que significa que es aplicable a diferentes problemas de diseño en distintas circunstancias.")));
        System.out.println(j.getTexto());
    }
}
