import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void reverseTestWithNull(){
        Assert.assertNull(ReverseString.reverseString(null));
        System.out.println("ReverseTestWithNull Passed 1");
    }

    @Test
    public void reverseTestWithDigits(){
        Assert.assertEquals("cbA321", ReverseString.reverseString("123Abc"));
        System.out.println("ReverseTestWithDigits Passed 1");
    }

    @Test
    public void reverseHappyPath(){
        Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
        System.out.println("ReverseTestHappyPath Passed 1");
        System.out.println("ReverseTestHappyPath Passed 2");
    }



}
