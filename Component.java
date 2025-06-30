package ardPack;

import java.util.ArrayList;

public abstract class Component {
    protected String name;
    protected  int pin;
    //ArrayList <String> getRequiredLibraries = new ArrayList<String>();

    Component(String name,int pin){
        this.name = name;
        this.pin = pin;
    }
    public abstract String getRequiredLibraries();

    public abstract String generateDeclaration();

    public abstract String generateSetupCode();

    public abstract String generateLoopCode();
}
