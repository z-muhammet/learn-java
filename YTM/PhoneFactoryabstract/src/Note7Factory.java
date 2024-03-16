public class Note7Factory implements IdeviceMenager {
    @Override
    public IPhone getPhone(String inch, String memory) {
        return new note7("note7", inch, memory);
    }
    @Override
    public Itablet getTablet(String inch, String memory) {
        return new Note7Tab("note7 Tablet", inch, memory);
    }
}
