package org.example.inventoryservice.dao.entites;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor@NoArgsConstructor
@Builder
public class Video {
    @Id
    private String id;
    private String name;
    private String url;
    private String description;
    private Date datePublication;


    @ManyToOne
    private Creator creator;
}
