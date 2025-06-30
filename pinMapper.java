package ardPack;
import java.util.HashMap;
import java.util.ArrayList;

public class pinMapper {
    HashMap<Integer,Component> PinAssignBook;

    public pinMapper(){
        PinAssignBook = new HashMap<Integer,Component>();
    }

    public boolean isPinAvailable(int pin){
        boolean avail;
        if(PinAssignBook.containsKey(pin)){
            avail = false;
        }else{
            avail = true;
        }
        return avail;
    }
    public boolean assignPin(int pin,Component comp){
        boolean assignmentDone;
        if(isPinAvailable(pin)){
            PinAssignBook.put(pin,comp);
            assignmentDone = true;
        }else{
            assignmentDone = false;
        }
        return  assignmentDone;
    }
    public Component getComponentByPin(int pin){
        return PinAssignBook.get(pin);
    }
    public  void removeComponent(int pin){
        PinAssignBook.remove(pin);
        System.out.printf("Pin %d is now free",pin);
    }
    
}
