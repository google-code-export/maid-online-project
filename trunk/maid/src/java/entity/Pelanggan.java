/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Ricko Shin
 */
@Entity
@Table(name = "pelanggan")
@NamedQueries({
    @NamedQuery(name = "Pelanggan.findAll", query = "SELECT m FROM Pelanggan m")})
public class Pelanggan implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 767)
    @Column(name = "NAMA")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 767)
    @Column(name = "NOMORMEJA")
    private String nomormeja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LOGINSTAT")
    private boolean loginstat;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    
     

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

    public Pelanggan(Integer id) {
        this.id = id;
    }

    public Pelanggan(Integer id, String nama, String nomormeja, boolean loginstat) {
        this.id = id;
        this.nama = nama;
        this.nomormeja = nomormeja;
        this.loginstat = loginstat;
    }

   

    public void setLoginstat(boolean loginstat) {
        this.loginstat = loginstat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }}

   