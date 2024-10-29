package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;
import org.example.dao.IEtudiantDAO;


import java.util.List;

public class EtudiantManager {
    public IEtudiantDAO iEtudiantDAO;

    public EtudiantManager(IEtudiantDAO iEtudiantDAO) {
        this.iEtudiantDAO = iEtudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant){
        int count = 0;
        if(!iEtudiantDAO.getAllEtudiant().isEmpty()){
            for (Etudiant etud : iEtudiantDAO.getAllEtudiant()){
                if(etud.getEmail() == etudiant.getEmail()){
                    count++;
                }
            }
            if(count > 0){
                System.out.println("L'email que vous avez saisies est déjà utilisé par un étudiant ");
            }else{
                iEtudiantDAO.addEtudiant(etudiant);
            }
        }else{
            iEtudiantDAO.addEtudiant(etudiant);
        }
        return etudiant;
    }

    public Etudiant updateEtudiant(Etudiant etudiant){
        return iEtudiantDAO.updateEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants(){
        return iEtudiantDAO.getAllEtudiant();
    }
}
