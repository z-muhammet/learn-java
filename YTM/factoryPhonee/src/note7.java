public class note7 implements IPhone {
    String model;
    String inch;
    String memory;

    public note7(String model, String inch, String memory) {
        this.model = model;
        this.inch = inch;
        this.memory = memory;
        System.out.println("Note7 constructor" + model + " " + inch + " " + memory);
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