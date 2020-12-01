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
public class IntoducaoRemover implements ItemIntrodutorio{
    
    @Override
    public void Introducao() {
        JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz Remoção de Pessoas, "
                                        + "\nSendo que pode ser removido em 7 tipos de listas, "
                                        + "são eles: "
                                        + "\n 1 - Remover em Lista de Aluno "
                                        + "\n 2 - Remover em Lista de Auxiliar "
                                        + "\n 3 - Remover em Lista de Gestor "
                                        + "\n 4 - Remover em Lista de Professor "
                                        + "\n 5 - Remover em Lista de Tecnico "
                                        + "\n 6 - Remover em Lista de Outro tipo de Funcionario");    
    }
}
