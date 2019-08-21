package IOTest.decorative;

public class Demo01 {
    public static void main(String[] args) {

    }
}
interface Voic {
    void Say(int voic);
}

class People implements Voic{
    private static int voic=10;

    @Override
    public void Say(int voic) {
        System.out.println(voic);
    }

    public static int getVoic() {
        return voic;
    }

    public static void setVoic(int voic) {
        People.voic = voic;
    }
}

class Dec implements Voic{
    Dec(Voic p){
        this.p=p;
    }
    Voic p;

    @Override
    public void Say() {
        System.out.println();
    }
}


