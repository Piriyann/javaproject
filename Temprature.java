public class Temprature{
    double celsius;

    Temprature(double celsius){
        this.celsius =  celsius;
    }

    public void checkweather(){
        if( celsius > 30) {
            System.out.println(celsius +"c is hot.");
        }
        else{
            System.out.println(celsius + "c is cool.");
        }
    }

    public static void main(String[] args) {
        Temprature t1 = new Temprature(23.3);
        Temprature t2 = new Temprature(34.23);

        t1.checkweather();
        t2.checkweather();
    }
}

