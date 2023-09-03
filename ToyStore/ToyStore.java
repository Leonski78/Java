import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToyStore {
    private ArrayList<Toys> toys;
    private ArrayList<Toys> prizeToys;
    private String prizeFilePath;

    public ToyStore() {
        toys = new ArrayList<Toys>();
        prizeToys = new ArrayList<Toys>();
        prizeFilePath = "toys.txt";
    }

    public void addToy(Toys toy) {
        toys.add(toy);
    }

    public void changeToyFrequency(int toyId, double newFrequency) {
        for (Toys toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(newFrequency);
            }
        }
    }

    public void organizeRandom() {
        prizeToys.clear();

        for (Toys toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getFrequency()) {
                prizeToys.add(toy);
            }
        }
    }
    public Toys getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toys prizeToy = prizeToys.remove(0);
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);

            try {
                FileWriter writer = new FileWriter(prizeFilePath, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл игрушки");
            }

            return prizeToy;
        } else {
            System.out.println("Все игрушки кончились");
            return null;
        }
    }
}
