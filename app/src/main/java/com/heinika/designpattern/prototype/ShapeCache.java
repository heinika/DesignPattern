package com.heinika.designpattern.prototype;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeMap
            = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("Circle");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("Square");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("Rectangle");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
