package ru.geekbrains.lesson14;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task1Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 3, 2, 4, 2, 1, 0}, new int[]{2, 1, 0}},
                {new int[]{3, 4, 7, 8, 9, 4, 1, 8}, new int[]{1, 8}}
        });
    }

    private final int[] in;
    private final int[] out;

    public Task1Test(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    @Before
    public void startTest() {
        Task1 task1 = new Task1();
    }

    @Test
    public void testAfterLast4() {
        Assert.assertArrayEquals(out, Task1.afterLast4(in));
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        Task1.afterLast4(new int[]{0, 1, 2, 3, 0, 1, 3, 2});
    }
}