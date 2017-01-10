import org.jenkins.test.HelloWorld;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestHelloWorld {

    @Test
    public void testReturnSomething() {
        HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.returnSmth()).isEqualToIgnoringCase("something");
    }

    @Test
    public void testReturnSomething2() {
        HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.returnSmth()).isEqualToIgnoringCase("something");
    }

    @Test
    public void testReturnSomething3() {
        HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.returnSmth()).isEqualToIgnoringCase("something");
    }

    @Test
    public void testReturnSomething4() {
        HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.returnSmth()).isEqualToIgnoringCase("something");
    }
}
