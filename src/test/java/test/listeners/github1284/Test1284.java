package test.listeners.github1284;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test1284 {
    @Test
    public void test1284Method() {
        Assert.assertNotNull(Listener1284.getInstance());
        List<String> testList = Listener1284.testList;
        Assert.assertTrue(testList.contains(Test1284.class.getName() + " - Before Invocation"));
        Assert.assertFalse(testList.contains(Test1284.class.getName() + " - After Invocation"));
    }
}
