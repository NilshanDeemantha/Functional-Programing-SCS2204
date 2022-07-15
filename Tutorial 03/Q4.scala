object Q4 extends App{

    def totalCoverPrice(n: Int):Double = 24.95 * n;

    def discout(n:Int):Double= totalCoverPrice(n)*0.4

    def shippingCost(n:Int):Double= n match{
        case x if x<=50 => x*3
        case _ => (50*3)+(n-50)*0.75
    }

    def totalCost(n:Int):Double={
        totalCoverPrice(n) - discout(n) + shippingCost(n);
    }

    print("Enter number of copies : ")
    val r:Int = scala.io.StdIn.readInt()

    print("Total wholesale cost for "+r+" copies is Rs. "+totalCost(r));
 
}