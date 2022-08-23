object fibSerius extends App{

    def fib(num:Int):Int = num match {
        case x if x== 0 => 0
        case x if x==1 => 1
        case x => fib(x-1) + fib(x-2)
    }

    def fibSerius (n:Int):Unit={
        if(n>0) fibSerius(n-1)
        print(fib(n)+" ")
    }

    fibSerius(5)
}