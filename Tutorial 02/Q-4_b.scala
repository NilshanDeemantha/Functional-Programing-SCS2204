object Q_4_b{

    def atteandance (ticketPrice : Int )
        :Int= (180-(ticketPrice*4))
    def income (ticketPrice : Int)
        :Int = ticketPrice*atteandance(ticketPrice)
    def cost (ticketPrice : Int)
        :Int = (atteandance(ticketPrice)*3)+500
    def profit (ticketPrice : Int)
        :Int = income(ticketPrice)-cost(ticketPrice)

    def main(args:Array[String])={
        print("Enter the price of a ticket : ")
        var price = scala.io.StdIn.readInt()
        var att = atteandance(price)
        if(att<=0)
            println("Any customers will not come under Rs."+price+" tickets")
        else
            println("Your profit is Rs."+profit(price)+" for Rs."+price+" tickets.")    
    }
}