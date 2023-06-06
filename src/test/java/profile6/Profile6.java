package profile6;

import io.quarkus.test.junit.QuarkusTestProfile;

public class Profile6 implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "profile6";
    }
}
