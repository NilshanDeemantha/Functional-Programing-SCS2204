import scala.compiletime.ops.int
object Q1 extends App {

    def interest(amnt:Double):Double = amnt match{
        case x if x>2000000 => x*0.065
        case x if x>200000 => x*0.035
        case x if x>20000 => x*0.04
        case _ => amt*0.02
    }
    print("Enter the amounnt : ")
    var amount:Double = scala.io.StdIn.readDouble()

    printf("Interest amount : Rs.%.2f",interest(amount))

}