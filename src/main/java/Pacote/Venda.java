package Pacote;

public class Venda {
    
    private String cpfCliente;
    private int id;
    private int quantidade;
    private String dataVenda;
    
        public Venda(String cpf_Cliente, int id, String dataVenda) {
        this.cpfCliente = cpf_Cliente;
        this.id = id;
        this.dataVenda = dataVenda;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpf_Cliente) {
        this.cpfCliente = cpf_Cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getDataVenda() {
        return dataVenda;
    }

    public void setData(String dataVenda) {
        this.dataVenda = dataVenda;
    }
}
