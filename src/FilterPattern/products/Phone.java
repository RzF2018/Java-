package FilterPattern.products;

public class Phone {

    private String name;
    private Color color;
    Function function;

    public Phone(String name, Color color, Function function){
        this.name = name;
        this.color = color;
        this.function = function;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Function getFunction(){
        return function;
    }

}
