/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

/**
 *
 * @author 934048
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DatabaseConnection {
    
    // Objetos da classe de conexão.
    private java.sql.Connection connection;
    private Statement statement;
    
    // Metodo de conexão.
    public boolean conexao() {
    try {
        // Estabelecendo conexão com o banco e criando objeto de execução sql.
            this.setConnection(DriverManager.getConnection("jdbc:mysql://localhost:3306/pokedex", "root", "duda#123A"));
            this.setStatement(getConnection().createStatement());
        return true;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Falha ao se conectar ao banco.");
        return false;
    }
}

public void fecharConexao() {
    // Garante que o Statement esteja preenchido e realiza o fechamento.
    try {
        if (getStatement() != null) {
                getStatement().close();
        }
    } catch (SQLException e) {
        // Lidar com a exceção de fechamento do Statement
    }
    // Garante que o Connection esteja preenchido e realiza o fechamento.
    try {
        if (getConnection() != null) {
                getConnection().close();
        }
    } catch (SQLException e) {
        // Lidar com a exceção de fechamento da DatabaseConnection
    }
}

    /**
     * @return the connection
     */
    public java.sql.Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(java.sql.Connection connection) {
        this.connection = connection;
    }

    /**
     * @return the statement
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}