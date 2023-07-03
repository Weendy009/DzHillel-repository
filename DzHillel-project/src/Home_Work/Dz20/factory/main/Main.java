package Home_Work.Dz20.factory.main;

import Home_Work.Dz20.factory.classes.Furniture;
import Home_Work.Dz20.factory.classes.FurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Furniture chair = factory.createFurniture("chair");
        chair.assemble();

        Furniture table = factory.createFurniture("table");
        table.assemble();
    }
}
