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
        Texto textoi = new TextoC("Prueba Alineado a la Izquierda");
        Texto textoc = new TextoC("Prueba Alineado al centro");
        Texto textod = new TextoC("Prueba Alineado a la Derecha");
        
        System.out.println("--------------------------------------------------------------------------------");
        Texto ta = new Alinea(textoi, 'i');
        System.out.println(ta.getTexto());

        System.out.println("--------------------------------------------------------------------------------");
        Texto tb = new Alinea(textoc, 'c');
        System.out.println(tb.getTexto());
        
        System.out.println("--------------------------------------------------------------------------------");
        Texto td = new Alinea(textod, 'd');
        System.out.println(td.getTexto());
        System.out.println("--------------------------------------------------------------------------------");
        
        //Lo que vamos a hacer
        //Texto tv =  new Vertical(new Alinear(new Texto("")));
        System.out.println("Prueba Impresión Vertical");
        System.out.println("--------------------------------------------------------------------------------");
        Vertical v = new Vertical(new Alinear(new TextoC("Entre los individuos, como entre las naciones, el respeto al derecho ajeno es la paz.")));
        System.out.println(v.getTexto());
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Prueba Impresión justificada");
        System.out.println("--------------------------------------------------------------------------------");
        Justificar j = new Justificar(new Alinear(new TextoC("Los patrones de diseño son unas técnicas para resolver problemas comunes en el desarrollo de software y otros ámbitos referentes al diseño de interacción o interfaces. Un patrón de diseño resulta ser una solución a un problema de diseño. Para que una solución sea considerada un patrón debe poseer ciertas características. Una de ellas es que debe haber comprobado su efectividad resolviendo problemas similares en ocasiones anteriores. Otra es que debe ser reutilizable, lo que significa que es aplicable a diferentes problemas de diseño en distintas circunstancias.")));
        System.out.println(j.getTexto());
        System.out.println("--------------------------------------------------------------------------------");
        
        
        
    }
}
