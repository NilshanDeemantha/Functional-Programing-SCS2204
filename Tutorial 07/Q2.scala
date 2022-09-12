object Question02 extends App{
    class Rational (a: Int, b: Int){

        def numerator = {
            if((a>0 && b<0)|| (a<0 && b<0)) -a
            else a
        }
        def denomator = {
            if(b<0) -b
            else b
        }

        def gcd (a:Int , b:Int): Int = b match{
            case x if x==0 => a
            case _ => gcd(b,a%b)
        }

        def sub (a: Rational) ={
            val y = (this.denomator * a.denomator) / gcd(this.denomator,a.denomator)
            val x = (this.numerator * y / this.denomator) - (a.numerator * y / a.denomator)
            new Rational(x,y)
        }

        override def toString(): String = numerator + "/" + denomator
    }

    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
    println("x \t="+x)
    println("x-y-z \t="+x.sub(y).sub(z))

}