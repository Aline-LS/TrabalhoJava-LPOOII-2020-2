/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesIntrodutorias;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class IntoducaoListagem implements ItemIntrodutorio{
    
    @Override
    public void Introducao() {
        JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz listamento de Pessoas, "
                                        + "\nSendo que pode ser listado 7 tipos de listas, "
                                        + "são eles: "
                                        + "\n 1 - Lista de Aluno "
                                        + "\n 2 - Lista de Auxiliar "
                                        + "\n 3 - Lista de Gestor "
                                        + "\n 4 - Lista de Professor "
                                        + "\n 5 - Lista de Tecnico "
                                        + "\n 6 - Lista de Outro tipo de Funcionario");    
    }
}
