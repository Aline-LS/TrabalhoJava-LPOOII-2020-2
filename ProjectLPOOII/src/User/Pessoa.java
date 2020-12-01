/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import UserPessoa.Aluno;
import UserPessoaFuncionario.Gestor;
import UserPessoaFuncionario.OutroFuncionario;
import UserPessoaFuncionario.Professor;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public abstract class Pessoa {
    protected String usertyper;
    private String nome;
    private String cpf;
    private Date datanasc;
    private String sexo; 
    
//    public Pessoa(){}
    
    public Pessoa(String usertyper) {
        this.usertyper = usertyper;
        
    }

    protected String getUsertyper() {
        return usertyper;
    }

    protected void setUsertyper(String usertyper) {
        this.usertyper = usertyper;
    }

    
    
    public String Pessoa(){
        //Escolha o tipo de pessoa
        //reavaliação
        String[] itens = { "Aluno", "Funcionario" };
        usertyper = (String) JOptionPane.showInputDialog(null,"Escolha um item", "“Opçao”", JOptionPane.INFORMATION_MESSAGE, null,itens, itens [0]);
        
        //if(usertyper == "Aluno"){
        //    Aluno aluno = new Aluno(usertyper, nome, cpf, datanasc, sexo);
         //       aluno.MostrarDados();
        //}
        //if(usertyper == "Professor"){
        //    Professor prof = new Professor(usertyper, nome, cpf, datanasc, sexo);
        //        prof.MostrarDados();
        //}
        //if(usertyper == "Gestor"){
        //    Gestor gestor = new Gestor(usertyper, nome, cpf, datanasc, sexo);
        //        gestor.MostrarDados();
        //}
        //if(usertyper == "Aluno"){
        //    Aluno aluno = new Aluno(usertyper, nome, cpf, datanasc, sexo);
        //        aluno.MostrarDados();
        //}
        
       //if(usertyper == "Outro tipo de Funcionário"){
        //    OutroFuncionario outro = new OutroFuncionario(usertyper, nome, cpf, datanasc, sexo);
        //        outro.MostrarDados();
        //}
        
        
        return null;
        
    }
    
    public abstract String MostrarDados();

    public String MostrarDados(String usertyper, String nome, String cpf, Date datanasc, String sexo){
        return null;
    }

    
    
    public String toString(){
        return "Tipo de Pessoa:" + getUsertyper();
    }
    
    
    
}
