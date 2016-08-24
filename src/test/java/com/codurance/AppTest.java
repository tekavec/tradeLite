package com.codurance;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppTest
{
    @Test
    public void should_test_app() {
        assertThat(new App().sayHello(), is("hello!"));
    }
}
