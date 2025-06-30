package ardPack;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends GenCode{

    public void WriteToFile(Component comp) {
        String name = comp.name+".ino";
        try {
            FileWriter fwriter = new FileWriter(name);
            fwriter.write(generateCode(comp));
            fwriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
