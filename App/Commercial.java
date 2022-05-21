import java.time.LocalDate;

public class Commercial extends Aircraft{

protected final String airlines;

    public Commercial(String manufacturer,String name, int range, int compacity, int weight,LocalDate inception, Long age, String airlines){
        super(manufacturer, name, compacity, range, weight, inception, age);
        this.airlines= airlines;
    }
    protected void getAirlines(){
        String[] arls = airlines.split(",");
            for(String s: arls){
               System.out.println(s); 
        }
    }
}
