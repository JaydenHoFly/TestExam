package com.jayden.testexam;

import com.jayden.testexam.TestExam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExamUnitTest {

    @Test
    public void test1() {
        TestExam testExam = new TestExam();
        assertEquals(testExam.test1(1, 10, 9, 19, 100, 0), 19);
        assertEquals(testExam.test1(1, 101, 9, 19, 100, 0), 100);
        assertEquals(testExam.test1(1, 10, 9, 19, 100, 0, 300, 302), 300);
    }

    @Test
    public void test2() {
        TestExam testExam = new TestExam();
        assertTest2(testExam, 9, 2, 7, 10, 11);
        assertTest2(testExam, 10, 2, 8, 12, 11);
        assertTest2(testExam, 900, 200, 700, 10, 11);
        assertTest2(testExam, 89, 2, 70, 19, 11);
    }

    private void assertTest2(TestExam testExam, int target, int... inputs) {
        int[] result = testExam.test2(target, inputs);
        int targetVerify = 0;
        for (int index : result) {
            targetVerify += inputs[index];
        }
        assertEquals(target, targetVerify);
    }
}