import java.util.ArrayList;

//hihi
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> resultOfAdding = new ArrayList<>();
        System.out.println("Give vectors:");
        int check = 0;
        do {
            MyVector vector = new MyVector();
            vector.readVectors();
            check = 0;
            try {
                resultOfAdding = vector.addVectors();
            } catch (WektoryRoznejDlugosciException e) {
                e.printStackTrace();
                check = 1;
            }
        }while (check == 1);

        System.out.println(resultOfAdding);

        OperationOnFile file = new OperationOnFile("file.txt");
        file.saveToTxtFile(resultOfAdding);
    }
}
