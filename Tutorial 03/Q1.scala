object Q1 extends App{
    def Area (r:Double):Double = math.Pi*r*r

    print("Enter value of r : ")
    val r:Double = scala.io.StdIn.readDouble()

    print("Are of the disk : "+Area(r))
}