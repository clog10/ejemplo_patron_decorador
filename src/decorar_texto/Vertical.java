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
public class Vertical extends Decorador {

    public Vertical(Texto iTexto) {
        super(iTexto);
        texto = super.getTexto();
    }

    @Override
    public String getTexto() {
        String vertical = "";
        char[] aCaracteres = texto.toCharArray();
        for (int i = 0; i < aCaracteres.length; i++) {
            //System.out.println(aCaracteres[i]);
            vertical += aCaracteres[i] + "\n";
        }
        return vertical;
    }

    @Override
    public void setTexto(String t) {

    }

}
