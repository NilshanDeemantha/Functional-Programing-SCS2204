object Q2 extends App{

    def checkNum(num:Int):Int = num match {
        case x if x <= 0 => -1
        case x if x%2 == 0 => 1
        case _ => 0
    }
    
    print("Enter a number : ")
    var number = scala.io.StdIn.readInt()

    var returnVal = checkNum(number)

    returnVal match{
        case x if x == -1 => println("The given number is Neagtive or Zero")
        case x if x == 1 =>  println("The given number is Even")
        case x if x == 0 =>  println("The given number is Odd")
    }

}