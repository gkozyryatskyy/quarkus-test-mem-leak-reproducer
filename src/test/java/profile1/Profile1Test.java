package profile1;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@QuarkusTest
@TestProfile(Profile1.class)
public class Profile1Test {

    public static final int MBS = 400;
    public static final int MB_BYTES = 1024 * 1024;

    @Test
    public void test() {
        Assertions.assertEquals(MBS, mem(MBS).size());
    }

    @SneakyThrows
    public static List<byte[]> mem(int mbs) {
        Runtime runtime = Runtime.getRuntime();
        System.out.printf("Start: total:[%d]mb free:[%s]mb max:[%d]mb%n",
                runtime.totalMemory() / MB_BYTES,
                runtime.freeMemory() / MB_BYTES,
                runtime.maxMemory() / MB_BYTES);
        List<byte[]> list = new ArrayList<>();
        for (int i = 0; i < mbs; i++) {
            // 1MB each loop, 1 x 1024 x 1024 = 1048576
            byte[] b = new byte[1048576];
            list.add(b);
        }
        System.out.printf("End: total:[%d]mb free:[%s]mb max:[%d]mb%n",
                runtime.totalMemory() / MB_BYTES,
                runtime.freeMemory() / MB_BYTES,
                runtime.maxMemory() / MB_BYTES);
        return list;
    }
}
