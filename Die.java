package lab_Ten;

public class Die{
    private int side;

public Die()
{
    setSide(1);
}

public Die(int newSide)
{
        setSide(newSide);
}

public int getSide(){ 
        return side; 
}

public void setSide(int newSide){ 
        side=newSide; 
}

public void roll(){
    side = (int)(Math.random()*6+1);
}

public String toString(){
        return "Die=" + side;
}
}


