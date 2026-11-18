public class rectangle {
    double length;
    double width;

    double calculateArea(){
        return length * width;
    }

    public static void main(String[] args){
        rectangle react = new rectangle();

        react.length = 3.0;
        react.width = 7.0;

        System.out.println("Area:" + react.calculateArea());

    }
}