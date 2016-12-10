/*******************************************************************************
* Filename: Maze.java
* 
* Author: Conklin, Jason Date: November 30, 2016
* 
* Description: This class provides the necessary methods and variables for recursively solving a 8x13 maze
* designed with valid paths represented by 1s and walls as 0s
* 
* Input: None
* 
* Output: Console
*******************************************************************************/
package conklin_5_mazesearch;

public class Maze {

    private final int TRIED = 3; //int used for user viewing purposes. Tracks the attemted path(s).
    private final int PATH = 7; //int used for user viewing purposes. Tracks the solution path.
    int[][] grid;
     Maze(int[][] g){ //constructor
         grid = g;
     }

   /********************************************************************************
    * Method: print100Lines
    * 
    * Description: prints 100 new lines
    * 
    * Parameters: none
    * 
    * Pre-Conditions: none
    * 
    * Post-Conditions: none
    *******************************************************************************/
    void print100Lines() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    /********************************************************************************
    * Method: valid
    * 
    * Description: checks to see if the coordinate of (row, col) lies within the grid of the maze, and then if it
    * matches the int that represents a possible path through the maze
    * 
    * Parameters: int row, int col
    * 
    * Pre-Conditions: none
    * 
    * Post-Conditions: returns true if the spot at (row, col) is a possible path through the maze
    *******************************************************************************/
    boolean valid(int row, int col) throws InterruptedException {
        print100Lines();
        System.out.println(toString());
        Thread.sleep(50);
        return (((row >= 0) && (row < grid.length)) && ((col >= 0) && (col < grid[0].length)) && (grid[row][col] == 1));
    }

    /********************************************************************************
    * Method: traverse
    * 
    * Description: recursively checks each spot in the grid adjacent to the current spot in the grid to figure out if a valid path exists.
    *  
    * Parameters: int row, int col
    * 
    * Pre-Conditions: none
    * 
    * Post-Conditions: returns true if a valid path exists
    *******************************************************************************/
    boolean traverse(int row, int col) throws InterruptedException {
        boolean end = false;
        if (valid(row, col)) {
            grid[row][col] = TRIED;
            if(traverse(row, col + 1) || traverse(row, col - 1) || traverse(row + 1, col) || traverse(row - 1, col) || ((row == grid.length - 1) && (col == grid[0].length - 1))){
                grid[row][col] = PATH;
                end = true;
              }
        }
        
        print100Lines();
        System.out.println(toString());
        Thread.sleep(50);
        return end;
    }
    /********************************************************************************
    * Method: toString
    * 
    * Description: puts ASCII representation of grid into a string
    *  
    * Parameters:
    * 
    * Pre-Conditions: none
    * 
    * Post-Conditions: returns the array as one large, multi-line string
    *******************************************************************************/
    public String toString() {
        String tmp = "";
        for (int i = 0; i < grid.length; i++) {
            if (i > 0) {
                tmp = tmp + "\n";
            }
            for (int j = 0; j < grid[i].length; j++) {
                tmp = tmp + grid[i][j];
            }
        }
        return tmp;
    }
}
