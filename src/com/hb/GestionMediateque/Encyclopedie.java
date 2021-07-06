package com.hb.GestionMediateque;

public class Encyclopedie extends Media{

    // attributs
    private String langueEncyclopedie;
    private String nbTome;

    //get & set
    public String getLangueEncyclopedie() {
        return langueEncyclopedie;
    }

    public void setLangueEncyclopedie(String langueEncyclopedie) {
        this.langueEncyclopedie = langueEncyclopedie;
    }

    public String getNbTome() {
        return nbTome;
    }

    public void setNbTome(String nbTome) {
        this.nbTome = nbTome;
    }

    //Constructeur
    public Encyclopedie(){
    }
    public Encyclopedie(String nbRecording, String title, String langueEncyclopedie, String nbTome){
        super(nbRecording, title);
        this.langueEncyclopedie = langueEncyclopedie;
        this.nbTome = nbTome;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Langue : " + langueEncyclopedie);
        System.out.println("Nombre tome : " + nbTome);
    }

}
