import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Connection> connections = new ArrayList<>();

    public Graph(final Connection connection){
        connections.add(connection);
    }

    public boolean isTheSame(final Graph graphToCheck){
        if(connections.containsAll(graphToCheck.getConnections())){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(connections.isEmpty()){
            return true;
        }
        return false;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public boolean graphHasCommonPart(final Graph graphToCheck) {
      return  connections.stream().anyMatch(m-> graphToCheck.getConnections().stream().anyMatch(n->m.hasCommonPartWith(n)));
    }

    public void merge(final Graph graphToMerge) {
        connections.addAll(graphToMerge.getConnections());
        graphToMerge.getConnections().clear();
    }
}
