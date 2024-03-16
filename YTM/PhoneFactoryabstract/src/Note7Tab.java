public class Note7Tab implements Itablet {
    
    String model;
    String inch;
    String memory;

    public Note7Tab(String model, String inch, String memory) {
        this.model = model;
        this.inch = inch;
        this.memory = memory;
        System.out.println("Note7Tab constructor" + model + " " + inch + " " + memory);
    }

    public String getModel() {
        return model;
    }

    public String getInch() {
        return inch;
    }

    public String getMemory() {
        return memory;
    }
}
