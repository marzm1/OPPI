public abstract class Napoje {
    private String nazwa;

    public Napoje(String nazwa) {
        this.nazwa = nazwa;
    }

    abstract int pij();

    public String getNazwa() {
        return nazwa;
    }
}
