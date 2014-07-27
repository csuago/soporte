/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import formas.MiConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteController {

    PreparedStatement stmt;
    ResultSet rs;
    String table;

    public ClienteController(char mode) {
        if (mode == 'A') {
            this.table = "`soporte`.`analista`";
        } else {
            this.table = "`soporte`.`cliente`";
        }
    }

    public boolean existClienteById(int codigo) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("SELECT codigo FROM " + table + " WHERE codigo = ? LIMIT 1");
        stmt.setInt(1, codigo);
        rs = stmt.executeQuery();
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public boolean existClienteByCedula(String cedula) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("SELECT cedula FROM " + table + " WHERE cedula = ? LIMIT 1");
        stmt.setString(1, cedula);
        rs = stmt.executeQuery();
        if (rs.next()) {
            System.out.println("exite cedula");
            return true;
        }
        return false;
    }

    public void createCliente(Cliente data) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("INSERT INTO " + table + " (`nombre`,`cedula`,`telefono`,`descripcion`) VALUES(?,?,?,?)");
        stmt.setString(1, data.getNombre());
        stmt.setString(2, data.getCedula());
        stmt.setString(3, data.getTelefono());
        stmt.setString(4, data.getDescripcion());
        stmt.execute();
    }

    public Cliente getClienteById(int codigo) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("SELECT * FROM " + table + " WHERE codigo = ? LIMIT 1");
        stmt.setInt(1, codigo);
        rs = stmt.executeQuery();
        if (rs.next()) {
            Cliente data = new Cliente();
            data.setCodigo(rs.getInt("codigo"));
            data.setNombre(rs.getString("nombre"));
            data.setCedula(rs.getString("cedula"));
            data.setTelefono(rs.getString("telefono"));
            data.setDescripcion(rs.getString("descripcion"));
            return data;
        }
        return null;
    }

    public Cliente getClienteByCedula(String cedula) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("SELECT * FROM " + table + " WHERE cedula = ? LIMIT 1");
        stmt.setString(1, cedula);
        rs = stmt.executeQuery();
        if (rs.next()) {
            Cliente data = new Cliente();
            data.setCodigo(rs.getInt("codigo"));
            data.setNombre(rs.getString("nombre"));
            data.setCedula(rs.getString("cedula"));
            data.setTelefono(rs.getString("telefono"));
            data.setDescripcion(rs.getString("descripcion"));
            return data;
        }
        return null;
    }

    public List<Cliente> listCliente() throws SQLException {
        List<Cliente> listCliente = new ArrayList<Cliente>();
        rs = MiConexionBD.getMiConexion().prepareStatement("SELECT * FROM " + table).executeQuery();
        while (rs.next()) {
            Cliente data = new Cliente();
            data.setCodigo(rs.getInt("codigo"));
            data.setNombre(rs.getString("nombre"));
            data.setCedula(rs.getString("cedula"));
            data.setTelefono(rs.getString("telefono"));
            data.setDescripcion(rs.getString("descripcion"));
            listCliente.add(data);
        }
        return listCliente;
    }

    public List<Cliente> findCliente(String text) throws SQLException {
        List<Cliente> listCliente = new ArrayList<Cliente>();
        rs = MiConexionBD.getMiConexion().prepareStatement("SELECT * FROM " + table + " WHERE codigo = '" + text + "' or nombre LIKE '%" + text + "%' or cedula LIKE '%" + text + "%'").executeQuery();
        while (rs.next()) {
            Cliente data = new Cliente();
            data.setCodigo(rs.getInt("codigo"));
            data.setNombre(rs.getString("nombre"));
            data.setCedula(rs.getString("cedula"));
            data.setTelefono(rs.getString("telefono"));
            data.setDescripcion(rs.getString("descripcion"));
            listCliente.add(data);
        }
        return listCliente;
    }

    public void update(Cliente data) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("UPDATE " + table + " SET `nombre` = ?,`cedula` = ?,`telefono` = ?,`descripcion` = ? WHERE `codigo` = ?");
        stmt.setString(1, data.getNombre());
        stmt.setString(2, data.getCedula());
        stmt.setString(3, data.getTelefono());
        stmt.setString(4, data.getDescripcion());
        stmt.setInt(5, data.getCodigo());
        stmt.execute();
    }

    public void deleteById(String codigo) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("DELETE FROM " + table + " WHERE codigo = ?");
        stmt.setString(1, codigo);
        stmt.execute();
    }

    public void deleteByCedula(String cedula) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("DELETE FROM " + table + " WHERE cedula = ?");
        stmt.setString(1, cedula);
        stmt.execute();
    }

}
