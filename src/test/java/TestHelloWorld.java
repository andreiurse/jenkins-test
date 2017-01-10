import org.jenkins.test.HelloWorld;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestHelloWorld {

    @Test
    public void testReturnSomething() {
        HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.returnSmth()).isEqualToIgnoringCase("somethi");
        //test
    }
}
