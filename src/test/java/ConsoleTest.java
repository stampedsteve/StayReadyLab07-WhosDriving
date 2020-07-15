import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ConsoleTest {

    @Test
    public void getInput() {
        // Arrange
        Scanner mockScanner = new Scanner("hello world\n");
        Console c = new Console(mockScanner);
        String expected = "hello world";

        // Act
        String actual = c.getInput();

        // Assert
        assertEquals(expected, actual);
    }
}