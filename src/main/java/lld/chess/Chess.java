package main.java.lld.chess;

import java.util.HashMap;
import java.util.Map;

public class Chess {
}

class Position {

}

class Board {
  Map<Position, Piece> pieces = new HashMap<>();

  public void makeMove(Piece piece, Position destination) {
    pieces.remove(piece.currentPosition);
    pieces.put(destination, piece);
  }

  public Piece get(Position position) {
    return pieces.get(position);
  }
}

abstract class Piece {
  Position currentPosition;
  Board currentBoard;
  Color color;

  public void move(Position destination) {
    if (isValid(destination)) {
      currentPosition = destination;
    }
    // Capture.
    Piece destinationPiece = currentBoard.get(destination);
    if (destinationPiece != null && destinationPiece.getColor() != color) {
      // Capture the piece.
    }

  }

  boolean isValid(Position destination) {
    // If move gives check to king.
    Board temp = new Board();
    temp.makeMove(this, destination);
    if (kingInCheck(temp, color)) {
      return false;
    } else {
      Piece destinationPiece = currentBoard.get(destination);
      if (destinationPiece != null && destinationPiece.getColor() == color) {
        return false;
      }
      return isValidMove();
    }
  }

  private Color getColor() {
    return color;
  }

  abstract boolean isValidMove();

  boolean kingInCheck(Board board, Color color) {
    return false;
  }

  abstract void getAllPossibleMoves();
}

enum Color {
  WHITE,BLACK
}

class Pawn {
  public void enpassant() {

  }

  public void doubleMove() {

  }

  public void promotion() {

  }
}

class Knight {

}

class Rook {

}

class Bishop {

}

class King {

}

class Queen {

}