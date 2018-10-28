/*
Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
*/

public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<ArrayList<Integer>> pascal = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(1);
        pascal.add(new ArrayList<>(temp));
        temp.add(1);
        pascal.add(new ArrayList<>(temp));

        if(A == 0) return pascal.get(0);
        if(A == 1) return pascal.get(1);

        for(int i = 1; i < A; i++){
            temp = pascal.get(i);
            ArrayList<Integer> curr = new ArrayList<>();
            int start = 0;
            int end = start + 1;
            curr.add(temp.get(start));
            while(end > start && end < temp.size()){
                curr.add(temp.get(start) + temp.get(end));
                start++;
                end++;
            }
            curr.add(temp.get(end-1));
            pascal.add(new ArrayList<>(curr));

        }

        return pascal.get(pascal.size()-1);
    }
}



/*

*/
