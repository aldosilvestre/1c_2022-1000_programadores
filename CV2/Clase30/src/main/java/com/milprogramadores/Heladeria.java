package com.milprogramadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Heladeria {

    private static final String URL_DB = "jdbc:mysql://localhost:3306/gredo";
    private static final String USER = "aldo";
    private static final String PASS = "password";

    private Statement getStatement() {
        try {
            Connection conn = DriverManager.getConnection(URL_DB, USER, PASS);
            return conn.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

    public List<Sabor> obtenerSabores() {
        List<Sabor> listaSabores = new ArrayList<>();
        Statement stm = getStatement();

        try {
            ResultSet rs = stm.executeQuery("select * from SABOR");

            while (rs.next()) {
                listaSabores.add(new Sabor(rs.getString("nombre"), rs.getString("descripcion"), rs.getDouble("precio"),
                        rs.getString("tipo")));
            }
            return listaSabores;
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return listaSabores;
    }

    public void guardarNuevoSabor(Sabor nuevoSabor) throws SQLException {
        Statement stm = getStatement();
        stm.executeUpdate("insert into SABOR(nombre, descripcion, precio, tipo) value('" + nuevoSabor.getNombre()
                + "','" + nuevoSabor.getDescripcion() + "'," + nuevoSabor.getPrecio() + ",'" + nuevoSabor.getTipo()
                + "')");
    }

    public Boolean isAdmin(Usuario usuario) {

        Statement stm = getStatement();

        try {
            ResultSet rs = stm.executeQuery("select is_admin from USUARIO where email='" + usuario.getEmail() + "'");
            if (rs.next()) {
                return rs.getBoolean("is_admin");
            }
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return false;
    }

}
