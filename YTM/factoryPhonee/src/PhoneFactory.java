public class PhoneFactory {
    public static IPhone getPhone(String model, String inch, String memory) {
        if (model.equals("note7")) {
            return new note7(model, inch, memory);
        } else if (model.equals("note8")) {
            return new note8(model, inch, memory);
        } else {
            System.out.println("No such phone");
            return null;
        }
    }
}
