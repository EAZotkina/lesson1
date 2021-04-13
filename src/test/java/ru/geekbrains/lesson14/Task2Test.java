package ru.geekbrains.lesson14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task2Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 1, 4, 4, 4, 4}, true},
                {new int[]{9, 8, 7, 6, 5, 3, 2, 1}, false},
                {new int[]{1, 2, 3, 4}, false}
        });
    }
    private final int[] in;
    private final boolean out;

    public Task2Test(int[] in, boolean out) {
        this.in = in;
        this.out = out;
    }

    private Task2 task2;

    @Before
    public void startTest() {
        task2 = new Task2();
    }
    @Test
    public void testOnly1And4() {
        Assert.assertEquals(Task2.Check1and4(in), out);
    }
}
