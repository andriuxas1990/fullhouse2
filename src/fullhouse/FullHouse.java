/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

/**
 *
 * @author Karen
 */
public class FullHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Jf_Principal().setVisible(true);
            }
        });
    }
}
