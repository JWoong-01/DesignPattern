package Abstract_Factory;

public class WhitePartsProFactory implements ShipPartsFactory {
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
