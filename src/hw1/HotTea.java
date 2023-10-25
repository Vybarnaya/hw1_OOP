package hw1;

public class HotTea extends HotDrink {
    public HotTea(int name, int volume, int temperature) {
        super(name, volume, temperature);

    }
    @Override
    public void getProduct(int name, int volume, int temperature){
        System.out.println(getName()+".1 Чай черный " + getVolume() + "мл  t=" +  getTemperature() + "°C");
        System.out.println(getName()+".2 Чай зеленый " + getVolume() + "мл  t=" +  getTemperature() + "°C");
    }
}
