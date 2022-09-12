object Queation03 extends App{
    
    class bankAccount(depamount: Float){
        
        var balance = depamount

        def deposit (amount: Float) = this.balance = this.balance + amount

        def withdraw (amount: Float) = this.balance = this.balance - amount
        
        def transfer (acc : bankAccount , amount : Float) = {
            this.withdraw(amount)
            acc.deposit(amount)
        }

    }

    val acc1 = new bankAccount(5000)
    val acc2 = new bankAccount(3500)
    printf("Before transfering account 1 balance : %.2f\n",acc1.balance)
    printf("Before transfering account 2 balance : %.2f\n\n",acc2.balance)
    // Transfer 1000 from acc1 to acc2
    acc1.transfer(acc2,1000)
    printf("After transfering account 1 balance : %.2f\n",acc1.balance)
    printf("Aftere transfering account 2 balance : %.2f\n\n",acc2.balance)
}