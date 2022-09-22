import org.apache.commons.lang3.RandomStringUtils;

public class Rest {
    public static String petName(){
        String randomString = RandomStringUtils.randomAlphabetic(1);
        return ("doggie"+randomString);
    }

    public static String petStatus(){
        String randomString = RandomStringUtils.randomAlphabetic(2);
        return ("avalable"+randomString);
    }
}
