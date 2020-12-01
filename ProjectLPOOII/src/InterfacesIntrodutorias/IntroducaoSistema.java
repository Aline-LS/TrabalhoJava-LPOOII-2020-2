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
public class IntroducaoSistema implements ItemIntrodutorio{
    
    @Override
    public void Introducao() {
        JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz cadastramento de Pessoas, "
                                        + "fazendo com que o usuário possa cadastrar, listar, pesquisar e remover. "
                                        + "\nSendo que o usuário pode ser um dos 2 tipos de pessoa, "
                                        + "são eles: "
                                        + "\n 1 - Aluno "
                                        + "\n 2 - Funcionario "
                                        + "\nSendo que o Funcionario pode ser subdividido em: "
                                        + "\n 1 - Auxiliar "
                                        + "\n 2 - Gestor "
                                        + "\n 3 - Professor "
                                        + "\n 4 - Tecnico "
                                        + "\n 5 - Outro tipo de Funcionario");    
    }
}
