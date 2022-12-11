//CLASSE DE OPERAÇÕES RELACIONADAS AOS PRODUTOS
package Pacote;

//import java.sql.Connection;
import java.util.List;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.util.LinkedList;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperacoesProduto implements InterOperacoesProduto {

    @Override
    public void cadastrar(Connection con, Produto p) {
        String sql = "insert into produto (nome, marca, descricao, codigo, preco, quantidade, categoria) values (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, p.getNome());
            stm.setString(2, p.getMarca());
            stm.setString(3, p.getModelo());
            stm.setString(4, p.getDescricao());
            stm.setInt(5, p.getCodigo());
            stm.setDouble(6, p.getPreco());
            stm.setInt(7, p.getQuantidade());
            stm.setString(4, p.getCategoria());
            stm.executeUpdate();

        } catch (SQLException error) {
            System.out.println("Não foi possivel cadastrar o produto no sistema!");
            System.out.println("O seguinte erro ocorreu:");
            error.printStackTrace();
        }
    }

    @Override
    public void remover(Connection con, Produto p) {
        String sql = "delete produto where codigo = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, p.getCodigo());
            stm.executeUpdate();
        } catch (SQLException error) {
            System.out.println("Não foi possivel remover o produto do sistema!");
            System.out.println("O seguinte erro ocorreu:");
            error.printStackTrace();
        }
    }

    @Override
    public void editar(Connection con, Produto p) {
        String sql = "update produto set nome = ?, marca = ?, modelo = ?, descricao = ?, preco = ?, quantidade = ?, categoria = ? where codigo = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, p.getNome());
            stm.setString(2, p.getMarca());
            stm.setString(3, p.getModelo());
            stm.setString(4, p.getDescricao());
            stm.setDouble(5, p.getPreco());
            stm.setInt(6, p.getQuantidade());
            stm.setInt(7, p.getCodigo());
            stm.setString(8, p.getCategoria());
            stm.executeUpdate();
        } catch (SQLException error) {
            System.out.println("Não foi possivel completar a edição!");
            System.out.println("O seguinte erro ocorreu:");
            error.printStackTrace();
        }
    }

    @Override
    public List exibir(Connection con) {
        List produtos = new LinkedList();
        try {
            ResultSet rs = con.createStatement().executeQuery("select nome, marca, modelo, descricao, preco, quantidade, codigo, categoria from produto");
            while (rs.next()) {
                String nome = rs.getString("nome");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String descricao = rs.getString("descricao");
                double preco = rs.getDouble("preco");
                int quantidade = rs.getInt("quantidade");
                int codigo = rs.getInt("codigo");
                String categoria = rs.getString("categoria");

                Produto p = new Produto(nome, modelo, marca, descricao, codigo, preco, quantidade, categoria);
                produtos.add(p);
            }
        } catch (SQLException error) {
            Logger.getLogger(OperacoesProduto.class.getName()).log(Level.SEVERE, null, error);
        }
        return produtos;
    }

    @Override
    public List retornarProduto(Connection con, int codigoInformado) {

        List infoProduto = new ArrayList();

        String sql = "select nome, marca, modelo, descricao, preco, quantidade, codigo, categoria from produto where codigo = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = con.createStatement().executeQuery("select nome, marca, modelo, descricao, preco, quantidade, codigo, idCategoria from produto where codigo = ?");
            stm.setInt(1, codigoInformado);
            stm.executeUpdate();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String descricao = rs.getString("descricao");
                double preco = rs.getDouble("preco");
                int quantidade = rs.getInt("quantidade");
                int codigo = rs.getInt("codigo");
                String categoria = rs.getString("categoria");

                String precoStr = String.valueOf(preco);
                String quantidadeStr = String.valueOf(quantidade);
                String codigoStr = String.valueOf(codigo);
                
                infoProduto.add(nome);
                infoProduto.add(marca);
                infoProduto.add(modelo);
                infoProduto.add(descricao);
                infoProduto.add(precoStr);
                infoProduto.add(quantidadeStr);
                infoProduto.add(codigoStr);
                infoProduto.add(categoria);

            }
        } catch (SQLException ex) {
            Logger.getLogger(OperacoesProduto.class.getName()).log(Level.SEVERE, null, ex);

        }

        return infoProduto;
    }

}
