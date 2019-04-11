# typeClassesPoC

This repository consists of a proof of concept about Type Classes for learning and 
understanding. Also, it includes an explanation below

## What are the Type Classes?

At first, we need to understand what is Polymorphism. Polymorphism is an useful feature 
in high level languages. It allows us to create interfaces, operate with abstraction and 
deal with implementation based on types.

Most OOP languages uses inheritance to achive polymorphism. But, there is another way to achive 
polymorphism: **type classes**.

**TL;DR**: OOP puts data and function in the one place (classes). Type classes approach is different,
entities are data, and they are declouped from entities responsible for implementation.

_Ok, but show me the code..._

Let's try to understand type classes step by step, from an OOP polymorphism example to type classes.

### Inheritance fashion

We have a notion of a vehicle that has some weight and multiple implementations.

```scala
// Our generic inteface
trait Vehicle {
  def weight: Int
}

// Implementations
class Car(passengers: Int) extends Vehicle {
  override def weight: Int = passengers * 75
}

class Truck(passengers: Int, load: Int) extends Vehicle {
  override def weight: Int = (passengers * 75) + length
}

// Generic function
def weightOf(vehicle: Vehicle): Int = shape.weight

// Usage
areaOf(new Car(5))
areaOf(new Truck(1, 5000))
```

Our generic function works on vehicles because we pass it the implementation excplicitly.

### Type class fashion

_Under construction_

## Code

### Building

_Under construction_

### Running

_Under construction_
