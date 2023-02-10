class Main {
    var x = 5

    companion object {
        @kotlin.jvm.JvmStatic
        fun main(args: Array<String>) {
            val myObj1 = Main() // Object 1
            val myObj2 = Main() // Object 2
            println(myObj1.x)
            println(myObj2.x)
        }
    }
}

