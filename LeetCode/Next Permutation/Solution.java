/*
mplement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.

If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.

The replacement must be in-place, do not allocate extra memory.
*/
public class Solution {
    public void nextPermutation(ArrayList<Integer> a) {
        int index = a.size()-2;
        while(index >=0 && a.get(index) >= a.get(index+1)){
            index--;
        }
        if(index >= 0){
            int j = a.size()-1;
            while(j >= 0 && a.get(index) >= a.get(j)){
                j--;
            }
            swap(a, index, j);
        }
        reverse(a, index+1);
    }

    public void swap(ArrayList<Integer> a, int index, int j){
        int temp = a.get(index);
        int atJ = a.get(j);
        a.set(index, atJ);
        a.set(j, temp);
    }

    public void reverse(ArrayList<Integer>a , int index){
        int start = index;
        int end = a.size()-1;
        while(start < end){
            swap(a, start, end);
            start++;
            end--;
        }
    }
}
