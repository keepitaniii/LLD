package main.java.lld.tictactoe;

import main.java.lld.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
  int size;
  public PlayingPiece[][] board;

  public Board(int size) {
    this.size = size;
    board = new PlayingPiece[size][size];
  }

  public boolean addPiece(int row, int col, PlayingPiece piece) {
    if (board[row][col] != null) {
      return false;
    }
    board[row][col] = piece;
    return true;
  }

  public List<Pair<Integer, Integer>> getFreeCells() {
    List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (board[i][j] == null) {
          freeCells.add(new Pair<>(i, j));
        }
      }
    }
    return freeCells;
  }

  public void printBoard() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (board[i][j] != null) {
          System.out.print(board[i][j].pieceType.name() + "   ");
        } else {
          System.out.print("    ");

        }
        System.out.print(" | ");
      }
      System.out.println();
    }
  }

}
