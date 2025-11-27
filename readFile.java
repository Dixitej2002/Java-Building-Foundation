import java.io.FileReader;
import java.io.IOException;

public class readFile {

    static void readerFile() throws IOException{
        FileReader fr = new FileReader("");
    }

    public static void main(String[] args) {
        try{
            readerFile();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("I am run..");
        }
    }
    
}
