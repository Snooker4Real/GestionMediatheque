package com.hb.GestionMediateque.services;

import com.hb.GestionMediateque.pojo.Adherant;

import java.util.ArrayList;
import java.util.List;

public class AdherantServiceImpl implements AdherantService{

    private List<Adherant> adherants = new ArrayList();
    @Override
    public void ajouterAdherant(Adherant adherant) {
        adherants.add(adherant);
    }

    @Override
    public Adherant recupererAdherant(int id) {
        for(Adherant adherant : adherants){
            if(id == adherant.getIdAdherant()){
                return adherant;
            }
        }
        return null;
    }

    @Override
    public List<Adherant> recupererAdherants() {
        return adherants;
    }

    @Override
    public boolean supprimerAdherant(int id) {

        for(Adherant adherant : adherants){
            if(id == adherant.getIdAdherant()){
                adherants.remove(id);
            }
        }
        return false;
    }
}
