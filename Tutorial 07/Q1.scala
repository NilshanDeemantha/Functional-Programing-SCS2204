object Queation01 extends App{

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

        def neg = new Rational(-this.numerator,this.denomator)

        override def toString(): String = numerator + "/" + denomator
    }

    val x = new Rational(3,4)
   
    println("x \t="+x)
    println("-x \t="+x.neg)

}