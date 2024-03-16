public class light {
    private boolean durum[];

    public light() {
        durum = new boolean[3];
    }

    public void turnedOn(int isik) {
        durum[isik] = true;
        System.out.println("light Turned On.");
    }

    public void turnedOff(int isik) {
        durum[isik] = false;
        System.out.println("Light Turned Off.");
    }

}
