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
@Table(name = "daftarmenu_yang_dipesan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DaftarmenuYangDipesan.findAll", query = "SELECT d FROM DaftarmenuYangDipesan d"),
    @NamedQuery(name = "DaftarmenuYangDipesan.findById", query = "SELECT d FROM DaftarmenuYangDipesan d WHERE d.id = :id"),
    @NamedQuery(name = "DaftarmenuYangDipesan.findByMakanan", query = "SELECT d FROM DaftarmenuYangDipesan d WHERE d.makanan = :makanan"),
    @NamedQuery(name = "DaftarmenuYangDipesan.findByMinuman", query = "SELECT d FROM DaftarmenuYangDipesan d WHERE d.minuman = :minuman"),
    @NamedQuery(name = "DaftarmenuYangDipesan.findByJumlah", query = "SELECT d FROM DaftarmenuYangDipesan d WHERE d.jumlah = :jumlah"),
    @NamedQuery(name = "DaftarmenuYangDipesan.findByHarga", query = "SELECT d FROM DaftarmenuYangDipesan d WHERE d.harga = :harga"),
    @NamedQuery(name = "DaftarmenuYangDipesan.findByKeterangan", query = "SELECT d FROM DaftarmenuYangDipesan d WHERE d.keterangan = :keterangan")})
public class DaftarmenuYangDipesan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Makanan")
    private String makanan;
    @Basic(optional = false)
    @Column(name = "Minuman")
    private String minuman;
    @Basic(optional = false)
    @Column(name = "Jumlah")
    private int jumlah;
    @Basic(optional = false)
    @Column(name = "Harga")
    private int harga;
    @Basic(optional = false)
    @Column(name = "Keterangan")
    private String keterangan;

    public DaftarmenuYangDipesan() {
    }

    public DaftarmenuYangDipesan(Integer id) {
        this.id = id;
    }

    public DaftarmenuYangDipesan(Integer id, String makanan, String minuman, int jumlah, int harga, String keterangan) {
        this.id = id;
        this.makanan = makanan;
        this.minuman = minuman;
        this.jumlah = jumlah;
        this.harga = harga;
        this.keterangan = keterangan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
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
        if (!(object instanceof DaftarmenuYangDipesan)) {
            return false;
        }
        DaftarmenuYangDipesan other = (DaftarmenuYangDipesan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DaftarmenuYangDipesan[ id=" + id + " ]";
    }
    
}
