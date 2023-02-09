import javax.lang.model.util.ElementScanner6;

public class Box {
    
    private int size;
    private String contents;
    private static char sym = '*';

    public Box() {
        size = 4;
        contents = "";
    }

    public Box(int size, String contents){
        this.size = size;
        this.contents = contents;
        fixSize();
    }

    public int getSize(){
        return size;
    }

    public String getcontents(){
        return contents;
    }

    public void getSize(int size){
        this.size = size;
        fixSize();
    }

    public void setContents(String contents){
        this.contents = contents;
        fixSize();
    }

    private void fixSize(){
        int actual = contents.length() + 4;
        this.size = Math.max(actual, this.size);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString(){
        String theSym = Character.toString(Box.sym);
        String out = "";
        for (int i = 0; i< this.size; i++)
            out +=theSym;
        out += "\n";
        out += theSym + " " + this.contenets + " ";
        int spaces = this.size - this.contents.length() - 4;
        for (int i = 0; i < spaces; i++)
            out += " ";
        out += theSym + "\n";
        for (int i = 0; i < this.size; i++)
            out += theSym;
        return out;
    }

    @Override
    public boolean equals(Object obj){
        Box b2 = (Box) obj;
        if (this.contents.equals(b2.contents));
            return true;
        else
            return false;
    }

    public static void setSymbol(char s){
        Box.sym = s;
    }
}
