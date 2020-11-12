import java.util.List;

public class Task3 {

    public static void main (String []args){
          List<Graph> graphs = GraphCreator.createGraphs(args);

        for (Graph graph: graphs) {
            if(!graph.isEmpty()){
                for (Graph graphToCheck : graphs) {
                    if(!(graphToCheck.isEmpty() || graphToCheck.isTheSame(graph))){
                        if(graph.graphHasCommonPart(graphToCheck)){
                            graph.merge(graphToCheck);
                        }
                    }
                }
            }
        }

        System.out.println(graphs.stream().filter(m->!m.isEmpty()).count());

        }
}
