import java.time.LocalDate;

public class Military extends Aircraft {

    protected final String type;
    
    public Military(String manufacturer,String name, String tailNum, int range, int weight,LocalDate inception, Long age, String Type){
        super(manufacturer, name,tailNum, range, weight, inception, age);
        this.type = Type;
    }
}
