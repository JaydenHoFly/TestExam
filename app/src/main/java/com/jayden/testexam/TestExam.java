package com.jayden.testexam;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hedazhao on 2018/9/14.
 */
public class TestExam {
    /**
     * 【Android开发工程师】通过一次for循环, 找出数组中第二大的数
     * 示例：输入 array=[1, 3, 5, 7, 3, 9, 8], 输出：8
     */
    int test1(int... nums) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num < max && num > second) {
                second = num;
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
        return null;
    }


    /**
     * 【Android开发工程师】给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * <p>
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     * <p>
     * 注意:
     * <p>
     * 不能使用代码库中的排序函数来解决这道题。
     * <p>
     * 示例:
     * <p>
     * 输入: [2,0,2,1,1,0]输出: [0,0,1,1,2,2]
     */
    public int[] test3(int[] a) {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

}
