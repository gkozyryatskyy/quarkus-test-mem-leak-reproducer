package profile4;

import io.quarkus.test.junit.QuarkusTestProfile;

public class Profile4 implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "profile4";
    }
}
