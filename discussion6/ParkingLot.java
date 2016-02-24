// Design a ParkingLot package that allocates specific parking spaces to cars in a smart way. De- cide what classes you’ll need, and design the API for each. Time permitting, select data structures to implement the API for each class. Try to deal with annoying cases (like disobedient humans).

class ParkingLot {
  int capacity;
  int size;

// • When a new car arrives, the system should assign a specific space based on the type of car.
  public ParkingSpace park(Car car);

// • When a car leaves, the system should record that the space is free.
  

  // • Parking spots should have a sense of closeness to the entrance. When parking a car, place it as close to the entrance as possible. Assume these distances are distinct. 

// • Your package should be designed in a manner that allows different parking lots to have
// different numbers of spaces for each of the 3 types.


}

class Car {
  public static int TYPE_NORMAL = 1;
  public static int TYPE_COMPACT = 2;
  public static int TYPE_HANDICAPPED = 3;
  public int type;
}

class ParkingSpace {
  // • Parking spaces can be either regular, compact, or handicapped-only.
  public static int TYPE_NORMAL = 1;
  public static int TYPE_COMPACT = 2;
  public static int TYPE_HANDICAPPED = 3;
  public int type;

  // • All cars are allowed to park in regular spots. Thus, compact cars can park in both compact spaces and regular spaces.
  public boolean carCanParkHere(Car car);
}
