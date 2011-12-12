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
@Table(name = "halaman_kasir_nota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HalamanKasirNota.findAll", query = "SELECT h FROM HalamanKasirNota h"),
    @NamedQuery(name = "HalamanKasirNota.findById", query = "SELECT h FROM HalamanKasirNota h WHERE h.id = :id"),
    @NamedQuery(name = "HalamanKasirNota.findByMakanan", query = "SELECT h FROM HalamanKasirNota h WHERE h.makanan = :makanan"),
    @NamedQuery(name = "HalamanKasirNota.findByMinuman", query = "SELECT h FROM HalamanKasirNota h WHERE h.minuman = :minuman"),
    @NamedQuery(name = "HalamanKasirNota.findByJumlah", query = "SELECT h FROM HalamanKasirNota h WHERE h.jumlah = :jumlah"),
    @NamedQuery(name = "HalamanKasirNota.findByHarga", query = "SELECT h FROM HalamanKasirNota h WHERE h.harga = :harga"),
    @NamedQuery(name = "HalamanKasirNota.findBySubtotal", query = "SELECT h FROM HalamanKasirNota h WHERE h.subtotal = :subtotal"),
    @NamedQuery(name = "HalamanKasirNota.findByTotal", query = "SELECT h FROM HalamanKasirNota h WHERE h.total = :total")})
public class HalamanKasirNota implements Serializable {
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
    private String jumlah;
    @Basic(optional = false)
    @Column(name = "Harga")
    private String harga;
    @Basic(optional = false)
    @Column(name = "Subtotal")
    private int subtotal;
    @Basic(optional = false)
    @Column(name = "Total")
    private int total;

    public HalamanKasirNota() {
    }

    public HalamanKasirNota(Integer id) {
        this.id = id;
    }

    public HalamanKasirNota(Integer id, String makanan, String minuman, String jumlah, String harga, int subtotal, int total) {
        this.id = id;
        this.makanan = makanan;
        this.minuman = minuman;
        this.jumlah = jumlah;
        this.harga = harga;
        this.subtotal = subtotal;
        this.total = total;
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

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
        if (!(object instanceof HalamanKasirNota)) {
            return false;
        }
        HalamanKasirNota other = (HalamanKasirNota) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.HalamanKasirNota[ id=" + id + " ]";
    }
    
}
