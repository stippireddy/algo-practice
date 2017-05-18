package leetCode;

/**
 * Created by Sarveswara Tippireddy on 5/18/2017.
 */
public class LeetCode415 {

    public String addStrings1(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        char[] input1 = num1.toCharArray();
        char[] input2 = num2.toCharArray();
        int carryOver = 0;
        StringBuffer sb = new StringBuffer();
        while(i>=0 && j>=0){
            int sum = input1[i]-'0' + input2[j]-'0'+carryOver;
            sb.append(sum%10);
            carryOver = sum/10;
        }
        while(i>=0){
            int sum = input1[i]-'0' + +carryOver;
            sb.append(sum%10);
            carryOver = sum/10;
        }
        while(j>=0){
            int sum = input2[j]-'0' + +carryOver;
            sb.append(sum%10);
            carryOver = sum/10;
        }
        if(carryOver!=0){
            sb.append(carryOver);
        }
        return sb.reverse().toString();
    }
    public String addStrings2(String num1, String num2) {
        if (num1.length() >= num2.length()) {
            return add(num1, num2);
        } else {
            return add(num2, num1);
        }
    }

    private String add(String num1, String num2) {
        char[] input1 = num1.toCharArray();
        char[] input2 = num2.toCharArray();
        int diff = input1.length - input2.length;
        int[] output = new int[input1.length + 1];
        int carryOver = 0;
        int index = num1.length() - 1;
        while (index - diff >= 0) {
            int sum = input1[index] - '0' + input2[index - diff] - '0' + carryOver;
            output[index + 1] = sum % 10;
            carryOver = sum / 10;
            index--;
        }
        while (index >= 0) {
            int sum = input1[index] - '0' + carryOver;
            output[index + 1] = sum / 10;
            carryOver = sum % 10;
            index--;
        }
        output[0] = carryOver;
        StringBuffer sb = new StringBuffer();
        if (output[0] != 0) {
            sb.append(output[0]);
        }
        for (int i = 1; i < output.length; i++) {
            sb.append(output[i]);
        }
        return sb.toString();
    }

}
