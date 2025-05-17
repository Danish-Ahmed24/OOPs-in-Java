package Omar;


import java.util.ArrayList;

public class Stringggg {
    public String[] names;
    private int namesCounter = 0;

    public Stringggg()
    {
        names=new String[5];
    }

    public void addName(String name) throws ArraySizeExceededException
    {
        if(namesCounter<=5)
        {
        names[namesCounter] = name;
        namesCounter++;
        }else {
            throw new ArraySizeExceededException("aray full hai");
        }
    }
}
