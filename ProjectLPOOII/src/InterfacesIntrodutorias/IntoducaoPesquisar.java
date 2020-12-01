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
public class IntoducaoPesquisar implements ItemIntrodutorio{
    
    @Override
    public void Introducao() {
        JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz Pesquisa de Pessoas, "
                                        + "\nSendo que pode ser pesquisado em 7 tipos de listas, "
                                        + "são eles: "
                                        + "\n 1 - Pesquisar em Lista de Aluno "
                                        + "\n 2 - Pesquisar em Lista de Auxiliar "
                                        + "\n 3 - Pesquisar em Lista de Gestor "
                                        + "\n 4 - Pesquisar em Lista de Professor "
                                        + "\n 5 - Pesquisar em Lista de Tecnico "
                                        + "\n 6 - Pesquisar em Lista de Outro tipo de Funcionario");    
    }
}
