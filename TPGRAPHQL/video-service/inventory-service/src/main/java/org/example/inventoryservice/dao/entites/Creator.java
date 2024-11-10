package org.example.inventoryservice.dao.entites;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Creator {
    @Id
    private String id;
    private String name;
    private String email;


    @OneToMany(mappedBy = "creator")
    private List<Video> videos;
}
