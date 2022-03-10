package com.example.springdataintroexercise.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(name = "edition_type", nullable = false)
    private EditionType editionType;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private long copies;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(nullable = false, name = "age_restriction")
    private AgeRestriction ageRestriction;

    public Book() {
    }

    public Book(String title, String description, EditionType editionType, double price, long copies, LocalDate releaseDate, AgeRestriction ageRestriction) {
        this.title = title;
        this.description = description;
        this.editionType = editionType;
        this.price = price;
        this.copies = copies;
        this.releaseDate = releaseDate;
        this.ageRestriction = ageRestriction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EditionType getEditionType() {
        return editionType;
    }

    public void setEditionType(EditionType editionType) {
        this.editionType = editionType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCopies() {
        return copies;
    }

    public void setCopies(long copies) {
        this.copies = copies;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }
}
