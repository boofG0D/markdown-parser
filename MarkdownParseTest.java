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
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(fileContent));
    }

    @Test
    public void Links2Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/2test.md"));
        assertEquals(List.of("https://google.com", "bruh.com"), MarkdownParse.getLinks(fileContent));
    }

    @Test
    public void Links3Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/3test.md"));
        assertEquals(List.of("youtube.com"), MarkdownParse.getLinks(fileContent));
    }

    @Test
    public void Links4Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/4test.md"));
        assertEquals(List.of("bruhmoment.com"), MarkdownParse.getLinks(fileContent));
    }
    
    @Test
    public void File1Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/test-file.md"));
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(fileContent));
    }
    
    @Test
    public void File2Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/test-file2.md"));
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(fileContent));
    }
    @Test
    public void File3Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/test-file3.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    @Test
    public void File4est() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/test-file4.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    @Test
    public void File5Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/test-file5.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    
    @Test
    public void File6Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/test-file6.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    @Test
    public void File7Test() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/test-file7.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    @Test
    public void File8est() throws IOException{
        String fileContent = Files.readString(Path.of("/Users/michaeldiaz/Documents/GitHub/markdown-parser/test-file8.md"));
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(fileContent));
    }
    
}