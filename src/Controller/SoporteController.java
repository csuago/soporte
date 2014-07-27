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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Soporte;

public class SoporteController {

    PreparedStatement stmt;
    ResultSet rs;

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public boolean existSoporteById(int oid) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("SELECT * FROM soporte WHERE oid = ? LIMIT 1");
        stmt.setInt(1, oid);
        rs = stmt.executeQuery();
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public boolean createSoporte(Soporte data) throws SQLException {
        if(data != null) {
            if(data.getOid() == 0) {
                stmt = MiConexionBD.getMiConexion().prepareStatement("INSERT INTO `soporte`.`soporte` (`cliente`,`fecharec`,`fechasal`,`analista`,`codbien`,`desequipo`,`dessoporte`,`tiempo`,`reparacion`,`instalacion`,`cerrado`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
                stmt.setInt(1, data.getCliente());
                stmt.setDate(2, data.getFechaRec());
                stmt.setDate(3, data.getFechaSal());
                stmt.setInt(4, data.getAnalista());
                stmt.setInt(5, data.getCodBien());
                stmt.setString(6, data.getDesEquipo());
                stmt.setString(7, data.getDesSoporte());
                stmt.setString(8, getDateTime());
                stmt.setBoolean(9, data.isReparacion());
                stmt.setBoolean(10, data.isInstalacion());
                stmt.setBoolean(11, data.isReparacion());
                return stmt.execute();
            }
            else {
                return update(data);
            }
        }
        return true;
    }

    public Soporte getSoporteById(int codigo) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("SELECT * FROM soporte WHERE codigo = ? LIMIT 1");
        stmt.setInt(1, codigo);
        rs = stmt.executeQuery();
        if (rs.next()) {
            Soporte data = new Soporte();
            data.setOid(rs.getInt("oid"));
            data.setCliente(rs.getInt("cliente"));
            data.setFechaRec(rs.getDate("fecharec"));
            data.setFechaSal(rs.getDate("fechasal"));
            data.setAnalista(rs.getInt("analista"));
            data.setCodBien(rs.getInt("codbien"));
            data.setDesEquipo(rs.getString("desequipo"));
            data.setDesSoporte(rs.getString("dessoporte"));
            data.setReparacion(rs.getBoolean("reparacion"));
            data.setInstalacion(rs.getBoolean("instalacion"));
            data.setCerrado(rs.getBoolean("cerrado"));
            return data;
        }
        return null;
    }

    public List<Soporte> listSoporte() throws SQLException {
        List<Soporte> listSoporte = new ArrayList<Soporte>();
        rs = MiConexionBD.getMiConexion().prepareStatement("SELECT * FROM soporte").executeQuery();
        while (rs.next()) {
            Soporte data = new Soporte();
            data.setOid(rs.getInt("oid"));
            data.setCliente(rs.getInt("cliente"));
            data.setFechaRec(rs.getDate("fecharec"));
            data.setFechaSal(rs.getDate("fechasal"));
            data.setAnalista(rs.getInt("analista"));
            data.setCodBien(rs.getInt("codbien"));
            data.setDesEquipo(rs.getString("desequipo"));
            data.setDesSoporte(rs.getString("dessoporte"));
            data.setReparacion(rs.getBoolean("reparacion"));
            data.setInstalacion(rs.getBoolean("instalacion"));
            data.setCerrado(rs.getBoolean("cerrado"));
            listSoporte.add(data);
        }
        return listSoporte;
    }

    public boolean update(Soporte data) throws SQLException {
        if(data != null) {
            if(data.getOid() != 0) {
                stmt = MiConexionBD.getMiConexion().prepareStatement("UPDATE `soporte`.`soporte`\n"
                        + "SET `cliente` = ?,`fecharec` = ?,`fechasal` = ?,`analista` = ?,`codbien` = ?,`desequipo` = ?,`dessoporte` = ?,`reparacion` = ?,`instalacion` = ?,\n"
                        + "`cerrado` = ? WHERE `oid` = ?;");
                stmt.setInt(1, data.getCliente());
                stmt.setDate(2, data.getFechaRec());
                stmt.setDate(3, data.getFechaSal());
                stmt.setInt(4, data.getAnalista());
                stmt.setInt(5, data.getCodBien());
                stmt.setString(6, data.getDesEquipo());
                stmt.setString(7, data.getDesSoporte());
                stmt.setBoolean(8, data.isReparacion());
                stmt.setBoolean(9, data.isInstalacion());
                stmt.setBoolean(10, data.isReparacion());
                stmt.setInt(11, data.getOid());
                return stmt.execute();
            }
            else {
                return createSoporte(data);
            }            
        }
        return true;
    }

    public boolean deleteById(int oid) throws SQLException {
        stmt = MiConexionBD.getMiConexion().prepareStatement("UPDATE soporte SET edo_reg ='D' WHERE oid = ?");
        stmt.setInt(1, oid);
        return stmt.execute();
    }
}
