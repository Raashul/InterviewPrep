/*
N number of books are given.
The ith book has Pi number of pages.
You have to allocate books to M number of students so that maximum number of pages alloted to a
student is minimum. A book will be allocated to exactly one student. Each student has to be allocated at
least one book. Allotment should be in contiguous order, for example: A student cannot be allocated book
1 and book 3, skipping book 2.

P : [12, 34, 67, 90]
M : 2

Output : 113

*/
public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        if(A.size() == 0 ) return -1;
        if(A.size() < B) return -1;
        int res = Integer.MAX_VALUE;
        int start = A.get(0);
        int end = 0;
        for(int a: A){
            end += a;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(isPossible(A, B, mid)){
                res = Math.min(res, mid);
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
    }

    public boolean isPossible(ArrayList<Integer> A, int B, int max){
        int sum = 0;
        int noOfStudents = 1;
        for(int i =0; i < A.size(); i++){

            if(A.get(i) > max) return false;

            if(A.get(i) + sum > max){
                noOfStudents++;
                sum = A.get(i);
                if(noOfStudents > B) return false;
            }
            else{
                sum += A.get(i);
            }
        }
        return true;
    }
}
