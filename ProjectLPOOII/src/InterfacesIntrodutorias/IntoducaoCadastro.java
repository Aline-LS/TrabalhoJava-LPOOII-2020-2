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
public class IntoducaoCadastro implements ItemIntrodutorio{

    @Override
    public void Introducao() {
        JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz cadastramento de Pessoas, "
                                        + "\nSendo que pode ser cadastrado 7 tipos de pessoa, "
                                        + "são eles: "
                                        + "\n 1 - Cadastro de Aluno "
                                        + "\n 3 - Cadastro de Auxiliar "
                                        + "\n 4 - Cadastro de Gestor "
                                        + "\n 5 - Cadastro de Professor "
                                        + "\n 6 - Cadastro de Tecnico "
                                        + "\n 7 - Cadastro de Outro tipo de Funcionario");    
    }
    
}
