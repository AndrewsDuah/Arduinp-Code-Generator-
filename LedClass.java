package ardPack;

public class LedClass extends Component{
    private  int delayTime;

    LedClass(String name,int pin,int delayTime) {
        super(name,pin);
        this.delayTime = delayTime;
    }
    @Override
    public  String getRequiredLibraries(){
        return null;
    }

    @Override
    public  String generateDeclaration(){
        String codetxt = String.format("""
                #define LED_PIN_COLOR %d
                #define delayTime %d
                """,pin,delayTime);
       //return "#define LED_PIN_COLOR "+pin+ ";";

        return codetxt;
    }

    @Override
    public String generateSetupCode(){
        return "pinMode(LED_PIN_COLOR,OUTPUT);";
    }

    @Override
    public  String generateLoopCode(){
        String codeText = String.format("""
                digitalWrite(LED_PIN_COLOR,HIGH);
                delay(delayTime);
                digitalWrite(LED_PIN_COLOR,LOW);
                delay(delayTime);
                """);
        return  codeText;
    }

    public String blinkLed(int numOfTimes){
        String codeText = String.format("""
                for(int i = 0; i< %d; i++){
                digitalWrite(LED_PIN_COLOR,HIGH);
                delay(delayTime);
                digitalWrite(LED_PIN_COLOR,LOW);
                delay(delayTime);
                }
                """,numOfTimes);

        return codeText;
    }

//    public String generateCode() {
//        StringBuilder sb = new StringBuilder();
//
//        String libs = getRequiredLibraries();
//        if (libs != null && !(libs.isEmpty())) {
//            sb.append(libs).append("\n");
//        }
//
//        sb.append(generateDeclaration()).append("\n\n");
//
//        // Add setup code wrapped in setup function
//        sb.append("void setup() {\n");
//        sb.append("  ").append(generateSetupCode()).append("\n");
//        sb.append("}\n\n");
//
//        // Add loop code wrapped in loop function
//        sb.append("void loop() {\n");
//        for(String line: generateLoopCode().split("\n")){
//            sb.append("  ").append(line).append("\n");
//        }
//        sb.append("}\n");
//
//        return sb.toString();
//    }
}
