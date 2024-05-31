package com.arupproject.arupproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class QustionSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer setid;
    private Integer SetUserid;
    private String  setname;
    private String  setcatagori;

}
