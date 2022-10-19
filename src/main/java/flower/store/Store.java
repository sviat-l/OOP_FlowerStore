package flower.store;

import java.util.HashSet;
import java.util.Set;

public class Store {
    private final Set<FlowerBucket> allFlowerBuckets;

    public Store() {
        allFlowerBuckets = new HashSet<>();
    }

    public void add(FlowerBucket flowerBucket) {
        allFlowerBuckets.add(flowerBucket);
    }

    public Set<FlowerBucket> search(Set<FlowerType> flowerTypes) {
        Set<FlowerBucket> validBuckets = new HashSet<>();
        for (FlowerBucket flowerBucket : this.allFlowerBuckets) {
            if (flowerBucket.getAllFlowerTypes().equals(flowerTypes)) {
                validBuckets.add(flowerBucket);
            }
        }
        return validBuckets;
    }
}
