package pl.ergohestia.dakt.spacechallenge;

public interface SpaceShip {

  boolean launch();
  boolean land();
  boolean canCarry(Item item);
  double carry(Item item);

}

