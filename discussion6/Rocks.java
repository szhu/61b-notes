public class Pebble {
    public int weight;
    public Pebble() { weight = 1; }
}
Pebble p = new Pebble();
Pebble p = new Pebble();
p.weight = 5;


public class Rock {
    public final int weight;
    public Rock (int w) { weight = w; }
}



public class Rocks {
    public final Rock[] rocks;
    public Rocks (Rock[] rox) { rocks = rox; }
}
Rocks p = new Rocks(new Rock[] {...});
p.rocks[0] = ...;


public class SecretRocks {
    private Rock[] rocks;
    public SecretRocks(Rock[] rox) { rocks = rox; }
}
Rock[] list = new Rock[] {...};
Rocks p = new Rocks(list);
list[0] = ...;


public class PunkRock {
    private final Rock[] band;
    public PunkRock (Rock yRoad) { band = new Rock[] {yRoad}; }
    public Rock[] myBand() {
        return band;
    }
}
PunkRock p = new PunkRock(new Rock(...));
Rock[] list = p.myBand()
list[0] = ...;



public class MommaRock {
    public static final Pebble baby = new Pebble();
}
MommaRock p = new MommaRock();
p.baby.weight = 7;

MommaRock.baby.weight = 5;


