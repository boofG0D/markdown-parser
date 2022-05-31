import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.*;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void snip1Test() throws IOException {
        String snip1Content = Files.readString(Path.of("snip1.md"));
        assertEquals(List.of("url.com", "`google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(snip1Content));
    } 

    @Test
    public void snip2Test() throws IOException {
        String snip2Content = Files.readString(Path.of("snip2.md"));
        assertEquals(List.of("url.com", "`google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(snip2Content));
    }

    @Test
    public void snip3Test() throws IOException {
        String snip3Content = Files.readString(Path.of("snip3.md"));
        assertEquals(List.of("url.com", "`google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(snip3Content));
    }

    @Test
    public void LinksTest() throws IOException{
        String fileContent = Files.readString(Path.of("./test-file.md"));
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(fileContent));
    }

    @Test
    public void Links2Test() throws IOException{
        String fileContent = Files.readString(Path.of("./2test.md"));
        assertEquals(List.of("https://google.com", "bruh.com"), MarkdownParse.getLinks(fileContent));
    }

    @Test
    public void Links3Test() throws IOException{
        String fileContent = Files.readString(Path.of("./3test.md"));
        assertEquals(List.of("youtube.com"), MarkdownParse.getLinks(fileContent));
    }

    @Test
    public void Links4Test() throws IOException{
        String fileContent = Files.readString(Path.of("./4test.md"));
        assertEquals(List.of("bruhmoment.com"), MarkdownParse.getLinks(fileContent));
    }
    
    @Test
    public void File1Test() throws IOException{
        String fileContent = Files.readString(Path.of("./test-file.md"));
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(fileContent));
    }
    
    
    @Test
    public void File2Test() throws IOException{
        String fileContent = Files.readString(Path.of("./test-file2.md"));
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(fileContent));
    }
    
    @Test
    public void File3Test() throws IOException{
        String fileContent = Files.readString(Path.of("./test-file3.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    @Test
    public void File4est() throws IOException{
        String fileContent = Files.readString(Path.of("./test-file4.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    @Test
    public void File5Test() throws IOException{
        String fileContent = Files.readString(Path.of("./test-file5.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    
    
    @Test
    public void File6Test() throws IOException{
        String fileContent = Files.readString(Path.of("./test-file6.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    

    @Test
    public void File7Test() throws IOException{
        String fileContent = Files.readString(Path.of("./test-file7.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(fileContent));
    }
    
    @Test
    public void File8est() throws IOException{
        String fileContent = Files.readString(Path.of("./test-file8.md"));
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(fileContent));
    }

}
