package com.discos.discosrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "discos")
public class Disco {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "disco_name")
  private String discoName;

  @ManyToOne
  private Band band;

  public Disco(){}

  public Disco(Long id, String discoName, Band band) {
    this.id = id;
    this.discoName = discoName;
    this.band = band;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDiscoName() {
    return discoName;
  }

  public void setDiscoName(String discoName) {
    this.discoName = discoName;
  }

  public Band getBand() {
    return band;
  }

  public void setBand(Band band) {
    this.band = band;
  }

  

  




  
}
