## Singleton Pattern

Singleton pattern ensures a class only has one instance and provides a global point of access to it

Use cases include: thread pools; caches; registry settings; objects used for logging, reporting metrics; objects acting as device drivers

### Key principles:

- Singleton pattern is advantageous over global instances because of `lazy instantiation`
- To tackle hazards of multithreading, consider 3 strategies:
  - If performance doesn't matter, make use of synchronization while instantiating singleton
  - Move to `eager instantiation`
  - Use `double-checked locking` to reduce the use of synchronization


### Understanding the code

- This is a simulation of a ChocolateBoiler
- The chocolate boiler boils chocolate milk
- The boiled chocolate milk can be drained to make chocolate
- It can prove catastrophic if we try to boil an empty or already boiled chocolateBoiler
- It can also prove catastrophic if we try to drain an empty or unboiled chocolateBoiler

### Running the code

```
cd src/
javac ChocolateFactory.java


```