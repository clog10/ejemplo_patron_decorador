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
public class TextoC extends Texto {

    public TextoC(String tex) {
        texto = tex;
    }

    @Override
    public String getTexto() {
        return texto;
    }

    @Override
    public void setTexto(String t) {
        texto = t;
    }

}
