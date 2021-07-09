package com.hb.GestionMediateque.services;

import com.hb.GestionMediateque.pojo.Adherant;

import java.util.List;

public interface AdherantService {

    void ajouterAdherant(Adherant adherant);

    Adherant recupererAdherant(int id);

    List<Adherant> recupererAdherants();

    boolean supprimerAdherant(int id);
}
