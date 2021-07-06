package com.hb.GestionMediateque;

public class Livre extends Media{

    // attributs
    private String bookAuthor;
    private String nbPages;

    public Livre(int nbRecording, String title, String bookAuthor, String nbPages) {
    }

    //get & set
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getNbPages() {
        return nbPages;
    }

    public void setNbPages(String nbPages) {
        this.nbPages = nbPages;
    }

    //Constructeur
    public Livre(){
    }

    public Livre(String nbRecording, String title, String bookAuthor, String nbPages){
        super(nbRecording, title);
        this.bookAuthor = bookAuthor;
        this.nbPages = nbPages;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Autheur : " + bookAuthor);
        System.out.println("Nombre page : " + nbPages);
    }
}
