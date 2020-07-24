import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OperationOnFile {
    private String nameOfFile;
    public OperationOnFile(String name){
        this.nameOfFile = name;
    }
    public void saveToTxtFile(ArrayList<Integer> vector){
        try {
            File file = new File(nameOfFile);
            FileWriter fileWrite = new FileWriter(file);
            PrintWriter printWrite = new PrintWriter(fileWrite);
            printWrite.println(vector);
            printWrite.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
