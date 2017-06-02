/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tercer_trimestre;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author artur
 */
public class Metodos {
    
    public static void crearBaseVuelos(){
        String url = "jdbc:sqlite:BaseAviones.db";
 
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("El nombre de la base de datos es " + meta.getDriverName());
                System.out.println("La base de datos ha sido creada");
            }
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void crearTablaAviones(){
        
        String url = "jdbc:sqlite:BaseAviones";
        
        String sql = "CREATE TABLE IF NOT EXIST Aviones(\n"
                + "id text PRIMARY KEY,\n"
                + "nombrefabricante text NOT NULL,\n"
                + "modelo text NOT NULL,\n"
                + "numeroserie integer NOT NULL,\n"
                + "potencia integer NOT NULL,\n"
                + "npasajeros integer NOT NULL\n"
                + "origen text NOT NULL,\n"
                + "destino text NOT NULL,\n"
                + ""
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void insertarAviones(String tablamos,String nombrefabricante,String modelo,int numeroserie,int potencia,int npasajeros,String origen,String destino){
        
        String sql = "INSERT INTO "+tablamos+"nombrefabricante,modelo,numeroserie,potencia,npasajeros,origen,destino";
    }
}
