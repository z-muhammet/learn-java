public class Note8Factory implements IdeviceMenager {

    @Override
    public IPhone getPhone(String inch, String memory) {
        return new note8("note8", inch, memory);
    }
    @Override
    public Itablet getTablet(String inch, String memory) {
        return new Note8Tablet("note8 tablet", inch, memory);
    }

}
