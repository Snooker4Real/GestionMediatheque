package com.hb.GestionMediateque;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GestionMediathequeMain {

    public static void main(String[] args) throws InterruptedException {
        GestionDeMedias media = new GestionDeMedias();
        String menu = "1";
        while (menu == "1") {
            System.out.println("Gestion de Médiathèque");
            System.out.println("1.  Afficher la liste des médias");
            System.out.println("2.  Afficher la liste des adhérants");
            System.out.println("3.  Afficher la liste des emprunts");
            System.out.println("4.  Créer un livre");
            System.out.println("5.  Créer un CD");
            System.out.println("6.  Créer un DVD");
            System.out.println("7.  Créer une Encyclopédie");
            System.out.println("8.  Créer un adhérant");
            System.out.println("9.  Créer un emprunt");
            System.out.println("10. Trier la liste des médias par numéro");
            System.out.println("11. Trier la liste des médias par titre");
            System.out.println("12.  Quitter");

            //System.out.print("Choisissez une opération : ");

            Scanner sc = new Scanner(System.in);

            int choix = 0;
            try {
                //saisie choix
                System.out.print("Saisir un nombre (1 - 10) : ");
                choix = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("Mauvaise saisie 😒");
            }

            switch (choix) {
                case 1:
                    System.out.println("Liste des médias: ");
                    media.afficherLesMedias();
                    Thread.sleep(3500);
                    break;
                case 2:
                    System.out.println("Liste des adhérents: ");
                    media.afficherLesAdherants();
                    Thread.sleep(3500);
                    break;
                case 3:
                    System.out.println("Liste des emprunts: ");
                    media.afficherLesEmprunts();
                    Thread.sleep(4000);
                    break;
                case 4:
                    System.out.println("Ajout d'un livre: ");
                    creerLivre(media);
                    Thread.sleep(3500);
                    break;
                case 5:
                    System.out.println("Ajout d'un CD: ");
                    creerCD(media);
                    Thread.sleep(3500);
                    break;
                case 6:
                    System.out.println("Ajout d'un DVD: ");
                    creerDVD(media);
                    Thread.sleep(3500);
                    break;
                case 7:
                    System.out.println("Ajout d'une encyclopédie: ");
                    creerEncyclopedie(media);
                    Thread.sleep(3500);
                    break;
                case 8:
                    System.out.println("Ajout d'un adhérant");
                    creerAdherant(media);
                    Thread.sleep(3500);
                    break;
                case 9:
                    System.out.println("Ajout d'un emprunt");
                    //creerEmprunt(media);
                    Thread.sleep(3500);
                    break;
                case 10:
                    media.trierMedia(Media.TRI_NUMER0);
                    break;
                case 11:
                    media.trierMedia(Media.TRI_TITRE);
                    break;
                case 12:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Le choix n'est pas correct");
            }
        }
    }

    public static void creerLivre(GestionDeMedias media){
        //Livre livre = new Livre();
        Scanner sc = new Scanner(System.in);


        System.out.print("Numero d'enregistrement : ");
        String nbRecording = sc.nextLine();
        System.out.println(nbRecording);




        System.out.print("Titre : ");
        String title = sc.nextLine();
        System.out.println(title);

        System.out.print("Auteur : ");
        String bookAuthor = sc.nextLine();
        System.out.println(bookAuthor);

        System.out.print("Nombre de pages : ");
        String nbPages = sc.nextLine();
        System.out.println(nbPages);

        Livre livre = new Livre(nbRecording,title,bookAuthor, nbPages);
        media.ajouterMedia(livre);
        //livre.afficher();
        media.afficherLesMedias();
    }

    public static void creerCD(GestionDeMedias media){
        //CDAudio cdAudio = new CDAudio();
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero d\'enregistrement : ");
        String nbRecording = sc.nextLine();
        System.out.println(nbRecording);

        System.out.print("Titre : ");
        String title = sc.nextLine();
        System.out.println(title);

        System.out.print("Auteur: ");
        String cdAuthor = sc.nextLine();
        System.out.println(cdAuthor);

        System.out.print("Compositeur: ");
        String cdCompositor = sc.nextLine();
        System.out.println(cdCompositor);

        System.out.print("Nombre de piste: ");
        String nbPiste = sc.nextLine();
        System.out.println(nbPiste);

        CDAudio cdAudio = new CDAudio(nbRecording, title, cdAuthor, cdCompositor, nbPiste);
        media.ajouterMedia(cdAudio);
        media.afficherLesMedias();

    }

    public static void creerDVD(GestionDeMedias media){
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero d'enregistrement : ");
        String nbRecording = sc.nextLine();
        System.out.println(nbRecording);

        System.out.print("Titre : ");
        String title = sc.nextLine();
        System.out.println(title);

        System.out.print("Langue DVD: ");
        String langueDVD = sc.nextLine();
        System.out.println(langueDVD);

        System.out.print("Durée: ");
        String dureeDVD = sc.nextLine();
        System.out.println(dureeDVD);

        DVDVideo dvdvid = new DVDVideo(nbRecording, title, langueDVD, dureeDVD);
        media.ajouterMedia(dvdvid);
        media.afficherLesMedias();
    }

    public static void creerEncyclopedie(GestionDeMedias media){
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero d\'enregistrement : ");
        String nbRecording = sc.nextLine();
        System.out.println(nbRecording);

        System.out.print("Titre : ");
        String title = sc.nextLine();
        System.out.println(title);

        System.out.print("Langue: ");
        String langueEncyclopedie = sc.nextLine();
        System.out.println(langueEncyclopedie);

        System.out.print("Nombre de tomes: ");
        String nbTome = sc.nextLine();
        System.out.println(nbTome);

        Encyclopedie encyclo = new Encyclopedie(nbRecording, title, langueEncyclopedie, nbTome);
        media.ajouterMedia(encyclo);
        media.afficherLesMedias();
    }

    public static void creerAdherant(GestionDeMedias media){
        Scanner sc = new Scanner(System.in);

        System.out.print("Identifiant adhérant :");
        String idAdherant = sc.nextLine();
        System.out.println(idAdherant);

        System.out.print("Nom:");
        String firstNameAdherant = sc.nextLine();
        System.out.println(firstNameAdherant);

        System.out.print("Prénon:");
        String lastNameAdherant = sc.nextLine();
        System.out.println(lastNameAdherant);

        System.out.print("Email:");
        String emailAdherant = sc.nextLine();
        System.out.println(emailAdherant);

        System.out.print("Téléphone: ");
        String telAdherant = sc.nextLine();
        System.out.println(telAdherant);

        Adherant adherant = new Adherant(idAdherant, firstNameAdherant, lastNameAdherant, emailAdherant, telAdherant);
        media.ajouterAdherant(adherant);
        media.afficherLesAdherants();
    }

    public void creerEmprunt(GestionDeMedias media){
        Scanner sc = new Scanner(System.in);

        System.out.print("Identifiant emprunt :");
        String idEmprunt = sc.nextLine();
        System.out.println(idEmprunt);

        System.out.print("Identifiant adhérant :");
        String idAdherant = sc.nextLine();
        //GestionDeMedias.rechercherAdherant(idAdherant);
        System.out.println(idAdherant);

        System.out.print("Numero d'enregistrement :");
        String nbRecording = sc.nextLine();
        System.out.println(nbRecording);

        System.out.print("Date début emprunt :");
        String dateEmprunt = sc.nextLine();
        System.out.println(dateEmprunt);

        System.out.print("Date retour emprunt :");
        String dateRetour = sc.nextLine();
        System.out.println(dateRetour);

        Emprunt emprunt = new Emprunt(idEmprunt, idAdherant, nbRecording, new Date(Date.parse(dateEmprunt)), new Date(Date.parse(dateRetour)));
        media.ajouterEmprunt(emprunt);
        media.afficherLesEmprunts();
    }


    //Encyclopedie encyclo1 = new Encyclopedie("2", "English Dictionnary", "English", "5");
    //DVDVideo dvdvid1 = new DVDVideo("3","Matrix","English", "54");
    //CDAudio cdaud1 = new CDAudio("4","Redemption song","Bob Marley", "Bob Marley", "15");

    //Ajout des medias dans la GestionDeMedias
    //media.ajouterMedia(encyclo1);
    //media.ajouterMedia(dvdvid1);
    //media.ajouterMedia(cdaud1);

    //Adherant adherant1 = new Adherant("1", "Jonathan", "Cindano", "cindanojonathan@gmail.com", "0758916877");
    //Adherant adherant2 = new Adherant("2", "Aymeric", "Popey", "popey.aymeric@gmail.com", "0765821416");
    //Adherant adherant3 = new Adherant("3", "Marc", "Lefèvre", "marc.lefevre@gmail.com", "0669199887");

    //media.ajouterAdherant(adherant1);
    //media.ajouterAdherant(adherant2);
    //media.ajouterAdherant(adherant3);

    //adherant1.afficher();

    //Emprunt emprunt1 = new Emprunt("1", "1", "3", new Date(Date.parse("2021/07/05")), new Date(Date.parse("2021/08/05")));
    //Emprunt emprunt2 = new Emprunt(2, 2, 2, new Date(Date.parse("2021/07/04")), new Date(Date.parse("2021/08/07")));
    //Emprunt emprunt3 = new Emprunt(3, 3, 1, new Date(Date.parse("2021/07/03")), new Date(Date.parse("2021/08/09")));

    //media1.ajouterEmprunt(emprunt1);
    //media1.ajouterEmprunt(emprunt2);
    //media1.ajouterEmprunt(emprunt3);

    //adherant1.afficher();
    //adherant2.afficher();
    //adherant3.afficher();


    //emprunt1.afficher();
    //emprunt2.afficher();
    //emprunt3.afficher();
}
