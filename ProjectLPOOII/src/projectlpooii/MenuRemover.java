/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlpooii;

import InterfacesIntrodutorias.IntoducaoRemover;
import UserPessoa.ListaArrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class MenuRemover {
    int menuremove;
    String nome;
    String entrada;
    
    
    public MenuRemover(int menuremove){
        this.menuremove = menuremove;
    }
    
    public int MostrarMenuRemover(){
        do{
            boolean numeros;
            do {
            // menu principal apresentará 5 opção que o usuário pode escolher, sendo que quando o numero 5 é digitado o sistema finaliza
        entrada = JOptionPane.showInputDialog("=====Remover Pessoas===== \n "
                                                                    + "Qual tipo de Pessoa deseja remover? \n \n"
                                                                    + "1 - Introdução ao Sistema \n "
                                                                    + "2 - Remover Aluno  \n "
                                                                    + "3 - Remover Auxiliar \n "
                                                                    + "4 - Remover Gestor \n "
                                                                    + "5 - Remover Professor \n "
                                                                    + "6 - Remover Tecnico \n "
                                                                    + "7 - Remover Outro Funcionario \n "
                                                                    + "8 - Sair");
        //condição da opções
        numeros = true;
                if (!entrada.matches("\\d+")) {
                    numeros = false;
                }
                } while (!numeros);

                //condição da opções
                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Retornando ao Menu Principal", "Saindo...", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Retornando ao Menu Principal");

                    break;
                }
                if ("".equals(entrada)) {

                }

                menuremove = Integer.parseInt(entrada);
        switch(menuremove){
            case 1:
                // pequena explicação do sistema e apos lido o usuário retorna ao menu principal
                //JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz cadastramento de Pessoas, Você pode escolher dentre as opções: \n 1 - Professor \n 2 - Gestor \n 3 - Auxiliar \n 4 - Outro tipo de Funcionario");
                //MenuRemover mre = new MenuRemover(1);
                //mre.MostrarMenuRemover();     
                IntoducaoRemover intoducaoRemover = new IntoducaoRemover();
                intoducaoRemover.Introducao();
                break;
            case 2:
                //ira remover um aluno atraves do nome, sendo que se não tiver nenhum aluno com o nome digitado entao retornara aluno não encontrado
                nome = JOptionPane.showInputDialog("Digite o nome do professor que deseja remover");
                if( ! (ListaArrays.getListaAlunos().isEmpty())){
                    if(ListaArrays.removeraluno(nome)){
                        JOptionPane.showMessageDialog(null, "=====Aluno removido com sucesso===== \n");

                    }else{
                        JOptionPane.showMessageDialog(null, "=====Aluno não encontrado ===== \n");
                        
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "=====Não existe Alunos na Lista ===== \n");
                    
                }
                break;
            case 3:
                //ira remover um auxiliar atraves do nome, sendo que se não tiver nenhum auxiliar com o nome digitado entao retornara professor não encontrado
                nome = JOptionPane.showInputDialog("Digite o nome do auxiliar que deseja remover");
                if( ! (ListaArrays.getListaAuxiliares().isEmpty())){
                    if(ListaArrays.removerauxiliar(nome)){
                        JOptionPane.showMessageDialog(null, "=====Auxiliar removido com sucesso===== \n");

                    }else{
                        JOptionPane.showMessageDialog(null, "=====Auxiliar não encontrado ===== \n");
                        
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "=====Não existe auxiliar na Lista ===== \n");
                    
                }                
                break;
            case 4:
                //ira remover um gestor atraves do nome, sendo que se não tiver nenhum gestor com o nome digitado entao retornara gestor não encontrado
                nome = JOptionPane.showInputDialog("Digite o nome do gestor que deseja remover");
                if( ! (ListaArrays.getListaGestores().isEmpty())){
                    if(ListaArrays.removergestor(nome)){
                        JOptionPane.showMessageDialog(null, "=====Gestor removido com sucesso===== \n");

                    }else{
                        JOptionPane.showMessageDialog(null, "=====Gestor não encontrado ===== \n");
                        
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "=====Não existe Gestor na Lista ===== \n");
                    
                }
                break;
            case 5:
                //ira remover um professor atraves do nome, sendo que se não tiver nenhum professor com o nome digitado entao retornara professor não encontrado
                nome = JOptionPane.showInputDialog("Digite o nome do professor que deseja remover");
                if( ! (ListaArrays.getListaProfessores().isEmpty())){
                    if(ListaArrays.removerprofessor(nome)){
                        JOptionPane.showMessageDialog(null, "=====Professor removido com sucesso===== \n");

                    }else{
                        JOptionPane.showMessageDialog(null, "=====Professor não encontrado ===== \n");
                        
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "=====Não existe Professor na Lista ===== \n");
                    
                }                
                break;
            case 6:
                //ira remover um funcionario pertencente a tecnico atraves do nome, sendo que se não tiver nenhum tecnico com o nome digitado entao retornara outro tipo de funcionario não encontrado
                nome = JOptionPane.showInputDialog("Digite o nome do tecnico que deseja remover");
                if( ! (ListaArrays.getListaTecnicos().isEmpty())){
                    if(ListaArrays.removertecnico(nome)){
                        JOptionPane.showMessageDialog(null, "=====Tecnico removido com sucesso===== \n");

                    }else{
                        JOptionPane.showMessageDialog(null, "=====Tecnico não encontrado ===== \n");
                        
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "=====Não existe Tecnico na Lista ===== \n");
                    
                }
                break;
            case 7:
                //ira remover um funcionario pertencente a outro tipo de funcionario atraves do nome, sendo que se não tiver nenhum outro tipo de funcionario com o nome digitado entao retornara outro tipo de funcionario não encontrado
                nome = JOptionPane.showInputDialog("Digite o nome do Outro tipo de Funcionario que deseja remover");
                if( ! (ListaArrays.getListaOutroFuncionarios().isEmpty())){
                    if(ListaArrays.removeroutrofuncionario(nome)){
                        JOptionPane.showMessageDialog(null, "=====Outro tipo de funcionario removido com sucesso===== \n");

                    }else{
                        JOptionPane.showMessageDialog(null, "=====Outro tipo de funcionario não encontrado ===== \n");
                        
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "=====Não existe Outro tipo de funcionario na Lista ===== \n");
                    
                }
                break;
            case 8:
                //finaliza sistema
                JOptionPane.showMessageDialog(null, "Retornando ao Menu Principal");
                System.out.println("Retornando ao Menu Principal");
                break;
            default:
                //informara que foi digitado uma opçãoo que não esta dentro das condições
                System.out.println("Opção inválida");
                JOptionPane.showMessageDialog(null,"opção inválida");
        }
        }while(menuremove != 8);

        return menuremove;

    }
}
