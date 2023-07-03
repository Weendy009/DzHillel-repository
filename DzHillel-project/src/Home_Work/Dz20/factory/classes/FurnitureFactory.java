package Home_Work.Dz20.factory.classes;


public class FurnitureFactory {
    public Furniture createFurniture(String type) {
        if (type.equalsIgnoreCase("chair")) {
            return new Chair();
        } else if (type.equalsIgnoreCase("table")) {
            return new Table();
        }
        return null;
    }
}