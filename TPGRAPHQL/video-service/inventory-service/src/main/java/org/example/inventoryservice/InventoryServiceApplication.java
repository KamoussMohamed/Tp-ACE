package org.example.inventoryservice;

import org.example.inventoryservice.dao.entites.Creator;
import org.example.inventoryservice.dao.entites.Video;
import org.example.inventoryservice.dao.repositories.CreatorRepository;
import org.example.inventoryservice.dao.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
        return args -> {
            // Création des créateurs
            List<Creator> creators = List.of(
                    Creator.builder()
                            .id("1")
                            .name("John Doe")
                            .email("john.doe@example.com")
                            .build(),
                    Creator.builder()
                            .id("2")
                            .name("Jane Smith")
                            .email("jane.smith@example.com")
                            .build()
            );

            // Sauvegarde des créateurs dans la base de données
            creatorRepository.saveAll(creators);

            // Création des vidéos associées aux créateurs
            List<Video> videos = List.of(
                    Video.builder()
                            .id("1")
                            .name("Introduction à Java")
                            .url("http://example.com/java-intro")
                            .description("Une vidéo introductive sur Java.")
                            .datePublication(new Date())
                            .creator(creators.get(0)) // Lien avec le créateur John Doe
                            .build(),
                    Video.builder()
                            .id("2")
                            .name("Développement Web avec Spring Boot")
                            .url("http://example.com/spring-boot")
                            .description("Apprenez à développer une application avec Spring Boot.")
                            .datePublication(new Date())
                            .creator(creators.get(1)) // Lien avec le créateur Jane Smith
                            .build(),
                    Video.builder()
                            .id("3")
                            .name("Vue.js pour les débutants")
                            .url("http://example.com/vuejs")
                            .description("Introduction à Vue.js pour les développeurs web.")
                            .datePublication(new Date())
                            .creator(creators.get(0))
                            .build()
            );
            videoRepository.saveAll(videos);
        };
    }
}
