object PrimeSeq extends App{
    
    def prime(p:Int , n:Int=2):Boolean = n match {
        case x if x>p => false
        case x if x==p => true
        case x if p%x==0 =>false
        case x => prime(p,x+1)
    }

    def primeSeq (num:Int) :Unit={
        if (num>2)  
            primeSeq(num-1)
        if (prime(num)== true) 
            print(num+" ")
    }

    primeSeq(10)
}