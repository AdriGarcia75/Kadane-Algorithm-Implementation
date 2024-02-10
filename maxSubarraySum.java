public class Max {
    //i implemented Kadane's algorithm to search the max consecutive sum
    public static int sequence(int[] arr) {
        if (arr.length == 0) return 0;
        int currentMax = arr[0], finalMax = arr[0];
        for (int i = 1; i < arr.length; i++){
            //we have to validate the next 2 options to make the code "evade" all negatives we encounter  
            if (arr[i] > 0 || currentMax + arr[i] > 0){
                currentMax = Math.max(arr[i], currentMax + arr[i]);
                //you could also make the max between current and final
                finalMax = currentMax > finalMax ? currentMax : finalMax;
            //if neither of the options were fullfilled then our currentMax is 0
            } else {
                currentMax = 0;
            }
        }
        return finalMax != arr[0] ? finalMax : 0;
    }
}
