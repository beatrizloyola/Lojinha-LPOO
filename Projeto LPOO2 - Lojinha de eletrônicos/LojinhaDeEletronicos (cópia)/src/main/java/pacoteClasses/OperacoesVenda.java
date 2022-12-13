package pacoteClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class OperacoesVenda implements InterOperacoesVenda {

    public List<Venda> ler(Connection con) throws SQLException {
        List lc = new LinkedList();
        ResultSet rs = con.createStatement().executeQuery("select cliente, id, dataVenda from vendas");
        while (rs.next()) {
            String cpf = rs.getString("cliente");
            int id = rs.getInt("id");
            String dataVenda = rs.getString("dataVenda");
            Venda venda = new Venda(cpf, id, dataVenda);
            lc.add(venda);
        }

        return lc;

    }

    @Override
    public void compra(Connection con, Venda venda, Produto produto) {
        String sql = "insert into venda (cpf_Cliente, dataVenda) values (?, NOW())";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, venda.getCpfCliente());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
        String sql2 = "insert into venda_produto (venda, produto, quantidade) values (?, ?, ?)";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, venda.getId());
            stm.setInt(2, produto.getCodigo());
            stm.setInt(3, venda.getQuantidade());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void devolucao(Connection con, Venda venda) {
        String sql = "delete venda where id = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(3, venda.getId());
            stm.executeUpdate();
        } catch (SQLException e) {
        }

    }
}
