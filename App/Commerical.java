import java.time.LocalDate;

public class Commerical extends Aircraft{
    
protected final String airline;

    public Commerical(String manufacturer,String name, String tailNum, int range, int weight,LocalDate inception, Long age, String airline){
        super(manufacturer, name, tailNum, range, weight, inception, age);
        this.airline = airline;

    }
    protected String getAirline(){
        return airline;
    }
}
