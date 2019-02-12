import com.brainacad.oop1.Car;

public class CarTest {

    static public void trimString(String str1){
        str1 = str1.trim();
    }

    public static void main(String[] args){
        CarTest.trimString("ddd");

        Car nissan = new Car("Note", 2018);
        Car opel = new Car("Astra", 2016);
        Car mazda = new Car();

        mazda.setModel("Mazda Model");
        mazda.setYear(2017);

        System.out.println( mazda.getModel() );
        System.out.println( nissan.getModel() );
        System.out.println( opel.getModel() );

        System.out.println( nissan.getYear() + opel.getYear() );

        Car nullCar = null;

        String a = "aa ";
        trimString(a);
        System.out.println("=" + a + "=");

        System.out.println( mazda.toString() );

        Car myCar = new Car();
        myCar.test(1);
        myCar.test("DDD");
        myCar.test(3, 4.5);
        myCar.test( new int[]{1,3} );

     }


}