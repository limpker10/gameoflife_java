package epis.unsa;

import java.util.*;
public class Board {
  private boolean[][] board;

  public Board(int width, int height, List<Point> points) {
    board = new boolean[height][width];
    setInitialState(points);
  }

  public int getWidth() {
    // Metodo Implementado
    return board[0].length;
  }

  public int getHeight() {
    // Metodo Implementado
    return board.length;
  }

  private Board(boolean[][] board) {
    // Falta Implementar : Crea un nuevo tablero.
    this.board = board;
  }

  // True:  Color.BLACK , False:  Color.WHITE
  public boolean cell(int i, int j) {
    // Metodo Implementado
    return board[i][j];
  }

  private void setInitialState(List<Point> points) {
    //Inicializa el estado del tablero
    // Falta hacer verificaciones
    for (int i = 0; i < points.size(); i++) {
      board[points.get(i).getY()][points.get(i).getX()] = true;
    }

  }

  public int countNeighbors(int x, int y) {
    // Fata Implementar : Cuenta los vecinos en un Point(x,y)

    int neighbors = 0;
    for (int i = -1; i <= 1; i++) {
      for (int j = -1; j <= 1; j++) {
        if (i == 0 && j == 0) {
          continue;
        }
        try {
          if (cell(x + i, y + j)) {
            neighbors++;
          }
        } catch (Exception e) {
        }
        if (neighbors > 3) {
          return neighbors;
        }
      }

    }
    return neighbors;
  }

  public Board nextState() {
    // Falta Implementar : Devuelve el tablero con los nuevos estados.
    // Se verifica con la ayuda del  contadorVecinos(x,y).
    boolean [][] a = new boolean[getHeight()][getWidth()];
    if (this.board != null) {
      for (int i = 0; i < getHeight(); i++) {
        for (int j = 0; j < getWidth(); j++) {
          int neigh = countNeighbors(i, j);
          if (cell(i,j)) { // Celula viva
            if (neigh < 2 || neigh > 3) {
              a[i][j] = false;
            }else {
              a[i][j] = true;
            }
          } else { // Celula muerta
            if (neigh == 3) {
              a[i][j] = true;
            }
          }
        }
      }
      ;
    }
    return new Board(a);
  }
}
