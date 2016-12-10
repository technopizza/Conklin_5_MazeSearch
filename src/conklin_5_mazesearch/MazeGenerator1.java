/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conklin_5_mazesearch;

import java.util.Random;

/**
 *
 * @author Jason
 */
public class MazeGenerator1 {
    Random random = new Random();
        
    
    int[][] generateMaze(){
        
        int[][] intArray = new int[8][13];
        
        for (int i = 0; i < intArray.length; i++) {
            
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = random.nextInt(2);
                System.out.print( intArray[i][j] + ", ");
            }
            System.out.print("\n");
            
        }
        intArray[0][0] = 1;
        intArray[7][12] = 1;
        
        
        intArray[intArray.length-1][intArray[0].length-1] = 1;
        return intArray;
               
    }
    
}
