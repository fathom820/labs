package environment;

import lifeform.LifeForm;

import java.util.Arrays;

public class Environment {
  // INST VAR
  private Cell[][] cells; // 2D array of cells

  // CONSTR

  /**initializes in numbers of rows and columns in this.cells
   *
   * @param rows rows
   * @param cols columns
   */
  public Environment(int rows, int cols) {
    cells = new Cell[rows][cols];

    for (Cell[] cell : cells) {
      Arrays.fill(cell, new Cell());
    }
  }


  // FUNC

  /**
   * Adds a lifeform to the cell if one doesn't exist already
   * @param lf lifeform
   * @param row row to find
   * @param col column to find
   * @return true if lifeform added, false if lifeform already exists
   */
  public boolean addLifeForm(LifeForm lf, int row, int col) {
    if (cells[row][col].getLifeForm() == null) {
      cells[row][col].addLifeForm(lf);
      return true;
    }
    return false;
  }

  public void removeLifeForm(int row, int col) {
    cells[row][col].removeLifeForm();
  }


  // GET
  public LifeForm getLifeForm(int row, int col) {
    return cells[row][col].getLifeForm();
  }

  public Cell[][] getCells() {
    return cells;
  }
}