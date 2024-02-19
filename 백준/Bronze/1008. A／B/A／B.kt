import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B = scanner.nextInt()
    val result = A.toDouble() / B.toDouble()
    println("%.9f".format(result))
}
