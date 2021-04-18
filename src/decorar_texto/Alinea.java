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
public class Alinea extends Decorador {

    private char alinear;

    public Alinea(Texto tex, char ta) {
        super(tex);
        texto = super.getTexto();
        alinear = ta;

    }

    @Override
    public String getTexto() {
        int tamañoRenglon = 80;
        int numeroEspacios = 0;
        String t = "";
        String[] verticales = texto.split("\n");
        if (alinear == 'C' || alinear == 'c') {
            for (String a : verticales) {
                numeroEspacios = (tamañoRenglon - a.length()) / 2;
                for (int p = 0; p < numeroEspacios; p++) {
                    t += " ";
                }
                if (verticales.length == 1) {
                    t = t + a;
                } else {
                    t = t + a + "\n";
                }
            }
        } else if (alinear == 'I' || alinear == 'i') {
            t = texto;
        } else if (alinear == 'D' || alinear == 'd') {
            for (String a : verticales) {
                numeroEspacios = tamañoRenglon - a.length();
                for (int p = 0; p < numeroEspacios; p++) {
                    t += " ";
                }
                if (verticales.length == 1) {
                    t = t + a;
                } else {
                    t = t + a + "\n";
                }
            }
        }
        return t;
    }

    @Override
    public void setTexto(String t) {

    }

}
