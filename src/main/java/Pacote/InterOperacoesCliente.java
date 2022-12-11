package Pacote;

import java.sql.Connection;
import java.util.List;

public interface InterOperacoesCliente {
    public abstract void cadastrarCliente(Connection con, Cliente cliente);
    public abstract void removerCliente(Connection con, Cliente cliente);
    public abstract void alterarDadosCliente(Connection con, Cliente cliente);
    public abstract List exibirCliente(Connection con);
}
