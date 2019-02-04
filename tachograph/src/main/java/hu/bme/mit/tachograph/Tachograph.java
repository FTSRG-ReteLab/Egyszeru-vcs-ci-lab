import hu.bme.mit.train.system.TrainSystem;
import java.util.Date;

public class Tachograph{
    private TrainSystem trainsystem = new TrainSystem();
    private Table<Date, Integer, Integer> table = new HashBasedTable.create();

    public saveData(int position){
        this.table.put(new Date(), trainsystem.getController().getReferenceSpeed(), trainsystem.getUser().getJoystickPosition())
    }

}