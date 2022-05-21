import java.time.LocalDate;

public class Civil extends Aircraft {

protected final String Type;

public Civil(String manufacturer,String name, String tailNum, int range, int weight,LocalDate inception, Long age, String Type){
        super(manufacturer, name,tailNum, range, weight, inception, age);
        this.Type = Type;
    }

}
