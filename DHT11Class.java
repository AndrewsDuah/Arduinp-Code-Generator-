package ardPack;

public class DHT11Class extends Component {
    private int delayTime;

    DHT11Class(String name, int pin, int delayTime) {
        super(name, pin);
        this.delayTime = delayTime;
    }

    @Override
    public String getRequiredLibraries() {
        return "#include <DHT.h>";
    }

    @Override
    public String generateDeclaration() {
        String codeTxt = String.format("""
                #define DHTPin %d
                #define Type DHT11
                float humidity;
                float tempC;
                float tempF;
                #define delayTime %d
                DHT %s(DHTPin, Type);
                """, pin, delayTime, name);

        return codeTxt;
    }

    @Override
    public String generateSetupCode() {
        String codeText = String.format("""
                Serial.begin(9600);\n  // you can change the baud rate to your desired one
                  %s.begin();
                """, name);
        return codeText;
    }

    @Override
    public String generateLoopCode() {
        String txt = String.format("""
                humidity = %s.readHumidity();
                tempC = %s.readTemperature();
                tempF = %s.readTemperature(true);
                Serial.print("Humidity: ");
                Serial.print(humidity);
                Serial.print(" ");
                Serial.print("Temperature(C): ");
                Serial.print(tempC);
                Serial.print(" ");
                Serial.print("Temperature(F): ");
                Serial.println(tempF);
                delay(delayTime);
                """, name, name, name);
        return txt;
    }
}
