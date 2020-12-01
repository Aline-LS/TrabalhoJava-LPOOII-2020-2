/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlpooii;

import InterfacesIntrodutorias.IntoducaoPesquisar;
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
public class MenuPesquisar {

    int menupesq;
    String entrada;
    String nome;

    public MenuPesquisar(int menupesq) {
        this.menupesq = menupesq;
    }

    public int MostrarMenuPesquisar() {
        do {
            boolean numeros;
            do {
            // menu principal apresentará 5 opção que o usuário pode escolher, sendo que quando o numero 5 é digitado o sistema finaliza
            entrada = JOptionPane.showInputDialog("=====Pesquisa de Pessoas===== \n "
                    + "Qual tipo de Pessoa deseja listar? \n \n"
                    + "1 - Introdução ao Sistema \n "
                    + "2 - Pesquisar Alunos  \n "
                    + "3 - Pesquisar Auxiliares \n "
                    + "4 - Pesquisar Gestores \n "
                    + "5 - Pesquisar Professores \n "
                    + "6 - Pesquisar Tecnicos \n "
                    + "7 - Pesquisar de Outros Funcionarios \n "
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

                menupesq = Integer.parseInt(entrada);
            switch (menupesq) {
                case 1:
                    // pequena explicação do sistema e apos lido o usuário retorna ao menu principal
                    //JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz cadastramento de Pessoas, Você pode escolher dentre as opções: \n 1 - Professor \n 2 - Gestor \n 3 - Auxiliar \n 4 - Outro tipo de Funcionario");
                    //MenuPesquisar mli = new MenuPesquisar(1);
                    //mli.MostrarMenuPesquisar();  
                    IntoducaoPesquisar intoducaoPesquisar = new IntoducaoPesquisar();
                    intoducaoPesquisar.Introducao();
                    break;
                case 2:
                    //chamar pesquisa de Aluno
                    nome = JOptionPane.showInputDialog("Digite o nome do aluno que deseja pesquisar");
                    JOptionPane.showMessageDialog(null, "=== Aluno === \n" + ListaArrays.pesquisaraluno(nome));
                    JOptionPane.showMessageDialog(null, "=====Aluno===== \n Existem " + ListaArrays.pesquisaraluno(nome) + " Alunos(s) com o nome " + nome);
                    break;
                case 3:
                    //chamar pesquisa de Professor
                    nome = JOptionPane.showInputDialog("Digite o nome do auxiliar que deseja pesquisar");
                    JOptionPane.showMessageDialog(null, "=== Auxiliar === \n" + ListaArrays.pesquisarauxiliar(nome));
                    JOptionPane.showMessageDialog(null, "=====Auxiliar===== \n Existem " + ListaArrays.pesquisarauxiliar(nome) + " Auxiliar(s) com o nome " + nome);
                    break;
                case 4:
                    //chamar pesquisa de Gestor
                    nome = JOptionPane.showInputDialog("Digite o nome do gestor que deseja pesquisar");
                    JOptionPane.showMessageDialog(null, "=== Gestor === \n" + ListaArrays.pesquisargestor(nome));
                    JOptionPane.showMessageDialog(null, "=====Gestor===== \n Existem " + ListaArrays.pesquisargestor(nome) + " Gestores(s) com o nome " + nome);
                    break;
                case 5:
                    //chamar pesquisa de Professor
                    nome = JOptionPane.showInputDialog("Digite o nome do professor que deseja pesquisar");
                    JOptionPane.showMessageDialog(null, "=== Professor === \n" + ListaArrays.pesquisarprofessor(nome));
                    JOptionPane.showMessageDialog(null, "=====Professor===== \n Existem " + ListaArrays.pesquisarprofessor(nome) + " Professores(s) com o nome " + nome);
                    break;
                case 6:
                    //chamar pesquisa de Tecnico
                    nome = JOptionPane.showInputDialog("Digite o nome do Tecnico que deseja pesquisar");
                    JOptionPane.showMessageDialog(null, "=== Tecnico === \n" + ListaArrays.pesquisartecnico(nome));
                    JOptionPane.showMessageDialog(null, "=====Tecnico===== \n Existem " + ListaArrays.pesquisartecnico(nome) + " Tecnico(s) com o nome " + nome);

                    break;
                case 7:
                    //chamar pesquisa de Outro tipo de funcionario
                    nome = JOptionPane.showInputDialog("Digite o nome do outros funcionarios que deseja pesquisar");
                    JOptionPane.showMessageDialog(null, "=== Outros Funcionarios === \n" + ListaArrays.pesquisaroutrofuncionario(nome));
                    JOptionPane.showMessageDialog(null, "=====Outros Funcionarios===== \n Existem " + ListaArrays.pesquisaroutrofuncionario(nome) + " Outros Funcionarios(s) com o nome " + nome);

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
        } while (menupesq != 8);

        return menupesq;

    }
}
