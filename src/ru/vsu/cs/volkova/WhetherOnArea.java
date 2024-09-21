package ru.vsu.cs.volkova;

public class WhetherOnArea {

    public static void main(String[] args) {
        Whether whether = new Whether(92.98, "hot");
        Whether whether1 = new Whether(105.4, "warm");
        Area area = new Area(72.0, 132.0, AreaEnum.plain, whether);
        Area area1 = new Area(45.0, 37.0, AreaEnum.hilly, whether1);
        System.out.println("Width - " + area.getWidth() + " longitude - " + area.getLongitude() + " type of area - "
                + area.toWrite() + ", now this " + whether.getText() + ", pressure " + whether.getPressure());

        System.out.println("Width - " + area1.getWidth() + " longitude - " + area1.getLongitude() + " type of area - "
                + area1.toWrite() + ", now this " + whether1.getText() + ", pressure " + whether1.getPressure());
    }
}
