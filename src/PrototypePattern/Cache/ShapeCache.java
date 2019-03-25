package PrototypePattern.Cache;

import PrototypePattern.Shape.Shape;
import PrototypePattern.Shape.extend.Circle;
import PrototypePattern.Shape.extend.Rectangle;
import PrototypePattern.Shape.extend.Square;

import java.util.Hashtable;


public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    //每种形状进行数据库查询并创建该形状
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
