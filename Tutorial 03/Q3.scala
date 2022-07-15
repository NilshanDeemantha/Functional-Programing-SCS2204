object Q3 extends App{
    def Area (r:Double):Double = math.Pi*r*r*r

    print("Enter value of r : ")
    val r:Double = scala.io.StdIn.readDouble()

    print("Volume of the sphere : "+Area(r))
}