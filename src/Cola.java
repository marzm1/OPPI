public class Cola extends Napoje{
    public Cola(String nazwa) {
        super(nazwa);
    }

    @Override
    int pij() {
        return 0;
    }

    private void trzes() {
        System.out.println("trzesie");
    }
}
