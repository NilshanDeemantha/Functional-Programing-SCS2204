object evenOdd extends App{
    def isEven (n:Int):Boolean = n match{
        case 0 => true
        case 1 => false
        case _ => isEven(n-2)
    }
    def isOdd (n:Int):Boolean= n match{
        case 1 => true
        case 0 => false
        case _ => isOdd(n-2)
    }

    print(isEven(10))
}