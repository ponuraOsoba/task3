import java.util.Arrays;
import java.util.Comparator;

public class Task3 {

    public static void main (String []args){
        int[][] intsArray= createArray(args);
        System.out.println(countGraphs(intsArray,getBasicGraphNo(getFirst(args))));
    }

    private static int getBasicGraphNo(int first) {
            return (first > 0) ? 1 : 0;
    }

    private static int countGraphs(int[][] intsArray, int howManyGraphs) {
        int lenght = intsArray.length;
        for(int i = 0; i< lenght -1 ; i++){
            if(!(intsArray[i][1] == intsArray[i+1][0])){
                howManyGraphs ++;
            }
        }
        return howManyGraphs;
    }

    private static int[][] createArray(String[] stringsArray ) {
        int[][] intsArray =  new int[getFirst(stringsArray)][2];
        addArguments(intsArray, stringsArray);
        Arrays.sort(intsArray, Comparator.comparingInt(o -> o[0]));
        return  intsArray;
    }

    private static void addArguments(int[][] intsArray, String[] stringsArray) {
        for(int i=1;i<stringsArray.length;i++){
            for(int j=0;j<intsArray.length;j++){
                intsArray[j][0] = Integer.parseInt(stringsArray[i]);
                intsArray[j][1] = Integer.parseInt(stringsArray[++i]);
                i++;
            }
        }
    }

    private  static int getFirst(String [] stringsArray){
        return Integer.parseInt(stringsArray[0]);
    }
}
