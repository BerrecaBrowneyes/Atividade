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
public class Empresas {
    private String nome;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String estado;
    private String num;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void MostrarEmpresa(){
        System.out.println("Nome da Empresa: "+getNome());
        System.out.println("CNPJ: "+getCnpj());
        System.out.println("CPF: "+getCpf());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("N°: "+getNum());
        System.out.println("Cidade: "+getCidade());
        System.out.println("Estado: "+getEstado());
        System.out.println("----------------------------");
        
    }
    
}
