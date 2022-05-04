/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_problems;
/**
 * @author zahid-bracu
 * Write a java program to find second largest element in an array.
 */
public class task5 {
    public static void main(String [] args){
        int array[]={11,22,33,44,55,-66,1,2,4,6,7,8,-1,-3};
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        int maxTwo=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>maxTwo && array[i]<max){
                maxTwo=array[i];
            }
        }
        System.out.println("Second Max Number : "+maxTwo);
    }
}
