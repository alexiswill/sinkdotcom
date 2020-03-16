package homework;

public class Button {
    public String label;
    public String color;



    public Button(String label, String color){
        this.color = color;
        this.label = label;

    }
    public void setColor(String color) {
        System.out.println("Color set");

    }

    public void setLabel(String label) {
        System.out.println("Label set");
    }

    public void dePress(String color) {
        System.out.println("Depress");

    }

    public void unDepress(String label){
        System.out.println("Undepress");
    }
}


