import scala.math._

case class Point(a:Double, b:Double){

    def x = a
    def y = b

    //add two given points
    def + (p :Point) = Point (this.x + p.x, this.y + p.y) 

    //move a point by a given distance
    def move (dx:Double , dy:Double) = Point(this.x+dx , this.y+dy) 

    //distance between two given points
    def distance(p:Point) =  sqrt( pow(p.x-this.x, 2) + pow(p.y-this.y, 2) )

    //switch the x and y coordinates
    def invert() = Point(this.y, this.x)

    override def toString(): String =  "("+x+","+y+")"

}

object question1 extends App{

    val p1 = new Point(0,0)
    val p2 = new Point(3,4)

    val p3 = p2.move(2,2)
    val p4 = p2.distance(p1)
    val p5 = p2.invert()

    println("p1 + p2 : "+(p1 + p2))
    println("p2 (3,4) move by (2,2) : "+p3)
    println("Disstance of p1 : "+p4)
    println("Invert of p2 : "+p5)

}