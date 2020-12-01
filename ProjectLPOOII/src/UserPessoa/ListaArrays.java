/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPessoa;

import UserPessoaFuncionario.Auxiliar;
import UserPessoaFuncionario.Gestor;
import UserPessoaFuncionario.OutroFuncionario;
import UserPessoaFuncionario.Professor;
import UserPessoaFuncionario.Tecnico;
import UserPessoa.Aluno;

import java.util.ArrayList;

/**
 *
 * @author Emilio
 */
public class ListaArrays {
    //lista de alunos -> todo novo aluno cadastrado sera inserido na lista
    private static ArrayList<Aluno> ListaAlunos = new ArrayList<>();
    
    //metodo get
    public static ArrayList<Aluno> getListaAlunos(){
        return ListaAlunos;
    }
    // add um aluno a lista
    static public void adicionaraluno(Aluno a){
        ListaAlunos.add(a);
    }
    
    //listar os dados de todos os objetos da lista
    static public String listaraluno(){
        String saida = "";
        
        for(Aluno a : ListaAlunos){
            int i = 1;
            saida += "\n====== Alunos Nº " + (i++) + "=====\n";
            saida += a.Imprimir() + "\n";
        }
        return saida;
    }
    
    //metodo para pesquisar por nome
    static public int pesquisaraluno(String nome){
        int qtd = 0;
        
        for(Aluno a : ListaAlunos){
            System.out.println(a.getNome()+"-"+nome);
            if(a.getNome().equalsIgnoreCase(nome)){
                qtd++;
            }
        }
        
        return qtd;
    }

    
    // remover um aluno pelo nome
    static public boolean removeraluno(String nome){
        for(Aluno a : ListaAlunos){
            if(a.getNome().equalsIgnoreCase(nome)){
                ListaAlunos.remove(a);
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    //lista de Auxiliares -> todo novo auxiliar cadastrado sera inserido na lista
    private static ArrayList<Auxiliar> ListaAuxiliares = new ArrayList<>();
    
    //metodo get
    public static ArrayList<Auxiliar> getListaAuxiliares(){
        return ListaAuxiliares;
    }
    // add um auxiliar a lista
    static public void adicionarauxiliar(Auxiliar au){
        ListaAuxiliares.add(au);
    }
    
    //listar os dados de todos os objetos da lista
    static public String listarauxiliar(){
        String saida = "";
        
        for(Auxiliar au : ListaAuxiliares){
            int i = 1;
            saida += "\n====== Alunos Nº " + (i++) + "=====\n";
            saida += au.Imprimir() + "\n";
        }
        return saida;
    }
    
    //metodo para pesquisar por nome
    static public int pesquisarauxiliar(String nome){
        int qtd = 0;
        
        for(Auxiliar au : ListaAuxiliares){
            System.out.println(au.getNome()+"-"+nome);
            if(au.getNome().equalsIgnoreCase(nome)){
                qtd++;
            }
        }
        
        return qtd;
    }

    
    // remover um auxiliar pelo nome
    static public boolean removerauxiliar(String nome){
        for(Auxiliar au : ListaAuxiliares){
            if(au.getNome().equalsIgnoreCase(nome)){
                ListaAuxiliares.remove(au);
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    //lista de gestor -> todo novo gestor cadastrado sera inserido na lista
    private static ArrayList<Gestor> ListaGestores = new ArrayList<>();
    
    //metodo get
    public static ArrayList<Gestor> getListaGestores(){
        return ListaGestores;
    }
    // add um gestor a lista
    static public void adicionargestor(Gestor g){
        ListaGestores.add(g);
    }
    
    //listar os dados de todos os objetos da lista
    static public String listargestor(){
        String saida = "";
        
        for(Gestor g : ListaGestores){
            int i = 1;
            saida += "\n====== Gestor Nº " + (i++) + "=====\n";
            saida += g.Imprimir() + "\n";
        }
        return saida;
    }
    
    //metodo para pesquisar por nome
    static public int pesquisargestor(String nome){
        int qtd = 0;
        
        for(Gestor g : ListaGestores){
            System.out.println(g.getNome()+"-"+nome);
            if(g.getNome().equalsIgnoreCase(nome)){
                qtd++;
            }
        }
        
        return qtd;
    }

    
    // remover um gestor pelo nome
    static public boolean removergestor(String nome){
        for(Gestor g : ListaGestores){
            if(g.getNome().equalsIgnoreCase(nome)){
                ListaGestores.remove(g);
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    //lista de professores -> todo novo professor cadastrado sera inserido na lista
    private static ArrayList<Professor> ListaProfessores = new ArrayList<>();
    
    //metodo get
    public static ArrayList<Professor> getListaProfessores(){
        return ListaProfessores;
    }
    // add um professor a lista
    static public void adicionarprofessor(Professor p){
        ListaProfessores.add(p);
    }
    
    //listar os dados de todos os objetos da lista
    static public String listarprofessor(){
        String saida = "";
        
        for(Professor p : ListaProfessores){
            int i = 1;
            saida += "\n====== Professores Nº " + (i++) + "=====\n";
            saida += p.Imprimir() + "\n";
        }
        return saida;
    }
    
    //metodo para pesquisar por nome
    static public int pesquisarprofessor(String nome){
        int qtd = 0;
        
        for(Professor p : ListaProfessores){
            System.out.println(p.getNome()+"-"+nome);
            if(p.getNome().equalsIgnoreCase(nome)){
                qtd++;
            }
        }
        
        return qtd;
    }

    
    // remover um professor pelo nome
    static public boolean removerprofessor(String nome){
        for(Professor p : ListaProfessores){
            if(p.getNome().equalsIgnoreCase(nome)){
                ListaProfessores.remove(p);
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    //lista de Tecnicos -> todo novo tecnico cadastrado sera inserido na lista
    private static ArrayList<Tecnico> ListaTecnicos = new ArrayList<>();
    
    //metodo get
    public static ArrayList<Tecnico> getListaTecnicos(){
        return ListaTecnicos;
    }
    // add um gestor a lista
    static public void adicionartecnico(Tecnico t){
        ListaTecnicos.add(t);
    }
    
    //listar os dados de todos os objetos da lista
    static public String listartecnico(){
        String saida = "";
        
        for(Tecnico t : ListaTecnicos){
            int i = 1;
            saida += "\n====== Gestor Nº " + (i++) + "=====\n";
            saida += t.Imprimir() + "\n";
        }
        return saida;
    }
    
    //metodo para pesquisar por nome
    static public int pesquisartecnico(String nome){
        int qtd = 0;
        
        for(Tecnico t : ListaTecnicos){
            System.out.println(t.getNome()+"-"+nome);
            if(t.getNome().equalsIgnoreCase(nome)){
                qtd++;
            }
        }
        
        return qtd;
    }

    
    // remover um tecnico pelo nome
    static public boolean removertecnico(String nome){
        for(Tecnico t : ListaTecnicos){
            if(t.getNome().equalsIgnoreCase(nome)){
                ListaTecnicos.remove(t);
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
     //lista de outrofuncionario -> todo novo outrofuncionario cadastrado sera inserido na lista
    private static ArrayList<OutroFuncionario> ListaOutroFuncionarios = new ArrayList<>();
    
    //metodo get
    public static ArrayList<OutroFuncionario> getListaOutroFuncionarios(){
        return ListaOutroFuncionarios;
    }
    // add um gestor a lista
    static public void adicionaroutrofuncionario(OutroFuncionario o){
        ListaOutroFuncionarios.add(o);
    }
    
    //listar os dados de todos os objetos da lista
    static public String listaroutrofuncionario(){
        String saida = "";
        
        for(OutroFuncionario o : ListaOutroFuncionarios){
            int i = 1;
            saida += "\n====== Outros Funcionarios Nº " + (i++) + "=====\n";
            saida += o.Imprimir() + "\n";
        }
        return saida;
    }
    
    //metodo para pesquisar por nome
    static public int pesquisaroutrofuncionario(String nome){
        int qtd = 0;
        
        for(OutroFuncionario o : ListaOutroFuncionarios){
            System.out.println(o.getNome()+"-"+nome);
            if(o.getNome().equalsIgnoreCase(nome)){
                qtd++;
            }
        }
        
        return qtd;
    }

    
    // remover um gestor pelo nome
    static public boolean removeroutrofuncionario(String nome){
        for(OutroFuncionario o : ListaOutroFuncionarios){
            if(o.getNome().equalsIgnoreCase(nome)){
                ListaOutroFuncionarios.remove(o);
                return true;
            }
        }
        return false;
    }
    
}
