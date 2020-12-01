/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlpooii;

import InterfacesIntrodutorias.IntoducaoListagem;
import UserPessoa.Aluno;
import UserPessoaFuncionario.Gestor;
import UserPessoa.ListaArrays;
import UserPessoaFuncionario.OutroFuncionario;
import UserPessoaFuncionario.Professor;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class MenuListar {

    int menulistar;
    String entrada;

    public MenuListar(int menulistar) {
        this.menulistar = menulistar;
    }

    public int MostrarMenuListar() {
        do {
            boolean numeros;
            do {
            // menu principal apresentará 5 opção que o usuário pode escolher, sendo que quando o numero 5 é digitado o sistema finaliza
            entrada = JOptionPane.showInputDialog("=====Listagem de Pessoas===== \n "
                    + "Qual tipo de Pessoa deseja listar? \n \n"
                    + "1 - Introdução ao Sistema \n "
                    + "2 - Lista de Alunos  \n "
                    + "3 - Lista de Auxiliars \n "
                    + "4 - Lista de Gestors \n "
                    + "5 - Lista de Professors \n "
                    + "6 - Lista de Tecnicos \n "
                    + "7 - Lista de Outros Funcionarios \n "
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

                menulistar = Integer.parseInt(entrada);
            switch (menulistar) {
                case 1:
                    // pequena explicação do sistema e apos lido o usuário retorna ao menu principal
                    //JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz cadastramento de Pessoas, Você pode escolher dentre as opções: \n 1 - Professor \n 2 - Gestor \n 3 - Auxiliar \n 4 - Outro tipo de Funcionario");
                    //MenuPessoas mpe = new MenuPessoas(1);
                    //mpe.MostrarMenuPessoas(); 
                    IntoducaoListagem intoducaoListagem = new IntoducaoListagem();
                    intoducaoListagem.Introducao();
                    break;
                case 2:
                    //chamar listagem de Aluno
                    System.out.println(ListaArrays.listaraluno());
                    JOptionPane.showMessageDialog(null, "===Listagem de Alunos=== \n" + ListaArrays.listaraluno());
                    break;
                case 3:
                    //chamar listagem de Professor
                    System.out.println(ListaArrays.getListaAuxiliares());
                    JOptionPane.showMessageDialog(null, "===Listagem de Auxiliares=== \n" + ListaArrays.listarauxiliar());
                    break;
                case 4:
                    //chamar listagem de Gestor
                    System.out.println(ListaArrays.getListaGestores());
                    JOptionPane.showMessageDialog(null, "===Listagem de Gestores \n" + ListaArrays.listargestor());
                    break;
                case 5:
                    //chamar listagem de Professor
                    System.out.println(ListaArrays.getListaProfessores());
                    JOptionPane.showMessageDialog(null, "===Listagem de Professores=== \n" + ListaArrays.listarprofessor());
                    break;
                case 6:
                    //chamar listagem de Tecnicos
                    System.out.println(ListaArrays.getListaTecnicos());
                    JOptionPane.showMessageDialog(null, "===Listagem de Tecnicos \n" + ListaArrays.listartecnico());
                    break;
                case 7:
                    //chamar listagem de Outros fundinarios
                    System.out.println(ListaArrays.getListaOutroFuncionarios());
                    JOptionPane.showMessageDialog(null, "===Listagem de Outros Funcionarios \n" + ListaArrays.listaroutrofuncionario());
                    break;
                case 8:
                    //finaliza sistema
                    JOptionPane.showMessageDialog(null, "Retornando ao Menu Principal");
                    System.out.println("Retornando ao Menu Principal");
                    break;
                default:
                    //informara que foi digitado uma opçãoo que não esta dentro das condições
                    System.out.println("Opção inválida");
                    JOptionPane.showMessageDialog(null, "opção inválida");
            }
        } while (menulistar != 8);

        return menulistar;

    }
}
