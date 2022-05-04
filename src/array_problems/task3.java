/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_problems;

/**
 *
 * @author zahid-bracu
 * Write a java program to find sum of all array elements.
 */
public class task3 {
    public static void main(String [] args){
        int array[]={1,2,3,1,4,9,6,7,4,3,5,2,5,7,9};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
