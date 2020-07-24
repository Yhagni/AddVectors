import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class MyVector {
    private static int howManyVectors = 2;
    private static ArrayList<ArrayList<Integer>> arrayOfVectors;//fe.: vec1=[1,2,3], vec2=[4,5,6], then arrayOfVectors=[[1,2,3],[4,5,6]]

    // Constructor //
    public MyVector() {
        new ArrayList<>();
        arrayOfVectors = new ArrayList<>();
    }

    // Getting vectors from console //
    public void readVectors(){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < howManyVectors; i++){
            ArrayList<Integer> vector = new ArrayList<>();
            String vec = scan.nextLine();
            String[] vecSplitted = vec.split(" ", 0);
            for(int j = 0; j < vecSplitted.length; j++) {
                try{
                    vector.add(parseInt(vecSplitted[j]));       //checking if elements of vector are Ints
                }catch (NumberFormatException e) {
                    e.printStackTrace();
                    continue;
                }
            }
            arrayOfVectors.add(vector);
        }
    }

    // Adding vectors //
    public ArrayList addVectors()throws WektoryRoznejDlugosciException {
        for(int i = 1; i < howManyVectors; i++){                                //Checking if vectors are same length
            if(arrayOfVectors.get(0).size() != arrayOfVectors.get(i).size()) {
                throw new WektoryRoznejDlugosciException(arrayOfVectors.get(0).size(), arrayOfVectors.get(i).size(), "Vectors aren't same length. First vector: " + arrayOfVectors.get(0).size() + " ,Second vector: " + arrayOfVectors.get(i).size());
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result = arrayOfVectors.get(0);
        for (int i = 1; i < howManyVectors; i++) {
            ArrayList<Integer> vecTemp = arrayOfVectors.get(i);
            for (int j = 0; j < arrayOfVectors.get(0).size(); j++){
                result.set(j,(result.get(j) + vecTemp.get(j)));
            }
        }
        return result;
    }
}
