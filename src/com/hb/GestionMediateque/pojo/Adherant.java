package com.hb.GestionMediateque.pojo;

public class Adherant {

    private String idAdherant;
    private String firstnameAdherant;
    private String lastnameAdherant;
    private String emailAdherant;
    private String telAdherant;

    public String getIdAdherant() {
        return idAdherant;
    }

    public void setIdAdherant(String idAdherant) {
        this.idAdherant = idAdherant;
    }

    public String getFirstnameAdherant() {
        return firstnameAdherant;
    }

    public void setFirstnameAdherant(String firstnameAdherant) {
        this.firstnameAdherant = firstnameAdherant;
    }

    public String getLastnameAdherant() {
        return lastnameAdherant;
    }

    public void setLastnameAdherant(String lastnameAdherant) {
        this.lastnameAdherant = lastnameAdherant;
    }

    public String getEmailAdherant() {
        return emailAdherant;
    }

    public void setEmailAdherant(String emailAdherant) {
        this.emailAdherant = emailAdherant;
    }

    public String getTelAdherant() {
        return telAdherant;
    }

    public void setTelAdherant(String telAdherant) {
        this.telAdherant = telAdherant;
    }

    //constructeur
    public Adherant(){
    }
    public Adherant(String idadherant, String firstnameAdherant, String lastnameAdherant, String emailAdherant, String telAdherant){
        this.idAdherant = idadherant;
        this.firstnameAdherant = firstnameAdherant;
        this.lastnameAdherant = lastnameAdherant;
        this.emailAdherant = emailAdherant;
        this.telAdherant = telAdherant;
    }

    public void afficher(){
        System.out.println("L\'adherant n°" + idAdherant + " s\'appelle " + firstnameAdherant + " " + lastnameAdherant +"." );
        System.out.println("Son e-mail est : " + emailAdherant);
        System.out.println("Son téléphone est : " + telAdherant);
    }
}
