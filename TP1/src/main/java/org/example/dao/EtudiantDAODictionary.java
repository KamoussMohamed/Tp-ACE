package org.example.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary {
    Map<String, Etudiant> etudiantsMap;
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(etudiant.getNom(), etudiant);
        return etudiant;
    }
    public Map<String, Etudiant> getAllEtudiantsMap() {
        return etudiantsMap;
    }
    public List<String> getAllEmails(){
        Map<String, Etudiant> etudiantsMap = getAllEtudiantsMap();
        List<String> emails = new ArrayList<>();
        for (Etudiant etudiant : etudiantsMap.values()) {
            emails.add(etudiant.getEmail());
        }
        return emails;
    }

}
