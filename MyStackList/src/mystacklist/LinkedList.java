
package mystacklist;
import java.util.*;


public interface LinkedList<Node> {
    public Node getFirst();
    public void addFirst(Node o);
    public Node remove(int index);
    public int size();
    public boolean isEmpty();
    
}
