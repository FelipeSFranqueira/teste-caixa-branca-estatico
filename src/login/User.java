package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    public Connection conectarBD(){
        /* 3 */Connection conn = null;
        /* 4 */try{
            /* 5 */Class.forName("com.mysql.Driver.Manager").newInstance();
            /* 5 */String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            /* 5 */conn = DriverManager.getConnection(url);
            /* 6 */}catch (Exception e) { }/* 7 */
        /* 8 */return conn;}
    public String nome="";
    public boolean result = false;
    public boolean verificarUsuario(String login, String senha){
        /* 1 */String sql = "";
        /* 2 */Connection conn = conectarBD();
        //INSTRUÇÃO SQL
        /* 9 */sql += "select nome from usuarios ";
        /* 9 */sql +="where login = " + "'" + login + "'";
        /* 9 */sql += " and senha = " + "'" + senha + "';";
        /* 10 */try{
            /* 11 */Statement st = conn.createStatement();
            /* 11 */ResultSet rs = st.executeQuery(sql);
            /* 12 */if(rs.next()){
                /* 13 */result = true;
                /* 13 */nome = rs.getString("nome");}
            /* 14 */}catch (Exception e) { }/* 15 */
        /* 16 */return result; }
    }//fim da class