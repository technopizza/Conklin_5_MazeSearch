/*******************************************************************************
* Filename: MazeSearch.java
* 
* Author: Conklin, Jason Date: November 30, 2016
* 
* Description: This class creates a maze object and determines whether or not it is solvable;
* 
* Input: None
* 
* Output: Console
*******************************************************************************/
package conklin_5_mazesearch;

/**
 *
 * @author Jason
 */
public class MazeSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int[][] grid = new int[][]{
        {1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
        {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
        {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
        {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
        {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        MazeGenerator1 gen = new MazeGenerator1();
        Maze labyrinth = new Maze(grid);

        
        if (labyrinth.traverse(0, 0)) {
            System.out.println("The maze was successfully solved!");
        } else {
            System.out.println("There is no possible path.");
        }

    }

}
