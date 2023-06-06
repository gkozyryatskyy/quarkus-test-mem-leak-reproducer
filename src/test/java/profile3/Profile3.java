package profile3;

import io.quarkus.test.junit.QuarkusTestProfile;

public class Profile3 implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "profile3";
    }
}
