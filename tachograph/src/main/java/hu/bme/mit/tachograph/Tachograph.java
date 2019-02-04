import hu.bme.mit.train.system.TrainSystem;
import java.util.Date;

public class Tachograph{
    private Table<Date, Integer, Integer> table = new HashBasedTable.create();

    public Tachograph(TrainSystem t){
        this.trainsystem = t;
    }

    public saveData(){
        this.table.put(new Date(), trainsystem.getController().getReferenceSpeed(), trainsystem.getUser().getJoystickPosition())
    }

    public Boolean isTableEmpty(){
        return this.table.isEmpty();
    }
}