object CeasarCipher extends App{

        print("Enter the shift number (Between 0 and 25) : ")
        val shiftNum = scala.io.StdIn.readInt()

        print("Enter your messsage : ")
        val msg = scala.io.StdIn.readLine()
        val txt = msg

        println("Enter 1 to encrypt the Message")
        println("Enter 2 to decrypt the Message")
        print("Enter the number : ")
        val num = scala.io.StdIn.readInt()

        val encryption = (ch: Char,num : Int) => ch match{
            case x if (x.isLetter && x.isUpper && (x+num)>90) == true => (x+num-26).toChar
            case x if (x.isLetter && x.isUpper ) == true => (x+num).toChar
            case x if (x.isLetter && x.isLower && (x+num)>122) == true => (x+num-26).toChar
            case x if (x.isLetter && x.isLower ) == true => (x+num).toChar
            case _ => ch
        }
        
        val decryption = (ch: Char,num : Int) => ch match{
            case x if (x.isLetter && x.isUpper && (x-num)<65) == true => (x-num+26).toChar
            case x if (x.isLetter && x.isUpper ) == true => (x-num).toChar
            case x if (x.isLetter && x.isLower && (x-num)<97) == true => (x-num+26).toChar
            case x if (x.isLetter && x.isLower ) == true => (x-num).toChar
            case _ => ch
        }
        
        val chiper = (function:( Char,Int )=>Char, msg:String,sn:Int) => msg.map(function(_,sn))        

        if(num == 1) 
            println("Encrypted message: "+ chiper(encryption,txt,shiftNum))	

        else 
            println("Decrypted message: "+ chiper(decryption,txt,shiftNum))

}