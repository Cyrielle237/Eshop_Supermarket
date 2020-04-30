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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhy
 */
@Entity
@Table(name = "fournisseur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fournisseur.findAll", query = "SELECT f FROM Fournisseur f")
    , @NamedQuery(name = "Fournisseur.findByCodeFour", query = "SELECT f FROM Fournisseur f WHERE f.codeFour = :codeFour")
    , @NamedQuery(name = "Fournisseur.findByNom", query = "SELECT f FROM Fournisseur f WHERE f.nom = :nom")
    , @NamedQuery(name = "Fournisseur.findByAdresse", query = "SELECT f FROM Fournisseur f WHERE f.adresse = :adresse")})
public class Fournisseur implements Serializable ,EntityClasses{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codeFour")
    private Integer codeFour;
    @Column(name = "nom")
    private String nom;
    @Column(name = "Adresse")
    private String adresse;

    public Fournisseur() {
    }

    public Fournisseur(Integer codeFour) {
        this.codeFour = codeFour;
    }

    public Integer getCodeFour() {
        return codeFour;
    }

    public void setCodeFour(Integer codeFour) {
        this.codeFour = codeFour;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeFour != null ? codeFour.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fournisseur)) {
            return false;
        }
        Fournisseur other = (Fournisseur) object;
        if ((this.codeFour == null && other.codeFour != null) || (this.codeFour != null && !this.codeFour.equals(other.codeFour))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alimentation.Fournisseur[ codeFour=" + codeFour + " ]";
    }

    @Override
    public Integer getId() {
        return this.codeFour;
    }
    
}
