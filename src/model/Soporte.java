/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author carlos
 */
@Entity
public class Soporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int oid;
    private int cliente;
    private Date fechaRec;
    private Date fechaSal;
    private int analista;
    private int codBien;
    private String desEquipo;
    private String desSoporte;
    private boolean reparacion;
    private boolean instalacion;
    private boolean cerrado;

    public Soporte() {
    }

    public Soporte(Long id, int oid, int cliente, Date fechaRec, Date fechaSal, int analista, int codBien, String desEquipo, String desSoporte, boolean reparacion, boolean instalacion, boolean cerrado) {
        this.id = id;
        this.oid = oid;
        this.cliente = cliente;
        this.fechaRec = fechaRec;
        this.fechaSal = fechaSal;
        this.analista = analista;
        this.codBien = codBien;
        this.desEquipo = desEquipo;
        this.desSoporte = desSoporte;
        this.reparacion = reparacion;
        this.instalacion = instalacion;
        this.cerrado = cerrado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soporte)) {
            return false;
        }
        Soporte other = (Soporte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public Date getFechaRec() {
        return fechaRec;
    }

    public void setFechaRec(Date fechaRec) {
        this.fechaRec = fechaRec;
    }

    public Date getFechaSal() {
        return fechaSal;
    }

    public void setFechaSal(Date fechaSal) {
        this.fechaSal = fechaSal;
    }

    public int getAnalista() {
        return analista;
    }

    public void setAnalista(int analista) {
        this.analista = analista;
    }

    public int getCodBien() {
        return codBien;
    }

    public void setCodBien(int codBien) {
        this.codBien = codBien;
    }

    public String getDesEquipo() {
        return desEquipo;
    }

    public void setDesEquipo(String desEquipo) {
        this.desEquipo = desEquipo;
    }

    public String getDesSoporte() {
        return desSoporte;
    }

    public void setDesSoporte(String desSoporte) {
        this.desSoporte = desSoporte;
    }

    public boolean isReparacion() {
        return reparacion;
    }

    public void setReparacion(boolean reparacion) {
        this.reparacion = reparacion;
    }

    public boolean isInstalacion() {
        return instalacion;
    }

    public void setInstalacion(boolean instalacion) {
        this.instalacion = instalacion;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    @Override
    public String toString() {
        return "Soporte{" + "id=" + id + ", oid=" + oid + ", cliente=" + cliente + ", fechaRec=" + fechaRec + ", fechaSal=" + fechaSal + ", analista=" + analista + ", codBien=" + codBien + ", desEquipo=" + desEquipo + ", desSoporte=" + desSoporte + ", reparacion=" + reparacion + ", instalacion=" + instalacion + ", cerrado=" + cerrado + '}';
    }

}
