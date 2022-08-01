object Q3 extends App{

    def toUpper(txt:String):String={
        return (txt.toUpperCase())
    }

    def toLower (txt:String):String={
        return(txt.toLowerCase())
    }

    def formatNames(fun:String=>String ,x:String): Unit ={
      val Str=fun(x)
      print(Str)
    }

    formatNames(toUpper,"Benny ")
    println()
    formatNames(toUpper,"Niroshan ".slice(0,2))
    formatNames(toLower,"Niroshan ".slice(2,8))
    println()
    formatNames(toLower,"Saman ".slice(0,6))
    println()
    formatNames(toUpper,"Kumara ".slice(0,1))
    formatNames(toLower,"Kumara ".slice(1,5))
    formatNames(toUpper,"Kumara ".slice(5,6))
}