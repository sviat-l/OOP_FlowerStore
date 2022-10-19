package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private final Flower flower;
    private final int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }

    public FlowerType getPackFlowerType() {
        return flower.getFlowerType();
    }

}