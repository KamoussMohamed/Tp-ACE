package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {
    List<Etudiant> EtudiantsList = new ArrayList<Etudiant>();
    public Etudiant addEtudiant(Etudiant et) {
        EtudiantsList.add(et);
        return et;
    }
    public List<Etudiant> getAllEtudiants() {
        return EtudiantsList;
    }
    public List<String> getAllEmails(){
        List<Etudiant> etudiants = EtudiantsList;
        List<String> emails = new ArrayList<>();
        for (Etudiant et : etudiants) {
            emails.add(et.getEmail());
        }
        return emails;
    }

}
