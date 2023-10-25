package hw1;
//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        Создать класс ГорячихНапитковАвтомат, реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
//        getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
//        заложенную в программе
//        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

public class HotDrink {
    private int name;
    private int volume;
    private int temperature;


    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(int name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public void getProduct(int name, int volume, int temperature){
        System.out.println(name + volume + " мл  t=" +  getTemperature() + "°C");
    }
}
