package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String actor;
  private String releaseDate;

  public Film(String title, String actor, String releaseDate) {
    this.title = title;
    this.actor = actor;
    this.releaseDate = releaseDate;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getActor() {
    return this.actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public String getReleaseDate() {
    return this.releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }
}