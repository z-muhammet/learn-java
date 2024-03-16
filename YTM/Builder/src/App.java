class AllSekilCreator {
    public sekil ucgen(){
        sekilMenager sekilMenager = new sekilMenager(new ucgenCreator());
        sekilMenager.sekilOlustur();
        sekil ucgen = sekilMenager.getSekil();
        System.out.println(ucgen);
        return ucgen;
    }
    public sekil besgen(){
        sekilMenager sekilMenager = new sekilMenager(new besgenCreator());
        sekilMenager.sekilOlustur();
        sekil besgen = sekilMenager.getSekil();
        System.out.println(besgen);
        return besgen;
    }
    
}

public class App {
    public static void main(String[] args) {
     AllSekilCreator olustur= new AllSekilCreator();
        olustur.besgen();
        olustur.ucgen();
        
    }
}