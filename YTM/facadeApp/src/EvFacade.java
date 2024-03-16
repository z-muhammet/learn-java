public class EvFacade {
    private climate climate;
    private light Light;
    private Door Door;
    private TV tv;

    public EvFacade() {
        climate = new climate();
        Light = new light();
        Door = new Door();
        tv = new TV();
    }

    public void exitHome() {
        climate.Close();
        Light.turnedOff(0);
        Light.turnedOff(1);
        Light.turnedOff(2);
        Door.lock();
    }

    public void enterHome() {
        Door.unlock();
        Light.turnedOn(0);
        Light.turnedOn(1);
        Light.turnedOn(2);
        climate.open();
    }

    public void tempChanged(int sicaklik) {
        climate.Chager(sicaklik);
    }

    public void openTv() {
        tv.Open();
    }

    public void televizyonuKapat() {
        tv.Close();
    }

    public void volumeUp() {
        tv.volumeUp();
    }

    public void volumeDown() {
        tv.volumeDown();
    }

    public void channelChanged(int kanal) {
        tv.channelChange(kanal);
    }

    public void changedUpChannel() {
        tv.ChannelUpChange();
    }

    public void changedDownChannel() {
        tv.channelDownChange();
    }

    public void closeClimate() {
        climate.Close();
    }

    public void OpenClimate() {
        climate.open();
    }

    public void tunedOffLight() {
        Light.turnedOff(0);
        Light.turnedOff(1);
        Light.turnedOff(2);
    }

    public void turnedonLight() {
        Light.turnedOn(0);
        Light.turnedOn(1);
        Light.turnedOn(2);
    }

    public void lockedDoor() {
        Door.lock();
    }

    public void unlockedDoor() {
        Door.unlock();
    }

}
