public class MissingNumberInArray {


    public int getNumber(int[] array, int n) {
        // n is the total no of elements to be in array
        int sum = (n * (n+1))/2;
        int sum1 = 0;
        for(int i = 0 ; i < n-1; i++) {
            sum1 = sum1 + array[i];
        }
        //System.out.println(sum-sum1);
        return sum - sum1;
    }
}
