public interface Animal {
    String name();
    void eat();
    void drink();
    boolean hasWool();
    int walk = 5;
    default int speed(){
        return speed();

    }




}
