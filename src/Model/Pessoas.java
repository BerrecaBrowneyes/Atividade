/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rebeca Cecilio Bernardi
 */
public class Pessoas {
    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;
    private String email;
    private String endereco;
    private String num;       
    private String cidade;       
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNum() {
        return num;
    }

    
    public void setNum(String num) {
        this.num = num;
    }

    
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void Mostrarpessoas(){
        System.out.println("Nome: "+getNome());
        System.out.println("Sobrenome: "+getSobrenome());
        System.out.println("RG: "+getRg());
        System.out.println("CPF: "+getCpf());
        System.out.println("Email: "+getEmail());
        System.out.println("Cidade: "+getCidade());
        System.out.println("N°: "+getNum());
        System.out.println("Estado: "+getEstado());
        System.out.println("------------------------------");
        
    }
            
}
