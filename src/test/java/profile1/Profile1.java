package profile1;

import io.quarkus.test.junit.QuarkusTestProfile;

public class Profile1 implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "profile1";
    }
}
