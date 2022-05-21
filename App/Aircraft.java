import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal; 

public class Aircraft{
    protected String name, manufacturer;;
    protected Long age;
    protected LocalDate inception;
    protected java.util.Date currentDate =  new java.util.Date();
    protected int range,weight, capacity;

    Aircraft(String manufacturer,String name, int capacity, int range, int weight,LocalDate inception, Long age){
        this.manufacturer = manufacturer;
        this.name = name;
        this.capacity = capacity;
        this.range = range;
        this.weight = weight;
        this.inception = inception;
        this.age = ChronoUnit.YEARS.between(inception, (Temporal) currentDate);
    }
    public String getName(){
        return name;
        }
    public int getRange(){
        return range;
        }
    public int getCapacity(){
        return capacity;
        }
    public String getInception(){
        return inception.toString();
        }
    public int getWeight(){
        return weight;
        }
    public String getManufacturer(){
        return manufacturer;
        }
    public Long getAge(){
        return age;
    }
    //comparables
    public String compareRange(Aircraft aircraft){
        if((this.getRange() > (((Aircraft) aircraft).getRange()))){
                int dif = this.getRange() - aircraft.getRange();
                System.out.println(this.getName() + " has a greater range than " + aircraft.getName()); 
                System.out.println(this.getName() + " can travel " + dif + "further than " + aircraft.getName());

            }else if((this.getRange() < (((Aircraft) aircraft).getRange()))){
                System.out.println(this.getName() +"has a shorter range than " + aircraft.getName());
        }return null;
    }
    public String compareWeight(Aircraft aircraft){
        if((this.getWeight() > (((Aircraft) aircraft).getWeight()))){
                System.out.println(this.getName() + "has a greater weight than" + aircraft.getName());

            }else if((this.getWeight() < (((Aircraft) aircraft).getWeight()))){
                System.out.println(this.getName() + "has a lower weight than" + aircraft.getName());
        }return null;
    }
//public boolean getAirline(Aircraft ac){}
}
