package JavaApplicationCliente;

import javax.swing.JLabel;


public class Clientes{

    String nome;
    long cpf;     
    String endereco;
    Integer numero;
    String cidade;
    String estado;
    Long telefone;


    
public Clientes(String nome, String cpf, String endereco, String numero, String cidade, String estado, String telefone) {
                this.nome = nome;
                this.cpf = Long.valueOf(cpf.trim());
                this.endereco = endereco;
                this.numero = Integer.valueOf(numero.trim());
                this.cidade = cidade;
                this.estado = estado;
                this.telefone = Long.valueOf(telefone.trim());

    }

    public Clientes(String nome, JLabel CPF, Object object, JLabel CPF0, Object object0, Object object1, JLabel CPF1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Clientes(String nome, String Cpf, Object object, JLabel CPF, Object object0, Object object1, JLabel CPF0, Object par7) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cpf ^ (cpf >>> 32));
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Clientes others = (Clientes) obj;
        if (cpf != others.cpf)
            return false;
        return true;
    }




    
    @Override
    public String toString() {
        return "Cliente: nome=" + nome + ", cpf=" + cpf + ",endereco=" + endereco + ", numero=" + numero + ", cidade=" + cidade + ", estado=" + estado + ", telefone=" + telefone;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public Long getTelefone() {
        return telefone;
    }
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
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


}