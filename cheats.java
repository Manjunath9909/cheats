package Cheats;

import java.io.DataInputStream;

public class cheats {
    DataInputStream din = new DataInputStream(System.in);
    public int readInt()
    {
        int d = 0;
        try
        {
            d = integer(din.readLine());
        }
        catch(Exception e){}
        return d;
    }

    public float readFloat()
    {
        float d = 0;
        try
        {
            d = Float(din.readLine());
        }
        catch(Exception e){}
        return d;
    }

    public void print()
    {
        
    }

    public int integer(String str)
    {
        int d = Integer.parseInt(str);
        return d;
    }

    public float Float(String str)
    {
        float f = Float.parseFloat(str);
        return f;
    }
}
