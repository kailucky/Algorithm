package S001TwoSum;

/**
 * Created by WangKai on 2018/11/29.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Solution3 {
    public int[] twoSum(int[] numbers, int target) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int[] num = numbers.clone();
        Arrays.sort(num);

        int length = numbers.length;
        int left = 0;
        int right = length - 1;
        int sum = 0;

        ArrayList<Integer> index = new ArrayList<Integer>();

        while(left < right)
        {
            sum = num[left] + num[right];

            if(sum == target)
            {
                for(int i = 0; i < length; ++i)
                {
                    if(numbers[i] == num[left])
                    {
                        index.add(i+1);
                    }
                    else if(numbers[i] == num[right])
                    {
                        index.add(i+1);
                    }
                    if(index.size() == 2)
                    {
                        break;
                    }
                }
                break;
            }
            else if(sum > target)
            {
                --right;
            }
            else
            {
                ++left;
            }
        }

        int[] result = new int[2];

        result[0] = index.get(0);
        result[1] = index.get(1);

        return result;
    }
}
