object Q_4_a{

    def sallary (workHours : Double )
        :Double = workHours*250
    def ot (otHours : Double )
        :Double = otHours*85
    def totalsallary (workHours : Double , otHours : Double)
        :Double = sallary(workHours)+ot(otHours)
    def tax (workHours : Double , otHours : Double)
        :Double = totalsallary(workHours,otHours)*0.12
    def netSallary(workHours : Double , otHours : Double)
        :Double = totalsallary(workHours,otHours) - tax(workHours,otHours)

    def main(args:Array[String])={
        print("Enter the total work hours : ")
        var work = scala.io.StdIn.readFloat()
        print("Enter the total ot hours : ")
        var ot = scala.io.StdIn.readFloat()
        println("Your net sallary is Rs."+netSallary(work,ot))
    }
}