import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
public class ListTests {
    

    @Test
    public void testfilter(){
        List <String> newList=new ArrayList<String>();
        newList.add("Hello");
        newList.add("my");
        newList.add("name");
        newList.add("is");
        newList.add("not");
        newList.add("Mallika");
        List <String> filString=new ArrayList<String>();
        filString.add("my");
        filString.add("name");
        filString.add("is");
        List <String> actual=ListExamples.filter(newList,new ListExamples());
        assertEquals(filString, actual);

    }

    
}
