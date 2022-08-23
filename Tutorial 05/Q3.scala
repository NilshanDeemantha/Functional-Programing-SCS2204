object Sum extends App{

    def sum(num:Int):Int = num match{
        case x if x <=0 => 0
        case _ => num+ sum(num-1)
    }

    print(sum(10))
}