package ardPack;

public class LCD_I2C extends Component{
    private int address;


    LCD_I2C(String name, int address){
        super(name);
        this.address = address;
    }
    @Override
    public String getRequiredLibraries(){
        return "#include <LiquidCrystal_I2C.h>";
    }
    @Override
    public String generateDeclaration(){
        String lcdtxt1 = String.format("""
                LiquidCrystal_I2C %s(%d, 16, 2);
                """,name,address);

        return  lcdtxt1;
    }

    @Override
    public String generateSetupCode(){
        String lcdtxt2 = String.format("""
                %s.init();
                  %s.clear();
                  %s.backlight();
                """,name,name,name);

        return lcdtxt2;
    }

    @Override
    public String generateLoopCode(){
        String lcdtxt3 = String.format("""
                %s.setCursor();
                %s.print("Hello Arduino");
                """,name,name);

        return lcdtxt3;
    }
}
