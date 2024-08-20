// pattern matching

object find_number extends App {

    val isEven = (num: Int) => num % 2 == 0
    val matchNumber = (num: Int) => num match {
        case x if x <= 0 => "Zero/ Negative"
        case x if isEven(x) => "Even"
        case x if !isEven(x) => "Odd"
    }
    val printMessage = (num: Int) => println(matchNumber(num) + " number ")

    print("Enter a number: ")
    var inputNum = scala.io.StdIn.readInt()

    printMessage(inputNum)
}