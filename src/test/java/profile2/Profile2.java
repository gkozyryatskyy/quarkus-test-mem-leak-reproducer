package profile2;

import io.quarkus.test.junit.QuarkusTestProfile;

public class Profile2 implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "profile2";
    }
}
