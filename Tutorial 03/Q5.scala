object Q5 extends App{

    def easy (distance:Float):Float=distance/8

    def tempo (distance:Float):Float=distance/7

    def total (d1:Float,d2:Float):Float= easy(d1)+tempo(d2)

    print("Enter the distance going by easy pace : ")
    val d1:Float = scala.io.StdIn.readFloat()

     print("Enter the distance going by tempo pace : ")
    val d2:Float = scala.io.StdIn.readFloat()

    print("Total runing timne : "+total(d1,d2)+" hours")

}