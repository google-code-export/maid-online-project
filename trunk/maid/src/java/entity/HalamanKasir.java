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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "halaman_kasir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HalamanKasir.findAll", query = "SELECT h FROM HalamanKasir h"),
    @NamedQuery(name = "HalamanKasir.findById", query = "SELECT h FROM HalamanKasir h WHERE h.id = :id"),
    @NamedQuery(name = "HalamanKasir.findByNamapelanggan", query = "SELECT h FROM HalamanKasir h WHERE h.namapelanggan = :namapelanggan"),
    @NamedQuery(name = "HalamanKasir.findByMejapelanggan", query = "SELECT h FROM HalamanKasir h WHERE h.mejapelanggan = :mejapelanggan")})
public class HalamanKasir implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Nama_pelanggan")
    private String namapelanggan;
    @Basic(optional = false)
    @Column(name = "Meja_pelanggan")
    private String mejapelanggan;

    public HalamanKasir() {
    }

    public HalamanKasir(Integer id) {
        this.id = id;
    }

    public HalamanKasir(Integer id, String namapelanggan, String mejapelanggan) {
        this.id = id;
        this.namapelanggan = namapelanggan;
        this.mejapelanggan = mejapelanggan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getMejapelanggan() {
        return mejapelanggan;
    }

    public void setMejapelanggan(String mejapelanggan) {
        this.mejapelanggan = mejapelanggan;
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
        if (!(object instanceof HalamanKasir)) {
            return false;
        }
        HalamanKasir other = (HalamanKasir) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.HalamanKasir[ id=" + id + " ]";
    }
    
}
