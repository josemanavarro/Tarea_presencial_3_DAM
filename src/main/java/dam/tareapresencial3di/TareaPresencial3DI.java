/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dam.tareapresencial3di;

import dam.tareapresencial3di.controller.LogicaNegocio;
import dam.tareapresencial3di.view.JFrameVentanaPrincipal;

/**
 *
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */
public class TareaPresencial3DI {

    public static void main(String[] args) {
        LogicaNegocio ln = new LogicaNegocio();
        JFrameVentanaPrincipal jfvp = new JFrameVentanaPrincipal(ln);
        jfvp.setVisible(true);
    }
}
