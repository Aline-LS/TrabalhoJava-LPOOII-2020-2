/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlpooii;

import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class ProjectLPOOII {

    public static void main(String[] args) throws ParseException { 
            //sistema chama tela dando a opção ao usuãrio se realmente quer iniciar o sistema ou não, se Sim entao o Sistema é iniciado e chama MenuPrincipal , senão fecha Sistema antes de inicializar.
            if (JOptionPane.showConfirmDialog(null, "Deseja Inicilizar Sistema?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    MenuPrincipal mop = new MenuPrincipal(1);
                    mop.MostrarMenuPrincipal();
            } else {
                JOptionPane.showMessageDialog(null, "Sistema finalizado","Saindo...", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Sistema Finalizado");

            }
        
    } 
    
}
