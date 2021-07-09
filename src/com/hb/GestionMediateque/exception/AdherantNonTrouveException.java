package com.hb.GestionMediateque.exception;

public class AdherantNonTrouveException extends RuntimeException{

    public AdherantNonTrouveException(){
        super();
    }

    public AdherantNonTrouveException(String idAdherant){
        super("L'adhérant n'a pas été trouvé");
    }
}
