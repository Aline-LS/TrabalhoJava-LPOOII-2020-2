/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPessoaFuncionario;

import UserPessoa.Funcionarios;
import UserPessoa.ValidaCPF;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class Professor extends Funcionarios{
    private String nome;
    private String cpf;
    private Date datanasc;
    private String sexo; 
    
    public Professor(String usertyper,String usertype, String nome, String cpf, Date datanasc, String sexo) {
        super(usertyper, usertype);
        this.nome = nome;
        this.cpf = cpf;
        this.datanasc = datanasc;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    @Override
    public String MostrarDados(){
        
            
        try {
            //Escolha o tipo de pessoa
            //abaixo um tipo de seleçção para usuario
            //String[] itens = { "Funcionario"};
            //usertyper = (String) JOptionPane.showInputDialog(null,"Escolha um item", "“Opçao”", JOptionPane.INFORMATION_MESSAGE, null,itens, itens [0]);
            //usertyper = "Funcionario";
            //System.out.println("Tipo de Pessoa: " + getUsertyper());
            
            //Aviso do tipo de Pessoa na qual escolheu
            JOptionPane.showMessageDialog(null, "Funcionario", "Alertaw", JOptionPane.ERROR_MESSAGE);
            usertyper = "Funcionario";
            
            JOptionPane.showMessageDialog(null, "Professor", "Alertaw", JOptionPane.ERROR_MESSAGE);
            usertype = "Professor";

            
            //Digite o nome
            setNome(JOptionPane.showInputDialog("Digite o nome:"));
            System.out.println("Nome Funcionário Professor(a): " + getNome());
            
            //Inserção do CPF e validação do mesmo
            do{
                setCpf (JOptionPane.showInputDialog("Digite o CPF" + getCpf()));
                System.out.println("CPF Funcionário Professor:" + getCpf());
                System.out.printf("\nResultado: ");
                // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
                if (ValidaCPF.isCPF(cpf) == true){
                    System.out.printf("%s\n", ValidaCPF.imprimeCPF(cpf));
                }else{ System.out.printf("Erro, CPF invalido !!!\n");
                }
            }while(ValidaCPF.isCPF(cpf) != true);
            
            
            //Inserção de data de nacimento da pessoa
            String data = JOptionPane.showInputDialog(null, "Data de Nascimento: ","Data",JOptionPane.OK_OPTION);
            datanasc = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            System.out.println("Data de Nascimento: " + getDatanasc());
            
            //datanasc = new SimpleDateFormat("dd-MM-yyyy");
            //JOptionPane.showMessageDialog(null, "Data de Nascimento: " + datanasc);
            
            //Inserção do tipo sexo
            Object[] tipos = { "Feminino", "Masculino"  };
            sexo =(String) JOptionPane.showInputDialog(null,"Escolha um item", "“Escolha”", JOptionPane.INFORMATION_MESSAGE, null,tipos, tipos [0]);
            System.out.println("Sexo: " + getSexo());
            
            
            
            
            return null;
        } catch (ParseException ex) {
            Logger.getLogger(OutroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
   public String Imprimir(){
       return "Tipo de Pessoa:" + getUsertyper()+ "Tipo de Funcionario:" + getUsertype()+ "\n Nome:" +getNome() + 
               "\n CPF:" + ValidaCPF.imprimeCPF(cpf) + "\n Data de Nascimento:" + getDatanasc() + 
               "\n Sexo:" + getSexo();
       
   }
    
    
    
}



