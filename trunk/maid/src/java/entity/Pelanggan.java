/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Ricko Shin
 */
@Entity
@Table(name = "pelanggan")
@NamedQueries({
    @NamedQuery(name = "Pelanggan.findAll", query = "SELECT m FROM Pelanggan m")})
public class Pelanggan implements Serializable {
    
     private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NAMA", length = 767)
    private String nama;
    @Column(name = "NOMORMEJA", length = 767)
    private String nomormeja;
    @Column(name = "LOGINSTAT")
    private Boolean loginstat;

    public Pelanggan() {
    }

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomormeja() {
        return nomormeja;
    }

    public void setNomormeja(String nomormeja) {
        this.nomormeja = nomormeja;
    }

    public Boolean getLoginstat() {
        return loginstat;
    }

    public void setLoginstat(Boolean loginstat) {
        this.loginstat = loginstat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nama != null ? nama.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelanggan)) {
            return false;
        }
        Pelanggan other = (Pelanggan) object;
        if ((this.nama == null && other.nama != null) || (this.nama != null && !this.nama.equals(other.nama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pelanggan[nama=" + nama + "]";
    }
}