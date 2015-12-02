package codecamp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import static java.nio.charset.StandardCharsets.UTF_8;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CliTest {
	
	private ByteArrayOutputStream out;
	
	private PrintStream printOut;

	@Before
	public void setUp() throws UnsupportedEncodingException {
		out = new ByteArrayOutputStream();
		printOut = new PrintStream(out, true, UTF_8.name());
	}
	
	@Test
	public void processWithHelloOutputsWorld() throws IOException {
		InputStream in = newInputStream("Hello");
		
		new Cli().process(in, printOut);
		
		assertThat(toString(out), is("World!\r\n"));
	}
	
	private static InputStream newInputStream(String string) {
		return new ByteArrayInputStream(string.getBytes(UTF_8));
	}

	private static String toString(ByteArrayOutputStream out) throws UnsupportedEncodingException {
		return out.toString(UTF_8.name());
	}
}
