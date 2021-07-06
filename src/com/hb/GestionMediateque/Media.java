package com.hb.GestionMediateque;

public class Media {

    // attributs
    protected String nbRecording;
    protected String title;

    //get & set
    public String getNbRecording() {
        return nbRecording;
    }

    public void setNbRecording(String nbRecording) {
        this.nbRecording = nbRecording;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Constructeur
    public Media(){
    }
    public Media(String nbRecording, String title){
        this.nbRecording = nbRecording;
        this.title = title;
    }

    public void afficher(){
        System.out.println("");
        System.out.println("N° enregistrement : " + nbRecording);
        System.out.println("Titre : " + title);
    }
}