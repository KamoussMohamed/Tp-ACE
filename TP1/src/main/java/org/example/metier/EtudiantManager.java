package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;


import java.util.List;

public class EtudiantManager {
    public EtudiantDAO etudiantDAO;
    public Etudiant addEtudiant(Etudiant etudiant) {
        List<String>etudiantEmails = etudiantDAO.getAllEmails();
        if (etudiantEmails.contains(etudiant.getEmail())) {
            return null;
        }
        else{
            etudiantDAO.addEtudiant(etudiant);
            return etudiant;
        }
    }
    public List<Etudiant> getAllEtudiants(){
        return etudiantDAO.getAllEtudiants();
    }
}
