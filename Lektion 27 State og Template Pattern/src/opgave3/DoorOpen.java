package opgave3;

public class DoorOpen extends DoorState {
    private Door door;

    public DoorOpen(Door door) {
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
        door.setState(door.getClosing());
    }

    @Override
    public String toString() {
        return "OPEN";
    }
}
