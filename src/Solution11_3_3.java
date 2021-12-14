import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Solution11_3_3 {
    public static void main(String[] args) {
        Collection<? extends String> collection = new LinkedList<>();
       // collection.add("Hello");    //данная строка не скомпилируется, так как от стринга ничего не наследуется
        System.out.println(collection.size());
    }
}
