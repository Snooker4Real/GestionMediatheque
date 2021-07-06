package com.hb.GestionMediateque;

public class CDAudio extends Media{

    // attributs
    private String cdAuthor;
    private String cdCompositor;
    private String nbPiste;

    //get & set
    public String getCdAuthor() {
        return cdAuthor;
    }

    public void setCdAuthor(String cdAuthor) {
        this.cdAuthor = cdAuthor;
    }

    public String getCdCompositor() {
        return cdCompositor;
    }

    public void setCdCompositor(String cdCompositor) {
        this.cdCompositor = cdCompositor;
    }

    public String getNbPiste() {
        return nbPiste;
    }

    public void setNbPiste(String nbPiste) {
        this.nbPiste = nbPiste;
    }

    //Constructeur
    public CDAudio(){
    }
    public CDAudio(String nbRecording, String title,String cdAuthor, String cdCompositor, String nbPiste){
        super(nbRecording, title);
        this.cdAuthor = cdAuthor;
        this.cdCompositor = cdCompositor;
        this.nbPiste = nbPiste;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Autheur : " + cdAuthor);
        System.out.println("Compositeur : " + cdCompositor);
        System.out.println("Nombre pistes : " + nbPiste);
    }
}