package main.java.lld.tictactoe;

import main.java.lld.Pair;

import java.sql.SQLOutput;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
  Deque<Player> players;
  Board gameBoard;

  public TicTacToeGame() {
    initializeGame();
  }

  public void initializeGame() {
    players = new LinkedList<>();
    // Creating 2 players.
    Player player1 = new Player("P1", new PieceX());
    Player player2 = new Player("P2", new PieceO());

    players.add(player1);
    players.add(player2);

    // initialize board of size 3.
    gameBoard = new Board(3);
  }

  public String startGame() {
    boolean noWinner = true;
    while (noWinner) {
      // Get player taking the turn.
      Player playerTurn = players.removeFirst();

      // Print the board for player to choose.
      gameBoard.printBoard();

      List<Pair<Integer, Integer>> freeCells = gameBoard.getFreeCells();
      if (freeCells.isEmpty()) {
        noWinner = false;
        break;
      }

      // Read the user input.
      System.out.println("Player: " + playerTurn.userName + " Enter row, column: ");
      Scanner inputScanner = new Scanner(System.in);
      String s = inputScanner.nextLine();
      String[] values = s.split(",");
      int row = Integer.parseInt(values[0]);
      int col = Integer.parseInt(values[1]);


      // Place the piece.
      boolean piecePlaced = gameBoard.addPiece(row, col, playerTurn.piece);
      if (!piecePlaced) {
        System.out.println("Incorrect position, try again");
        players.addFirst(playerTurn);
        continue;
      }
      players.addLast(playerTurn);

      boolean winner = isThereWinner(row, col, playerTurn.piece.pieceType);
      if (winner) {
        return playerTurn.userName;
      }
    }

    return "Tie";
  }

  private boolean isThereWinner(int row, int column, PieceType pieceType) {

    boolean rowMatch = true;
    boolean columnMatch = true;
    boolean diagonalMatch = true;
    boolean antiDiagonalMatch = true;

    //need to check in row
    for (int i = 0; i < gameBoard.size; i++) {

      if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
        rowMatch = false;
      }
    }

    //need to check in column
    for (int i = 0; i < gameBoard.size; i++) {

      if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
        columnMatch = false;
      }
    }

    //need to check diagonals
    for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
      if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
        diagonalMatch = false;
      }
    }

    //need to check anti-diagonals
    for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
      if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
        antiDiagonalMatch = false;
      }
    }

    return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
  }
}
