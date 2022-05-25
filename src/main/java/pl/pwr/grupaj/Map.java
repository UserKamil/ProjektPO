package pl.pwr.grupaj;

public class Map {
    private int mapDimensions;
    public static Element[][] map;
    //zrobic mape zeby nie byla za mala
    Map(int mapDimensions){
        MapInitialization mapInitialization = new MapInitialization(mapDimensions);
        this.mapDimensions=mapDimensions;
        this.map = new Element[mapDimensions][mapDimensions];

        mapInitialization.initialization();
    }

}
