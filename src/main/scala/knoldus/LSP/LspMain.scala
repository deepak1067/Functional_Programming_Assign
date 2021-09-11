package knoldus.LSP

object LspMain extends App{
  val rectangleArea = (length: Int, width: Int) => length * width
  println(rectangleArea(10, 20))

  val squareArea = (length: Int, width: Int) => length * width
  println(squareArea(10, 10))

  val rectangle = Rectangle(10, 20)
  println(rectangle.calculateArea(rectangle))

}
