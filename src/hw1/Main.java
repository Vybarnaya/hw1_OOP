package hw1;
//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        Создать класс ГорячихНапитковАвтомат, реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
//        getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
//        заложенную в программе
//        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
public class Main {
    public static void main(String[] args) {
        HotDrink hotCafe = new HotCafe( 1,300,80);
        HotDrink hotTea = new HotTea(2,300,85);

        System.out.println("В продаже имеются следующие горячие напитки: ");
        System.out.println();
        System.out.println(hotCafe.getName() +" Кофе: ");

        hotCafe.getProduct(1,300,80);
        System.out.println();

        System.out.println(hotTea.getName() +" Чай: ");
        hotTea.getProduct(2,300,85);


//        HotDrink[] hotDrinks = new HotDrink[4];
//        hotDrinks[0] = new HotCafe(1,250,65);
//        hotDrinks[1] = new HotTea(2,250,70);
//        hotDrinks[2] = new HotCafe(3,400,80);
//        hotDrinks[3] = new HotTea(4,400,85);
//
//        System.out.println("В продаже имеются следующие горячие напитки: ");
//
//        for (HotDrink item : hotDrinks){
//
//            System.out.println("Напиток под номером " + item.getName() +":");
//            System.out.println("Объем= " + item.getVolume()+ "мл");
//            System.out.println("Температура: " + item.getTemperature() + "°C");
//
//            System.out.println();
    }
}

