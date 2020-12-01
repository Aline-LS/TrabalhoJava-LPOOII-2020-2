/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlpooii;

/**
 *
 * @author Emilio
 */
import InterfacesIntrodutorias.IntroducaoSistema;
import User.Pessoa;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;

public class MenuPrincipal {

    int menupessoa;
    int menulistar;
    int menupesq;
    int menuremove;

    int menu;
    String entrada;
    private String nome;
    private String usertyper;
    private String cpf;
    private Date datanasc;
    private String sexo;

    public MenuPrincipal(int _menu) {
        this.menu = _menu;
    }

    public int MostrarMenuPrincipal() {
        do {
            boolean numeros;
            do {
            // menu principal apresentará 5 opção que o usuário pode escolher, sendo que quando o numero 5 é digitado o sistema finaliza
            entrada = JOptionPane.showInputDialog("=====Menu Principal===== "
                    + "\n 1 - Introdução ao Sistema "
                    + "\n 2 - Cadastro de Pessoa  "
                    + "\n 3 - Listagem de Pessoas "
                    + "\n 4 - Alterar Pessoa "
                    + "\n 5 - Excluir Pessoa "
                    + "\n 6 - Sair");
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

                menu = Integer.parseInt(entrada);

            switch (menu) {
                case 1:
                    // pequena explicação do sistema e apos lido o usuário retorna ao menu principal
                    //JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz cadastramento de Pessoas, fazendo com que o usuário possa cadastrar, listar, pesquisar e remover. Sendo que o usuário pode ser um dos 3 tipos de pessoa, são eles: \n 1 - Aluno \n 2 - Funcionario, Sendo que o Funcionario pode ser subdividido em: \n 1 - Professor \n 2 - Gestor \n 3 - Auxiliar \n 4 - Outro tipo de Funcionario");
                    //MenuPrincipal mop = new MenuPrincipal(1);
                    //mop.MostrarMenuPrincipal(); 
                    IntroducaoSistema introducaoSistema = new IntroducaoSistema();
                    introducaoSistema.Introducao();
                    break;
                case 2:
                    //chamar menu de cadastro Pessoas
                    MenuPessoas mpe = new MenuPessoas(menupessoa);
                    mpe.MostrarMenuPessoas();
                    break;
                case 3:
                    //chama menu de listagem de Pessoas
                    MenuListar mls = new MenuListar(menulistar);
                    mls.MostrarMenuListar();
                    break;
                case 4:
                    //chama menu de pesquisa de Pessoas
                    MenuPesquisar mpq = new MenuPesquisar(menupesq);
                    mpq.MostrarMenuPesquisar();
                    break;
                case 5:
                    //chama menu de exclusão de Pessoas
                    MenuRemover mre = new MenuRemover(menuremove);
                    mre.MostrarMenuRemover();
                    break;
                case 6:
                    //finaliza sistema
                    JOptionPane.showMessageDialog(null, "Sistema Finalizado");
                    System.out.println("Sistema Finalizado");
                    break;
                default:
                    //informara que foi digitado uma opçãoo que não esta dentro das condições
                    System.out.println("Opção inválida");
                    JOptionPane.showMessageDialog(null, "opção inválida");
            }
        } while (menu != 6);

        return menu;

    }

}
