public class ToysRandom {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toys toy1 = new Toys(1, "Конструктор", 10, 20);
        Toys toy2 = new Toys(2, "Трансформер", 200, 40);
        Toys toy3 = new Toys(3, "Мяч", 200, 90);
        Toys toy4 = new Toys(3, "Кукла", 50, 30);
        Toys toy5 = new Toys(3, "Пазл", 200, 90);
        Toys toy6 = new Toys(3, "Машинка", 10, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRandom();

        Toys prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрыш: " + prizeToy.getName());
        }
    }
}