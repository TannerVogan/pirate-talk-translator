import java.io.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PirateTranslatorTest {
private InputStream stdin;
private PrintStream stdout;
private ByteArrayOutputStream outputStream;
private void setStdIn(String input) {
System.setIn(new ByteArrayInputStream(input.getBytes()));
}
private String getFileIn(String path) throws IOException { String s = "";
FileInputStream inputStream = new FileInputStream(path); int data = inputStream.read(); char content;
/**
* if data equals 0
* file is empty
*/
while(data != -1) {
// convert bytes in symbols content = (char) data;
s += content;
// read next byte from file
data = inputStream.read();
}
// closing stream inputStream.close(); return s;
}
private String getStdOut() {
return outputStream.toString();
}
@Before
public void setUp() throws Exception {
stdin = System.in;
stdout = System.out;
outputStream = new ByteArrayOutputStream();
PrintStream printStream = new PrintStream(outputStream);
System.setOut(printStream);
}
@After
public void tearDown() throws Exception {
System.setIn(stdin);
System.setOut(stdout);
}
@Test
public void testInput(){
setStdIn("you're too nearby is professor dsfaasd sdafas wqwq\n" + "eqwqweqweqw we\n" + "told you."); PirateTranslator.input(); String actual = getStdOut(); String expected = "ye be too broadside be cap'n dsfaasd sdafas wqwq eqwqweqweqw we told ye. Arrr.\n" +
" "; assertEquals(expected, actual);
}
@Test
public void testFile() throws IOException { PirateTranslator.file("Input", "Output"); setStdIn(getFileIn("Input")); PirateTranslator.input(); String actual = getStdOut(); String expected = getFileIn("Output"); assertEquals(actual, expected);
}
}
