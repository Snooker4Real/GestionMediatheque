package com.hb.GestionMediateque;

public class Media implements Comparable<Media>{

    // attributs
    protected String nbRecording;
    protected String title;
    public static int typeTri;

    public static final int TRI_NUMER0 = 1;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Media(int numero) {
        this.numero = numero;
    }

    protected int numero;

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

/*    @Override
    public int compareTo(Media o) {

        if(this.typeTri > o.typeTri)
            return 1;
        else if(this.typeTri < o.typeTri)
            return -1;
        else
            return 0;

    }*/

    @Override
    public int compareTo(Media o){
        return this.title.compareTo(o.getTitle());
    }
}