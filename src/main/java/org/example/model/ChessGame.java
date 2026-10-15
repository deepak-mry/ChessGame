package org.example.model;

import java.util.*;

public class ChessGame {
  Piece[][] board = new Piece[8][8];
  PieceColor turn = PieceColor.WHITE;

  ChessGame() {
    this.initializeBoard();
  }

  void initializeBoard() {
    for (int row = 0; row < 8; row++) {
      for (int col = 0; col < 8; col++) {
        if (row == 1) board[row][col] = new Piece(PieceColor.BLACK, PieceType.PAWN);
        else if (row == 6) board[row][col] = new Piece(PieceColor.WHITE, PieceType.PAWN);
        else if (row == 0) {
          if (col == 0 || col == 7) board[row][col] = new Piece(PieceColor.BLACK, PieceType.ROOK);
          else if (col == 1 || col == 6) board[row][col] = new Piece(PieceColor.BLACK, PieceType.KNIGHT);
          else if (col == 2 || col == 5) board[row][col] = new Piece(PieceColor.BLACK, PieceType.BISHOP);
          else if (col == 3) board[row][col] = new Piece(PieceColor.BLACK, PieceType.QUEEN);
          else board[row][col] = new Piece(PieceColor.BLACK, PieceType.KING);
        } else if (row == 7) {
          if (col == 0 || col == 7) board[row][col] = new Piece(PieceColor.WHITE, PieceType.ROOK);
          else if (col == 1 || col == 6) board[row][col] = new Piece(PieceColor.WHITE, PieceType.KNIGHT);
          else if (col == 2 || col == 5) board[row][col] = new Piece(PieceColor.WHITE, PieceType.BISHOP);
          else if (col == 3) board[row][col] = new Piece(PieceColor.WHITE, PieceType.QUEEN);
          else board[row][col] = new Piece(PieceColor.WHITE, PieceType.KING);
        } else board[row][col] = null;
      }
    }
  }

  void makeMove(Piece piece, Move move) {
  }

  List<Position> getLegalMoves(Piece piece, Position pos) {
    List<Position> legalMoves = new ArrayList<>();

    switch (piece.type()) {
      case KING -> { }
      case QUEEN -> { }
    }

    return legalMoves;
  }

  Boolean isMoveLegal() {
    return false;
  }
}
