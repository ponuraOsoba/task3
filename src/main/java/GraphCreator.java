import java.util.ArrayList;
import java.util.List;

public class GraphCreator {

    public static List<Graph> createGraphs(final String[] stringsArray ) {
        List<Graph> graphList = new ArrayList<>();
        addArguments(graphList, stringsArray);
        return  graphList;
    }

    private static void addArguments(final List<Graph> graphList,final String[] stringsArray) {
        for(int i=1;i<stringsArray.length;i++) {
            int intsArray[] = new int[2];

            intsArray[0] = Integer.parseInt(stringsArray[i]);
            intsArray[1] = Integer.parseInt(stringsArray[++i]);

            Connection connection = new Connection(intsArray);
            graphList.add(new Graph(connection));
        }
        }
    }

