package com.esgis.jee.model.admin.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom", length = 100, nullable = false)
    private String nom;

    @Column(name = "prenoms", length = 100, nullable = false)
    private String prenoms;

    @Column(name = "telephone", length = 20, nullable = false)
    private String telephone;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "date_enregistrement", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnregistrement;

    @Column(name = "adresse", length = 255)
    private String adresse;

    // Constructeurs
    public Client() {}

    public Client(String nom, String prenoms, String telephone, String email, Date dateEnregistrement, String adresse) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.telephone = telephone;
        this.email = email;
        this.dateEnregistrement = dateEnregistrement;
        this.adresse = adresse;
    }

    // Getters et Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenoms() { return prenoms; }
    public void setPrenoms(String prenoms) { this.prenoms = prenoms; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Date getDateEnregistrement() { return dateEnregistrement; }
    public void setDateEnregistrement(Date dateEnregistrement) { this.dateEnregistrement = dateEnregistrement; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
}
