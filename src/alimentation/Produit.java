/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentation;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jhy
 */
@Entity
@Table(name = "produit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p")
    , @NamedQuery(name = "Produit.findByCodePro", query = "SELECT p FROM Produit p WHERE p.codePro = :codePro")
    , @NamedQuery(name = "Produit.findByNomPro", query = "SELECT p FROM Produit p WHERE p.nomPro = :nomPro")
    , @NamedQuery(name = "Produit.findByPrixVente", query = "SELECT p FROM Produit p WHERE p.prixVente = :prixVente")
    , @NamedQuery(name = "Produit.findByPrixAchat", query = "SELECT p FROM Produit p WHERE p.prixAchat = :prixAchat")
    , @NamedQuery(name = "Produit.findByQte", query = "SELECT p FROM Produit p WHERE p.qte = :qte")
    , @NamedQuery(name = "Produit.findByDescription", query = "SELECT p FROM Produit p WHERE p.description = :description")
    , @NamedQuery(name = "Produit.findByCodeFour", query = "SELECT p FROM Produit p WHERE p.codeFour = :codeFour")
    , @NamedQuery(name = "Produit.findByDateInsertion", query = "SELECT p FROM Produit p WHERE p.dateInsertion = :dateInsertion")
    , @NamedQuery(name = "Produit.findByActif", query = "SELECT p FROM Produit p WHERE p.actif = :actif")})
public class Produit implements Serializable ,EntityClasses{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codePro")
    private Integer codePro;
    @Basic(optional = false)
    @Column(name = "nomPro")
    private String nomPro;
    @Column(name = "prixVente")
    private Integer prixVente;
    @Basic(optional = false)
    @Column(name = "prixAchat")
    private int prixAchat;
    @Basic(optional = false)
    @Column(name = "qte")
    private int qte;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "codeFour")
    private String codeFour;
    @Column(name = "dateInsertion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateInsertion;
    @Basic(optional = false)
    @Column(name = "actif")
    private boolean actif;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codePro")
    private Collection<Lignecommande> lignecommandeCollection;
    @JoinColumn(name = "idCategorie", referencedColumnName = "idCat")
    @ManyToOne(optional = false)
    private Categorie idCategorie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codePro")
    private Collection<Gestionstock> gestionstockCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codePro")
    private Collection<Lignefacture> lignefactureCollection;

    public Produit() {
    }

    public Produit(Integer codePro) {
        this.codePro = codePro;
    }

    public Produit(Integer codePro, String nomPro, int prixAchat, int qte, String description, String codeFour, boolean actif) {
        this.codePro = codePro;
        this.nomPro = nomPro;
        this.prixAchat = prixAchat;
        this.qte = qte;
        this.description = description;
        this.codeFour = codeFour;
        this.actif = actif;
    }

    public Integer getCodePro() {
        return codePro;
    }

    public void setCodePro(Integer codePro) {
        this.codePro = codePro;
    }

    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public Integer getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(Integer prixVente) {
        this.prixVente = prixVente;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodeFour() {
        return codeFour;
    }

    public void setCodeFour(String codeFour) {
        this.codeFour = codeFour;
    }

    public Date getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(Date dateInsertion) {
        this.dateInsertion = dateInsertion;
    }

    public boolean getActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    @XmlTransient
    public Collection<Lignecommande> getLignecommandeCollection() {
        return lignecommandeCollection;
    }

    public void setLignecommandeCollection(Collection<Lignecommande> lignecommandeCollection) {
        this.lignecommandeCollection = lignecommandeCollection;
    }

    public Categorie getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Categorie idCategorie) {
        this.idCategorie = idCategorie;
    }

    @XmlTransient
    public Collection<Gestionstock> getGestionstockCollection() {
        return gestionstockCollection;
    }

    public void setGestionstockCollection(Collection<Gestionstock> gestionstockCollection) {
        this.gestionstockCollection = gestionstockCollection;
    }

    @XmlTransient
    public Collection<Lignefacture> getLignefactureCollection() {
        return lignefactureCollection;
    }

    public void setLignefactureCollection(Collection<Lignefacture> lignefactureCollection) {
        this.lignefactureCollection = lignefactureCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePro != null ? codePro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.codePro == null && other.codePro != null) || (this.codePro != null && !this.codePro.equals(other.codePro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alimentation.Produit[ codePro=" + codePro + " ]";
    }

    @Override
    public Integer getId() {
        return this.codePro;
    }
    
}
