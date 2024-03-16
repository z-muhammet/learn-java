public class App {
    public static void main(String[] args) throws Exception {
        EvFacade ev = new EvFacade();
        ev.enterHome();
        ev.volumeUp();
        ev.volumeDown();
        ev.televizyonuKapat();
        ev.exitHome();
        ev.enterHome();
        ev.closeClimate();
        ev.tunedOffLight();
        ev.tempChanged(25);
        ev.openTv();
        ev.changedUpChannel();
        ev.changedDownChannel();
        ev.lockedDoor();
        ev.exitHome();

    }
}
