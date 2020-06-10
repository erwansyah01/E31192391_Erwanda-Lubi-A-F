/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class koneksi {
public koneksi(){
}
public Connection bukaKoneksi()throws SQLException{
    Connection kon=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        kon = DriverManager.getConnection("jdbc:mysql://localhost/fckharisma", "root", "");
        return kon;
    }
    catch(SQLException se){
        System.out.println("No Connection open");
        return null;
    }
catch(Exception ex){
    System.out.println("Cound not open connection");
    return null;
}
}
public static void main(String[] args) throws SQLException {
        koneksi fckharisma = new koneksi();
        System.out.println(fckharisma);
}
}
    
