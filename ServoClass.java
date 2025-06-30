package ardPack;

public class ServoClass extends Component {
    private int delayTime;
    private int ServoPosition;

    ServoClass(String name,int pin, int delayTime,int ServoPosition){
        super(name,pin);
        this.delayTime = delayTime;
        this.ServoPosition = ServoPosition;
    }
    @Override
    public String getRequiredLibraries(){
        return "#include <Servo.h>";
    }
    @Override
    public String generateDeclaration(){
        String servoText = String.format("""
                #define ServoPin %d
                #define delayTime %d
                #define servoPosition %d
                Servo myServo;
                """,pin,delayTime,ServoPosition);
        return  servoText;
    }
    @Override
    public String generateSetupCode(){
        return "myServo.attach(ServoPin);";
    }
    @Override
    public String generateLoopCode(){
        String codeTxt = String.format("""
                myServo.write(servoPosition);
                delay(delayTime);
                """);

        return codeTxt;
    }
}
