package labsheet;
import java.util.Arrays;
import java.util.Comparator;



class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;  
        this.value = value;
    }
}

public class Fractionalknapsack {
	public static double getMaxValue(int knapsackCapacity, Item[] items) {
        Arrays.sort(items, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());

        double totalValue = 0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= knapsackCapacity) {
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                int remainingCapacity = knapsackCapacity - currentWeight;
                double fraction = (double) remainingCapacity / item.weight;
                currentWeight += (int) remainingCapacity;
                totalValue += item.value * fraction;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = { new Item(10, 60), new Item(20, 100), new Item(30, 120) };
        int knapsackCapacity = 50;

        double maxValue = getMaxValue(knapsackCapacity, items);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }

	 in the ever-evolving IT industry.

	}


