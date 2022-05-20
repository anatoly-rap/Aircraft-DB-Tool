import java.util.ArrayList;
import java.util.List;

public abstract class aircraftData {

    protected final List<Commerical> commericalAircraft;
    protected final List<Military> militaryAircraft;
    protected final List<Civil> civilAircraft;

    public aircraftData(){

        commericalAircraft = new ArrayList<>();
        militaryAircraft = new ArrayList<>();
        civilAircraft = new ArrayList<>();
    }

    public List<Commerical> getCommerical(){

        return commericalAircraft;
    }
    public List<Military> getMilitary(){

        return militaryAircraft;
    }
    public List<Civil> getCivil(){

        return civilAircraft;
    }
    protected Long findRange(String name){

        if(name.contains("Boeing") || name.contains("Airbus")){     //will rewrite .equals methods later
            if(name.contains("7 7") || name.contains("A3")){
                for(Commerical c: commericalAircraft){
                    if(c.getName().equals(name)){
                    return c.getAge();
                }
            }
        }
    }for(Civil k: civilAircraft){ //remaining 2 cases, Civil & Military
            if(k.getName().equals(name)){
                return k.getAge();
            }
        }for(Military m: militaryAircraft){
            if(m.getName().equals(name)){
                return m.getAge();
            }
        }
            System.out.println("no matching aircraft found...");
        return null;
    }
    protected List<Commerical> airlineFleet(String airline){
        
    }
}
