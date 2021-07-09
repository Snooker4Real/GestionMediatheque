package com.hb.GestionMediateque.pojo;

public class DVDVideo extends Media{

    // attributs
    private String langueDVD;
    private String dureeDVD;

    //get & set
    public String getLangueDVD() {
        return langueDVD;
    }

    public void setLangueDVD(String langueDVD) {
        this.langueDVD = langueDVD;
    }

    public String getDureeDVD() {
        return dureeDVD;
    }

    public void setDureeDVD(String dureeDVD) {
        this.dureeDVD = dureeDVD;
    }

    //Constructeur
    public DVDVideo(){
    }
    public DVDVideo(String nbRecording, String title, String langueDVD, String dureeDVD){
        super(nbRecording, title);
        this.langueDVD = langueDVD;
        this.dureeDVD = dureeDVD;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Langue : " + langueDVD);
        System.out.println("Durée : " + dureeDVD + "min");
    }
}