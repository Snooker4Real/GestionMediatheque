package com.hb.GestionMediateque.pojo;

import java.util.Date;


public class Emprunt {

    private String idEmprunt;
    private String idAdherant;
    private String nbRecording;
    private Date dateEmprunt;
    private Date dateRetour;

    public String getIdEmprunt() {
        return idEmprunt;
    }

    public void setIdEmprunt(String idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    public String getIdAdherant() {
        return idAdherant;
    }

    public void setIdAdherant(String idAdherant) {
        this.idAdherant = idAdherant;
    }

    public String getNbRecording() {
        return nbRecording;
    }

    public void setNbRecording(String nbRecording) {
        this.nbRecording = nbRecording;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    //constructeur
    public Emprunt(String idEmprunt, String idAdherant, String nbRecording, Date dateEmprunt, Date dateRetour) {
        this.idEmprunt = idEmprunt;
        this.idAdherant = idAdherant;
        this.nbRecording = nbRecording;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
    }

    public void afficher(){
        System.out.println("L\'emprunt n°" + idEmprunt + " est fait par l\'adhérant n°" + idAdherant);
        System.out.println("Le num d\'enregistrement est : " + nbRecording);
        System.out.println("Les dates d\'emprunt sont du " + dateEmprunt + " au " + dateRetour);
    }
}