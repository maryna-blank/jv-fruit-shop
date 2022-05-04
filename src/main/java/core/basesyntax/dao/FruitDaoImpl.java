package core.basesyntax.dao;

import core.basesyntax.db.Storage;

public class FruitDaoImpl implements FruitDao {

    @Override
    public Integer get(String fruitName) {
        if (Storage.fruits.containsKey(fruitName)) {
            return Storage.fruits.get(fruitName);
        } else {
            throw new RuntimeException("There's no such a fruit in a Storage");
        }
    }

    @Override
    public void update(String fruitName, Integer amount) {
        Storage.fruits.put(fruitName, amount);
    }
}