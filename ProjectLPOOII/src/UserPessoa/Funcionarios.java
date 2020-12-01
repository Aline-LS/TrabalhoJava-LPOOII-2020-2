/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPessoa;

import User.Pessoa;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public abstract class Funcionarios extends Pessoa{
    protected String usertype;
    private String nome;
    private String cpf;
    private Date datanasc;
    private String sexo; 

    public Funcionarios(String usertyper,String usertype) {
        super(usertyper);
        this.usertype = usertype;
        
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    
    public String Funcionario(){
        
        JOptionPane.showMessageDialog(null, "Aluno", "Alertaw", JOptionPane.ERROR_MESSAGE);
        usertyper = "Funcionario";
        
        String[] itens = {"Professor", "Gestor", "Auxiliar", "Tecnico",   "Outro tipo de Funcionário" };
        usertype = (String) JOptionPane.showInputDialog(null,"Escolha um item", "“Opçao”", JOptionPane.INFORMATION_MESSAGE, null,itens, itens [0]);
        
        return null;
        
    }
    
   
    
}
