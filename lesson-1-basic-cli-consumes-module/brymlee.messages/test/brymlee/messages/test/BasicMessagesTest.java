package brymlee.messages.test;

import org.junit.Test;
import brymlee.messages.impl.BasicMessages;
import java.util.Arrays;
import java.util.Optional;
import java.util.List;

import static org.junit.Assert.*;

public class BasicMessagesTest{

	@Test
	public void helloEqualsHello(){
		assertEquals("hello", "hello");
	}

	@Test
	public void basicMessagesEitherReturnsHelloOrHi(){
		final List<String> expectedStrings = Arrays.asList("Hello", "Hi");
		final Optional<String> actualString = expectedStrings
			.stream()
			.filter(expectedString -> expectedString.equals(BasicMessages.getMessage()))
			.findFirst();
		assertTrue(actualString.isPresent());
	}
}
