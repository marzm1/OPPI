public class Woda extends Napoje{


    public Woda(String nazwa) {
        super(nazwa);
    }

    @Override
    int pij() {
        return 0;
    }
    private void podlej() {
         System.out.println("podlewa");
    }
}
