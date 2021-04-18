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
        String t = texto;
        t = t.replace(' ', '\n');

        return t;
    }

    @Override
    public void setTexto(String t) {

    }

}
