import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class DotComBustTest {

	@Test
	void testSetUpGame() {
		fail("Not yet implemented");
	}

	@Test
	void testStartPlaying() {
		fail("Not yet implemented");
	}

	@Test
	void testCheckUserGuess() {
		fail("Not yet implemented");
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}
	
	@Test
	void testFinishGame() {
		DotComBust test = new DotComBust();
		
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		test.finishGame();
		
		assertEquals("All Dot Coms are dead! Your stock is now worthless.\nIt only took you 0 guesses.\nYou got out before your options sank.\n", outContent.toString());
	}
}​​​​​​

