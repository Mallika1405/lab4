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

    public void testMerge(){
        List <String> l1=new ArrayList<>();
        List <String> l2=new ArrayList<>();
        l1.add("a");
        l1.add("c");
        l1.add("e");
        l2.add("b");
        l2.add("d");
        ArrayList <String> l3=new ArrayList<>();
        l3.add("a");
        l3.add("b");
        l3.add("c");
        l3.add("d");
        l3.add("e");

        assertEquals(l3,ListExamples.merge(l1, l2));

    }

    
}
