package com.serrodcal.poc

object Main extends App {

  trait Vehicle[A] {
   def weight(a: A): Int
  }

  case class Car(passengers: Int)
  case class Truck(passengers: Int, load: Int)

  implicit object CarVehicle extends Vehicle[Car] {
   override def weight(car: Car): Int = car.passengers * 75
  }

  implicit object TruckVehicle extends Vehicle[Truck] {
   override def weight(truck: Truck): Int = (truck.passengers * 75) + truck.load
  }

  def weightOf[A](vehicle: A)(implicit vehicleImpl: Vehicle[A]): Int = vehicleImpl.weight(vehicle)

  val weightOfCar = weightOf(Car(5))
  val weightOfTruck = weightOf(Truck(1,5000))

  println(weightOfCar)
  println(weightOfTruck)

}
