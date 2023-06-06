package profile7;

import io.quarkus.test.junit.QuarkusTestProfile;

public class Profile7 implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "profile7";
    }
}
