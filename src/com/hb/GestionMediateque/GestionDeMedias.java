package com.hb.GestionMediateque;

import java.util.ArrayList;
import java.util.List;

public class GestionDeMedias {
    private List<Media> medias = new ArrayList<Media>();
    private List<Adherant> adherants = new ArrayList<Adherant>();
    private List<Emprunt> emprunts = new ArrayList<Emprunt>();

    public void ajouterMedia(Media media){
        this.medias.add(media);
    }

    public void ajouterAdherant(Adherant adherant){
        this.adherants.add(adherant);
    }

    public void ajouterEmprunt(Emprunt emprunt){
        this.emprunts.add(emprunt);
    }

    public void afficherLesMedias(){
        System.out.println("");
        for (Media media : medias){
            media.afficher();
        }
    }

    public void afficherLesAdherants(){
        System.out.println("");
        for (Adherant adherant : adherants){
            adherant.afficher();
        }
    }

    public void afficherLesEmprunts(){
        System.out.println("");
        for (Emprunt emprunt : emprunts){
            emprunt.afficher();
        }
    }

    public void afficherLesAuteurs(){
        System.out.println("Auteurs : ");
        //on parcours la liste avec un for (foreach)
        for(Media media : medias){
            if (media instanceof Livre) {
                //on cast le Lvre en Livre
                Livre livre = (Livre)media;
                System.out.println(livre.getBookAuthor());
            }

            if (media instanceof CDAudio){
                //on cast le media en CDAudio
                CDAudio cdAudio = (CDAudio)media;
                System.out.println(cdAudio.getCdAuthor());
            }
        }
    }

    public void afficherLesLangues(){
        System.out.println("Langues : ");
        //on parcours la liste avec un for (foreach)
        for(Media media : medias){
            //test si le type est Encyclopedie
            if (media instanceof Encyclopedie){
                //on cast le media en Encyclopedie
                Encyclopedie encyclopedie = (Encyclopedie)media;
                System.out.println(encyclopedie.getLangueEncyclopedie());
            }
            // test si le type est DVDVideo
            if (media instanceof DVDVideo){
                //on cast le media en DVDVideo
                DVDVideo dvdVideo = (DVDVideo)media;
                System.out.println(dvdVideo.getLangueDVD());
            }
        }
    }

    //recherche un adhérant dans la liste
    //génère une exception AdherantNonTrouveException s'il n'existe pas
/*    public Adherant rechercheryAdherant(String idAdherant){
        Adherant adherantTrouve = null;

        //boucle sur la liste des adhérants
        for(Adherant adherant : adherants){
            if (){

            }
            //si l'id = id de l'adhérant alors
                //adherant = à l'objet trouvé
        }

        //si adherant == null alors
            //génère une exception de type AdherantNonTrouveException
        return adherant;
    }*/
}