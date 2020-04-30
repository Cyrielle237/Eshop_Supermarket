/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentation;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhy
 */
@Entity
@Table(name = "lignecommande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lignecommande.findAll", query = "SELECT l FROM Lignecommande l")
    , @NamedQuery(name = "Lignecommande.findByIdLCom", query = "SELECT l FROM Lignecommande l WHERE l.idLCom = :idLCom")
    , @NamedQuery(name = "Lignecommande.findByQuantite", query = "SELECT l FROM Lignecommande l WHERE l.quantite = :quantite")})
public class Lignecommande implements Serializable ,EntityClasses{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idLCom")
    private Integer idLCom;
    @Basic(optional = false)
    @Column(name = "quantite")
    private int quantite;
    @JoinColumn(name = "codePro", referencedColumnName = "codePro")
    @ManyToOne(optional = false)
    private Produit codePro;
    @JoinColumn(name = "idCommande", referencedColumnName = "idCommande")
    @ManyToOne(optional = false)
    private Commande idCommande;

    public Lignecommande() {
    }

    public Lignecommande(Integer idLCom) {
        this.idLCom = idLCom;
    }

    public Lignecommande(Integer idLCom, int quantite) {
        this.idLCom = idLCom;
        this.quantite = quantite;
    }

    public Integer getIdLCom() {
        return idLCom;
    }

    public void setIdLCom(Integer idLCom) {
        this.idLCom = idLCom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit getCodePro() {
        return codePro;
    }

    public void setCodePro(Produit codePro) {
        this.codePro = codePro;
    }

    public Commande getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Commande idCommande) {
        this.idCommande = idCommande;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLCom != null ? idLCom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lignecommande)) {
            return false;
        }
        Lignecommande other = (Lignecommande) object;
        if ((this.idLCom == null && other.idLCom != null) || (this.idLCom != null && !this.idLCom.equals(other.idLCom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alimentation.Lignecommande[ idLCom=" + idLCom + " ]";
    }

    @Override
    public Integer getId() {
        return this.idLCom;
    }
    
}
