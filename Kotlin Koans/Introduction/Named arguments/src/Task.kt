fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[",
        separator = ", ", postfix = "]")

/*
fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    // named arguments
    bar(1, b = false)
}

fun task2(collection: Collection<Int>) =
        collection.joinToString(prefix = "{", postfix = "}")*/
