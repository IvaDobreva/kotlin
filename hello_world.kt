fun main() {
    val hello: String = "Hello, Value!"
    var a: Int = 1

    println(hello)
    println("a = " + a)

    a = a*10
    println("a*10="+a)

    var result = multiplyByTwo(a)
    println(result)

    println(helloWorld())
}

fun multiplyByTwo(number: Int): Int {
    return number*2
}

fun helloWorld(): String {
    return "Hello, Kotlin!"
}