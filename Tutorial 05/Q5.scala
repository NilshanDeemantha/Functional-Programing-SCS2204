object evenSum extends App{
    def isEven (n:Int):Boolean = n match{
        case 0 => true
        case _ => isOdd(n-1)
    }
    def isOdd (n:Int):Boolean= !(isEven(n))

    def evenSum(num:Int):Int = num match {
        case x if x<=0 => 0
        case x if isEven(x) => x + evenSum(x-1)
        case _ => evenSum(num-1)
    }

    print(evenSum(5))
}