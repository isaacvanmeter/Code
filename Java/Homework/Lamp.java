
public class Lamp {

    private boolean isOn;

    public Lamp(){
        this.isOn = false;
    }

    public Lamp(boolean isOn){
        this.isOn = isOn;
    }

    public Lamp turnOn(){
        this.isOn = true;
        return this;
    }

    public Lamp turnOff(){
        this.isOn = false;
        return this;
    }

    public Lamp flip(){
        this.isOn = !isOn;
        return this;
    }

    public boolean isOn(){
        return this.isOn;
    }

    public Lamp setLamp(boolean isOn){
        this.isOn = isOn;
        return this;
    }

    @Override
    public String toString(){
        String out;
        if (this.isOn)
            out = String.format("%3s","ON");
        else
            out = String.format("%3s", "OFF");
        return out;
    }

    @Override
    public boolean equals(Object obj){
        Lamp other = (Lamp) obj;
        if (isOn != other.isOn){
            return false;
        }
        return true;
    }
}