package hw1;

public class HotCafe extends HotDrink {
    public HotCafe(int name, int volume, int temperature) {
        super(name, volume,temperature);
    }

    @Override
    public void getProduct(int name, int volume, int temperature){
        System.out.println(getName()+".1 Кофе без молока  " + getVolume() + " мл  t=" +  getTemperature() + "°C");
        System.out.println(getName()+".2 Капучино " + getVolume() + " мл  t=" +  getTemperature() + "°C");

    }
}
