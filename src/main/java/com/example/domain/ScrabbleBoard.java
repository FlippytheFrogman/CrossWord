package com.example.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.*;

@Entity
public class ScrabbleBoard {
  @Id
  private Long id;
  @Column
  private String board;
  public ScrabbleBoard() {
  }
  public ScrabbleBoard(Long id, String board) {
    this.id = id;
    this.board = board;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getBoard() {
    return board;
  }
  public void setBoard(String board) {
    this.board = board;
  }
}
