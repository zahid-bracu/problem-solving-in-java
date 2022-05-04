/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_problems;

/**
 *
 * @author zahid-bracu
 * Write a java program to count total number of even and odd elements in an array.
 */
public class task6 {
    public static void main(String [] args){
        int array[]={11,22,33,44,55,-66,1,2,4,6,2,8,-1,-3};
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Odd Count : "+oddCount+" Even Count : "+evenCount);
    }
}
