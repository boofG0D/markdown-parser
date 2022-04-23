import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    } 

    @Test
    public void LinksTest() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/test-file.md"));
        assertEquals(MarkdownParse.getLinks(fileContent), List.of("https://something.com", "some-thing.html"));
    }

    @Test
    public void Links2Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/2test.md"));
        assertEquals(MarkdownParse.getLinks(fileContent), List.of("https://google.com", "bruh.com"));
    }

    @Test
    public void Links3Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/3test.md"));
        assertEquals(MarkdownParse.getLinks(fileContent), List.of("youtube.com"));
    }

    @Test
    public void Links4Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/4test.md"));
        assertEquals(MarkdownParse.getLinks(fileContent), List.of("bruhmoment.com"));
    }
}
