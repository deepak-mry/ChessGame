package org.example.model;

public enum PieceColor {
  WHITE, BLACK;

  public PieceColor opposite() {
    return this == PieceColor.WHITE ? PieceColor.BLACK : PieceColor.WHITE;
  }
}
