public class Helena extends Napoje{
    public Helena(String nazwa) {
        super(nazwa);
    }

    @Override
    int pij() {
        return 0;
    }
    private void zeruj() {
        System.out.println("zeruje");
    }
}
