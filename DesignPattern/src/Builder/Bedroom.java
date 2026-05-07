package Builder;

public class Bedroom {
    private final String roomID;
    private final String bedType;
    private final String color;
    private final double sizeRoom;
    private final boolean hasBathroom;
    private final boolean hasBalcony;
    private final boolean hasTV;
    private final boolean hasAirConditioner;

    private Bedroom(BedroomBuilder build){
        this.roomID = build.roomID;
        this.bedType = build.bedType;
        this.color = build.color;
        this.sizeRoom = build.sizeRoom;
        this.hasBathroom = build.hasBathroom;
        this.hasBalcony = build.hasBalcony;
        this.hasTV = build.hasTV;
        this.hasAirConditioner = build.hasAirConditioner;
    }

    @Override
    public String toString() {
        return "ma phong: " + roomID + "\n loai guong: " + bedType + "\n mau sac: "
                + color + "\n kich thuoc: " + sizeRoom + "m2"
                + "\n phong tam: "+ hasBathroom + "\n ban cong: "+ hasBalcony
                + "\n tivi: "+ hasTV + "\n dieu hoa: " + hasAirConditioner;
    }

    public static class BedroomBuilder{
        private String roomID;
        private String bedType;
        private String color;
        private double sizeRoom;
        private boolean hasBathroom;
        private boolean hasBalcony;
        private boolean hasTV;
        private boolean hasAirConditioner;

        public BedroomBuilder(String roomID, String bedType){
            this.roomID = roomID;
            this.bedType = bedType;
        }

        public BedroomBuilder withColor(String color){
            this.color = color;
            return this;
        }

        public BedroomBuilder withSizeRoom(double sr){
            this.sizeRoom = sr;
            return this;
        }

        public BedroomBuilder withHasBathroom(boolean hbr){
            this.hasBathroom = hbr;
            return this;
        }

        public BedroomBuilder withHasBalcony(boolean hb){
            this.hasBalcony = hb;
            return this;
        }

        public BedroomBuilder withHasAirConditioner(boolean hac){
            this.hasAirConditioner = hac;
            return this;
        }

        public BedroomBuilder withHasTV(boolean htv){
            this.hasTV = htv;
            return this;
        }

        public Bedroom build(){
            return new Bedroom(this);
        }
    }
}
