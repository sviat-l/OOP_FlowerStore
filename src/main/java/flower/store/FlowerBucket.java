package flower.store;

import lombok.Getter;
import java.util.*;
@Getter
public class FlowerBucket {
    private final HashSet<FlowerPack> bucket;
    private double price;

    public FlowerBucket() {
        bucket = new HashSet<>();
        this.price = 0;
    }

    public void add(FlowerPack newPack){
        this.bucket.add(newPack);
    }

    public double getPrice(){
        double price = 0.0;
        for(FlowerPack flowerpack:this.bucket){
            price += flowerpack.getPrice();
        }
        this.price = price;
        return price;
    }

    public Set<FlowerType> getAllFlowerTypes(){
        Set<FlowerType> allTypes = new HashSet<>();
        for (FlowerPack pack:bucket){
            allTypes.add(pack.getPackFlowerType());
        }
        return allTypes;
    }

}
