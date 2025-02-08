import java.util.ArrayList;

public class GreatestNumber{
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList <Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i=0 ; i<candies.length ; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }

        for(int i=0 ; i<candies.length ; i++){
            if(candies[i]+extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}