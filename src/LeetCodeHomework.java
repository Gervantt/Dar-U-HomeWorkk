public class LeetCodeHomework {
    public static void main(String[] args) {
        int i[] = {4,5,6,7,0,2,1,3};
        int[] fish = {1,2,3,4};
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(restoreString("codeleet",i));
        System.out.println(isPalindrome(1234322));
        System.out.println(numberOfSteps(16));
        System.out.println(sumOddLengthSubarrays(fish));
        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    static String restoreString(String s, int[] indices) {
        char c[] = s.toCharArray();
        char[] result = new char[c.length];

        for(int i = 0; i<c.length;i++){
            result[indices[i]] = c[i];
        }
        String output = new String(result);
        return output;
    }




    static boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        char[] z = y.toCharArray();
        for (int i = 0; i < z.length; i++) {
            if (z[i] != z[z.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    static int numberOfSteps(int num) {
        int step = 0;
        while(num > 0){
            step++;
            if(num % 2 == 0){
                num /= 2;
            } else{
                num= num-1;
            }
        }
        return step;
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = String.join("",word1);
        String b = String.join("",word2);
        return a.equals(b);
    }



    static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i; j<arr.length;j++){
                int length = j-i+1;
                if(length%2 != 0){
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }
                }
            }
        }
        return sum;
    }

}
