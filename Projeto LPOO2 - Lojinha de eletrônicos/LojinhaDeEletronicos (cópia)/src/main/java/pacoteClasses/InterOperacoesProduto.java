package pacoteClasses;

import java.util.List;
import java.sql.Connection;

public interface InterOperacoesProduto {

    public abstract void cadastrar(Connection con, Produto p);

    public abstract void remover(Connection con, Produto p);

    public abstract void editar(Connection con, Produto p);

    public abstract List exibir(Connection con);

    public abstract List retornarProduto(Connection con, int codigoInformado);

    public abstract boolean verificarExistencia(Connection con, int codigoVerificar);

    public abstract Produto retornarUmProduto(Connection con, int codigoProduto);
}
