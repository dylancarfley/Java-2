/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dylan
 */
public class TwelveInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] twelveNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12};
        for(int i =0; i <= twelveNums.length -1; i++){
            System.out.println(twelveNums[i]);
        }
        for(int y = twelveNums.length - 1; y >= 0; y--){
            System.out.println(twelveNums[y]);
        }
    }
    
}
