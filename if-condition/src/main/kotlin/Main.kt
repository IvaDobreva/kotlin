fun main(args: Array<String>) {
    // one liner if
    // multiple lines
    // if else block conditions

    val a = 10
    val b = 20
    var max: Int = 0

    println("One liner if")
    println("max = " + max)

    if (a > b ) max = a
    println("result max = " + max)

    // Multiple line if
    if(a>b) {
        max = a
    }

    // If-Else
    if(a>b) {
        println("a>b")
        max = a
    } else {
        println("a<b")
        max = b
    }

    println("Final Result: max = " + max)

}