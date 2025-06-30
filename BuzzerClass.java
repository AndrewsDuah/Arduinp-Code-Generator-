package ardPack;

public class BuzzerClass extends  Component{
    private int delayTime;

    BuzzerClass(String name,int pin,int delayTime){
        super(name,pin);
        this.delayTime = delayTime;
    }
    @Override
    public String getRequiredLibraries(){
        return null;
    }
    @Override
    public String generateDeclaration(){
        String codetxt = String.format("""
                #define buzzPin %d
                #define delayTime %d
                """,pin,delayTime);
        //return "#define buzzPin "+pin;

        return codetxt;
    }

    @Override
    public String generateSetupCode(){
        return "pinMode(buzzPin,OUTPUT);";
    }

    @Override
    public String generateLoopCode(){
        String codeText1 = String.format("""
                digitalWrite(buzzPin,HIGH);
                delay(delayTime);
                digitalWrite(buzzPin,LOW);
                delay(delayTime);
                """);
        return  codeText1;
    }

}
