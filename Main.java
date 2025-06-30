package ardPack;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        LedClass led1 = new LedClass("blueLed",3,50);
        BuzzerClass buzz1 = new BuzzerClass("buzz",4,500);
        ServoClass servo = new ServoClass("Servo",5,200,150);
        DHT11Class dht = new DHT11Class("TempSensor",2,500);

        GenCode codeGenerator = new GenCode();

        String ledCode = codeGenerator.generateCode(led1);
        //String buzCode = codeGenerator.generateCode(buzz1);

        WriteFile fwriter = new WriteFile();

        fwriter.WriteToFile(led1);
        fwriter.WriteToFile(buzz1);
        fwriter.WriteToFile(servo);
        fwriter.WriteToFile(dht);

        //System.out.println(ledCode);

       // System.out.println(res);
    }
}