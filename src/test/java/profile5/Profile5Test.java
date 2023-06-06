package profile5;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profile1.Profile1Test;

@QuarkusTest
@TestProfile(Profile5.class)
public class Profile5Test {

    @Test
    public void test() {
        Assertions.assertEquals(Profile1Test.MBS, Profile1Test.mem(Profile1Test.MBS).size());
    }
}
