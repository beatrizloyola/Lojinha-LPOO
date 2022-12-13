package pacoteClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacoesCliente implements InterOperacoesCliente {

    public List<Cliente> ler(Connection con) throws SQLException {
        List lc = new LinkedList();
        ResultSet rs = con.createStatement()
                .executeQuery("select nome, cpf, endereco, telefone");
        while (rs.next()) {
            String nome = rs.getString("nome");
            String cpf = rs.getString("cpf");
            String endereco = rs.getString("endereco");
            String telefone = rs.getString("telefone");
            Cliente cliente = new Cliente(nome, cpf, endereco, telefone);
            lc.add(cliente);
        }

        return lc;

    }

    @Override
    public void cadastrarCliente(Connection con, Cliente cliente) {
        String sql = "insert into cliente (nome, cpf, telefone, endereco) values (?, ?, ?, ?)";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(2, cliente.getNome());
            stm.setString(2, cliente.getCpf());
            stm.setString(2, cliente.getTelefone());
            stm.setString(2, cliente.getEndereco());
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void removerCliente(Connection con, Cliente cliente) {
        String sql = "delete cliente where cpf = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, cliente.getCpf());
            stm.executeUpdate();
        } catch (Exception e) {
        }

    }

    @Override
    public void alterarDadosCliente(Connection con, Cliente cliente) {
        String sql = "update cliente set nome=? cpf=? telefone=? endereco=? where cpf = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(2, cliente.getNome());
            stm.setString(2, cliente.getCpf());
            stm.setString(2, cliente.getTelefone());
            stm.setString(2, cliente.getEndereco());
            stm.executeUpdate();
        } catch (SQLException error) {
            System.out.println("Não foi possivel completar a edição!");
            System.out.println("O seguinte erro ocorreu:");
            error.printStackTrace();
        }
    }

    @Override
    public List exibirCliente(Connection con) {
        List clientes = new LinkedList();
        try {
            ResultSet rs = con.createStatement().executeQuery("select nome, cpf, endereco, telefone from cliente");
            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");

                Cliente c = new Cliente(nome, cpf, endereco, telefone);
                clientes.add(c);
            }
        } catch (SQLException error) {
            Logger.getLogger(OperacoesProduto.class.getName()).log(Level.SEVERE, null, error);
        }
        return clientes;
    }

}
