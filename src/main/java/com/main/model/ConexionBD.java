package com.main.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {

    Connection con;
    String db;
    String url;
    String user;
    String pass;

    public Connection conectar() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public ConexionBD() {
        jdbc:mysql://localhost:3306/bdvisorproyect3
        url = "jdbc:mysql://localhost:3306/bdvisorproyect3" ;
        user = "root";
        pass= "root";
        System.out.println("conectado");
    }

    public void desconectar() throws SQLException{
        con.close();
    }
}
