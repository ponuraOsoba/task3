import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Connection {

    private final List<Integer> integerList;

   public Connection(final int[] array){
       integerList = new ArrayList<>();
       integerList.add(array[0]);
       integerList.add(array[1]);
   }

    public final boolean hasCommonPartWith(final Connection conn) {
        if (CollectionUtils.containsAny(conn.getIntegerList(), integerList)){
            return true;
        }
        return false;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }
}
