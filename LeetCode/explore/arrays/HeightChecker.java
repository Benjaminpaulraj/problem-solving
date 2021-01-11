package LeetCode.explore.arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        int count[] = new int[heights.length+1];
        for ( int height: heights){
            count[height]++;
        }
        int res = 0;
        int currentHeight = 0;
        for ( int i=0; i< heights.length ; i++){
            while ( heights[currentHeight] == 0){
                currentHeight++;
            }
            if ( currentHeight != heights[i]){
                res++;
            }
            count[currentHeight]--;
        }
        return res;
    }

}