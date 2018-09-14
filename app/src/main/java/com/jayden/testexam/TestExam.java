package com.jayden.testexam;

/**
 * Created by hedazhao on 2018/9/14.
 */
public class TestExam {
    /**
     * 【Android开发工程师】通过一次for循环, 找出数组中第二大的数
     * 示例：输入 array=[1, 3, 5, 7, 3, 9, 8], 输出：8
     */
    int test1(int... nums) {
        int length = nums.length;

        if (length < 2) {

            return -1;

        }

        int max, second;

        if (nums[0] > nums[1]) {

            max = nums[0];

            second = nums[1];

        } else {

            second = nums[0];

            max = nums[1];

        }

        for (int i = 2; i < length; i++) {

            if (nums[i] == max) {  //过滤 ，重复的 最大数

                continue;

            }

            if (nums[i] > max) {

                second = max;

                max = nums[i];

            } else if (nums[i] > second) {

                second = nums[i];

            }

        }

        return second;
    }

    /**
     * 【Android开发工程师】给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
     * <p>
     * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
     * <p>
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * <p>
     * 所以返回 [0, 1]
     */
    public int[] test2(int target, int... nums) {
            if(nums == null || nums.length == 0){
                return null;
            }
            int length = nums.length;
            int[] indexs = new int[2];
            for(int i = 0;i < length - 1;i++){
                for(int j = i+1; j < length;j++){
                    if(nums[i]+nums[j] == target){
                        indexs[0]=i;
                        indexs[1]=j;
                        break;
                    }
                }
            }

        return indexs;
    }

}
