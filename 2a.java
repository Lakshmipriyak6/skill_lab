// Enemy interface
interface Enemy {
    void attack();
}

// Concrete enemy classes for different levels
class EasyEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Easy enemy attacks with low damage!");
    }
}

class MediumEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Medium enemy attacks with moderate damage!");
    }
}

class HardEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Hard enemy attacks with high damage!");
    }
}

// Factory Method to create enemies based on level difficulty
abstract class EnemyFactory {
    public abstract Enemy createEnemy();

    public static EnemyFactory getFactory(int level) {
        if (level == 1) {
            return new EasyEnemyFactory();
        } else if (level == 2) {
            return new MediumEnemyFactory();
        } else {
            return new HardEnemyFactory();
        }
    }
}

class EasyEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}

class MediumEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new MediumEnemy();
    }
}

class HardEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}
