public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int lastIndexOfNine = -1;
        int lastIndex = -1;
        int next = 1;

        if(A.size() == 0) return res;
        int index = 0;
        while(index == 0 && index != A.size()-1){
            if(A.get(index) == 0){
                A.remove(index);
            }
            else{
                index++;
            }

        }

        for(int i = A.size()-1; i >=0; i--){
            if(A.get(i) != 9){
                int curr = A.get(i);
                next = curr + 1;
                lastIndex = i;
                break;
            }

            else{
                lastIndexOfNine = i; //1
            }
        }

        if(lastIndexOfNine != -1){
            for(int i =0; i < lastIndexOfNine-1; i++){
                res.add(A.get(i)); // {1}
            }
            res.add(next);
            while(lastIndexOfNine < A.size()){
                res.add(0);
                lastIndexOfNine++;
            }

        }
        else{
            for(int i =0; i < lastIndex; i++){
                res.add(A.get(i));
            }
            res.add(next);
        }


        return res;


    }
}
