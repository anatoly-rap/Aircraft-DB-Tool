import java.io.File;
import java.util.Scanner;

public class dataImport extends aircraftData {
    
dataImport(String airlines){
    airlineParser(airlines); 
    //aircraftParser(aircraft);
}
void aircraftParser(String aircraft){
try {
    Scanner data = new Scanner(new File(aircraft));
        while(data.hasNext()){
            Scanner line = new Scanner(data.nextLine());
            line.useDelimiter(",");
                while(line.hasNext()){
                    if(airlineFleet(line.next())){
                        Commercial ca = new Commercial
                        (line.next().trim(),
                        line.next().trim(),
                        line.nextInt(),
                        line.nextInt(),
                        line.nextInt(),
                        objTime(line.next().trim().toString()),      //ISO format-> str-> LocalDate
                        line.nextLong(),
                        line.next());
            commericalAircraft.add(ca);
            }

        }
   }
} catch (Exception e){
    e.printStackTrace();
    }
}
void airlineParser(String airlines){

try {
    Scanner scan = new Scanner(new File(airlines));
        while(scan.hasNext()){
            String line = scan.nextLine();
            System.out.println("adding airline: " + line);  //testing purposes
                super.airlines.add(line);
            }
            scan.close();
            }catch (Exception e){
        e.printStackTrace();
        }
    }
}
