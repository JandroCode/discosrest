package com.discos.discosrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "songs")
public class Song {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "song_name")
  private String songName;

  @ManyToOne
  private Disco disco;

  public Song(){}

  public Song(Long id, String songName, Disco disco) {
    this.id = id;
    this.songName = songName;
    this.disco = disco;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  public Disco getDisco() {
    return disco;
  }

  public void setDisco(Disco disco) {
    this.disco = disco;
  }

  

  






  
}
