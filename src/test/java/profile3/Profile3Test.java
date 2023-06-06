package profile3;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profile1.Profile1Test;

@QuarkusTest
@TestProfile(Profile3.class)
public class Profile3Test {

    @Test
    public void test() {
        Assertions.assertEquals(Profile1Test.MBS, Profile1Test.mem(Profile1Test.MBS).size());
    }
}
