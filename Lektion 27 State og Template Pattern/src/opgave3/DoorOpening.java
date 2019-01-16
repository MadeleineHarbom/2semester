package opgave3;

public class DoorOpening extends DoorState {
    private Door door;

    public DoorOpening(Door door) {
        this.door = door;
    }

    @Override
    public void timeout() {
        super.timeout();
    }

    @Override
    public void complete() {
        super.complete();
    }

    @Override
    public void click() {
        super.click();
    }
}
