public class note8 implements IPhone {
    String model;
    String inch;
    String memory;

    public note8(String model, String inch, String memory) {
        this.model = model;
        this.inch = inch;
        this.memory = memory;
        System.out.println("Note8 constructor" + model + " " + inch + " " + memory);
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