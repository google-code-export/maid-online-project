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
@Table(name = "makanan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Makanan.findAll", query = "SELECT m FROM Makanan m"),
    @NamedQuery(name = "Makanan.findById", query = "SELECT m FROM Makanan m WHERE m.id = :id"),
    @NamedQuery(name = "Makanan.findByNasiGoreng", query = "SELECT m FROM Makanan m WHERE m.nasiGoreng = :nasiGoreng"),
    @NamedQuery(name = "Makanan.findByBakmiGoreng", query = "SELECT m FROM Makanan m WHERE m.bakmiGoreng = :bakmiGoreng"),
    @NamedQuery(name = "Makanan.findByGurameBakar", query = "SELECT m FROM Makanan m WHERE m.gurameBakar = :gurameBakar"),
    @NamedQuery(name = "Makanan.findByAyamBakar", query = "SELECT m FROM Makanan m WHERE m.ayamBakar = :ayamBakar"),
    @NamedQuery(name = "Makanan.findByNilaBakar", query = "SELECT m FROM Makanan m WHERE m.nilaBakar = :nilaBakar")})
public class Makanan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NasiGoreng")
    private String nasiGoreng;
    @Basic(optional = false)
    @Column(name = "BakmiGoreng")
    private String bakmiGoreng;
    @Basic(optional = false)
    @Column(name = "GurameBakar")
    private String gurameBakar;
    @Basic(optional = false)
    @Column(name = "AyamBakar")
    private String ayamBakar;
    @Basic(optional = false)
    @Column(name = "NilaBakar")
    private String nilaBakar;

    public Makanan() {
    }

    public Makanan(Integer id) {
        this.id = id;
    }

    public Makanan(Integer id, String nasiGoreng, String bakmiGoreng, String gurameBakar, String ayamBakar, String nilaBakar) {
        this.id = id;
        this.nasiGoreng = nasiGoreng;
        this.bakmiGoreng = bakmiGoreng;
        this.gurameBakar = gurameBakar;
        this.ayamBakar = ayamBakar;
        this.nilaBakar = nilaBakar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNasiGoreng() {
        return nasiGoreng;
    }

    public void setNasiGoreng(String nasiGoreng) {
        this.nasiGoreng = nasiGoreng;
    }

    public String getBakmiGoreng() {
        return bakmiGoreng;
    }

    public void setBakmiGoreng(String bakmiGoreng) {
        this.bakmiGoreng = bakmiGoreng;
    }

    public String getGurameBakar() {
        return gurameBakar;
    }

    public void setGurameBakar(String gurameBakar) {
        this.gurameBakar = gurameBakar;
    }

    public String getAyamBakar() {
        return ayamBakar;
    }

    public void setAyamBakar(String ayamBakar) {
        this.ayamBakar = ayamBakar;
    }

    public String getNilaBakar() {
        return nilaBakar;
    }

    public void setNilaBakar(String nilaBakar) {
        this.nilaBakar = nilaBakar;
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
        if (!(object instanceof Makanan)) {
            return false;
        }
        Makanan other = (Makanan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Makanan[ id=" + id + " ]";
    }
    
}
