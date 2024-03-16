public class TV {
    private int sesSeviyesi;
    private int kanal;

    public TV() {
    }

    public void Open() {
        sesSeviyesi = 0;
        kanal = 1;
        System.out.println("TV Turned On.");
    }

    public void Close() {
        System.out.println("TV Turned Off.");
    }

    public void volumeUp() {
        sesSeviyesi++;
        System.out.println("TV Of Sound Turned On.");
    }

    public void volumeDown() {
        sesSeviyesi--;
        System.out.println("TV Of Sound Turned Off.");
    }

    public void channelChange(int kanal) {
        System.out.println("channel Changed: " + kanal);
    }

    public void ChannelUpChange() {
        kanal++;
        System.out.println("channel changed UP.");
    }

    public void channelDownChange() {
        kanal--;
        System.out.println("channel changed DOWN.");
    }
}
