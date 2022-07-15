object Q2 extends App{

    def celsiusConvertToFeranhite (c:Double):Double=(c*1.8000)+32.0000

    print("Enter Tempreture in celsius degree : ")
    val C:Double = scala.io.StdIn.readDouble()
    
    print(C+" Celsius degree = "+celsiusConvertToFeranhite(C)+" Feranhite degree")
}