object Q_1_2_3 {

    def main(args:Array[String])={
        var k = 2
        var i = 2
        var j = 2
        var m = 5
        var n = 5
        var f = 12.0f
        var g = 4.0f
        var c ='X'

        println("a) k+12*m = "+(k+12*m))
        println("b) m/j = "+(m/j))
        println("c) n%j = "+(n%j))
        println("d) m/j*j = "+(m/j*j))
        println("e) f+10*5+g = "+( f+10*5+g))
        //println("f) ++i*n = "+(++i*n))
        //Prefix increament operator is not working in Scala 
        println("\n")

        val a:Int = 2
        val b:Int = 3
        val c1:Int = 4
        val d:Int = 5
        val k1:Float = 4.3f

        /*println("a) --b * a + c *d-- = "+(--b * a + c *d--))
          Prefix decreament and postfix decreament operator are not working in Scala */

        /*println("b) a++ = "+(a++))
          Postfix increament operator is not working in Scala */

        println("c) -2 * ( g - k ) +c = "+(-2*(g-k)+c))

        /*println("d) c=c++ = "+(c=c++))
          Postfix increament operator is not working in Scala */

        /*println("e) c=++c*a++ = "+(c=++c*a++))
          Postfix increament prefix increament operator is not working in Scala */
    }
}