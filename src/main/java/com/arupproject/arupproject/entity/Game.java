package com.arupproject.arupproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String games_name;
    private String games_category;
    private String games_dev;
    private Integer games_year;
    private String games_image;

    @Lob
    @Column(columnDefinition="LONGBLOB")
    private byte[] games_image_byte;
    
}
