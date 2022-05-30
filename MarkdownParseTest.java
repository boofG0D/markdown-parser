import static org.junit.Assert.*;
<<<<<<< HEAD
import org.junit.*;
=======
>>>>>>> 2bc990ae493822c5f2da9ae5c976187025b1c565

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

<<<<<<< HEAD
public class MarkdownParseTest {

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-thing.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("./test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testLinkAtBeginning() {
        String contents= "[link title](a.com)";
        List<String> expect = List.of("a.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testSpaceInURL() {
        String contents = "[title](space in-url.com)";
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testSpaceAfterParen() {
        String contents = "[title]( space-in-url.com)";
        List<String> expect = List.of("space-in-url.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSpaceBeforeParen() {
        String contents = "[title]   (should-not-count.com)";
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testNestedParens() throws IOException {
        String contents = Files.readString(Path.of("test-parens-inside-link.md"));
        List<String> expect = List.of("something.com()", "something.com((()))", "something.com", "boring.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testMissingCloseParen() throws IOException {
        String contents = Files.readString(Path.of("test-missing-paren-plus-test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
}
=======
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
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
>>>>>>> 2bc990ae493822c5f2da9ae5c976187025b1c565
