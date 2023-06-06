package profile5;

import io.quarkus.test.junit.QuarkusTestProfile;

public class Profile5 implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
        return "profile5";
    }
}
