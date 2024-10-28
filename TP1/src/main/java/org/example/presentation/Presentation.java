package org.example.presentation;

import org.example.dao.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    public static void main(String[] args){
        List<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(new Etudiant(1, "Alice", "Dupont", "alice.dupont@example.com"));
        etudiants.add(new Etudiant(2, "Bob", "Martin", "bob.martin@example.com"));
        etudiants.add(new Etudiant(3, "Charlie", "Bernard", "charlie.bernard@example.com"));
        etudiants.add(new Etudiant(4, "Diana", "Leroy", "diana.leroy@example.com"));



        for (Etudiant etudiant : etudiants) {
            System.out.println("Id: " + etudiant.getId() + "\n" + "Nom: " + etudiant.getNom() + "\n" + "Prenom: " + etudiant.getPrenom() + "\n" + "Email: " + etudiant.getEmail() + "\n");
        }
    }
}
