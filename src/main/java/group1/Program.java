package group1;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Program {

    String name;
    List<Module> modules = new ArrayList<Module>();
    DateTime startDate;
    DateTime endDate;

    public void setName(String name) {
        this.name = name;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void setStartDate(DateTime date) {
        this.startDate = date;
    }

    public void setEndDate(DateTime date) {
        this.endDate = date;
    }

    public String getName() {
        return this.name;
    }

    public List<Module> getModules() {
        return this.modules;
    }

    public DateTime getStartDate() {
        return this.startDate;
    }

    public DateTime getEndDate() {
        return this.endDate;
    }

}
