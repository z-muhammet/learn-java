public class Note8Tablet implements Itablet {
    
    String model;
    String inch;
    String memory;

    public Note8Tablet(String model, String inch, String memory) {
        this.model = model;
        this.inch = inch;
        this.memory = memory;
        System.out.println("Note8Tablet constructor" + model + " " + inch + " " + memory);
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
