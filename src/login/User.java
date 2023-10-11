package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Esta classe representa um Usuário e possúi métodos para fazer a conexão com o banco de dados
 * e para verificar o Usuário.
 */
public class User {
    /**
     * Método que utiliza JDBC para realizar a conexão com o banco de dados.
     * @return O Objeto de conexão com o banco de dados.
     */
    public Connection conectarBD(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
            }catch (Exception e) { }
        return conn;}

    /**
     * Atributo utilizado para armazenar uma String contendo o nome do Usuário, inicializado
     * com uma String vazia.
     */
    public String nome="";
    /**
     * Atributo booleano utilizado para armazenar o resultado da verificação do Usuário,
     * inicializado com false.
     */
    public boolean result = false;
    /**
     * Método que verifica o Usuário com base no login e senha, e armazena o nome do Usuário
     * no atributo nome caso a verificação seja bem sucedida.
     * @param login
     * @param senha
     * @return O resultado da verificação do Usuário.
     */
    public boolean verificarUsuario(String login, String senha){
        String sql = "";
        Connection conn = conectarBD();
        sql += "select nome from usuarios ";
        sql +="where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                result = true;
                nome = rs.getString("nome");}
            }catch (Exception e) { }
        return result; }
    }