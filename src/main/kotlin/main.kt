import java.time.LocalDateTime

fun log(msg: String) = println("[${LocalDateTime.now()} ${Thread.currentThread().name}] $msg") // -Dkotlinx.coroutines.debug

suspend fun main(args: Array<String>) {
    repeat(10) {
            log("main")
            mainPrinter("Hay")
    }
}

fun mainPrinter(str: String) {
    log("mainPrinter")
    firstPrinter(str)
    secondPrinter(str)
}

fun firstPrinter(str: String) {
    log("firstPrinter")
    printer(": $str")
}

fun secondPrinter(str: String) {
    log("secondPrinter")
    printer(str)
}

fun printer(value: String) {
    log("printer: $value")
}