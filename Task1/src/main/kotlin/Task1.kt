fun main() {
    for(i in 0..100){
        if (i%3 == 0){
            println("$i Piff")
        } else if (i % 5 ==0) {
            println("$i Paff")
        }
    }

    var i = 0
    while (i != 101) {
        when {
            i % 3 == 0 -> {
                println("$i Piff")
            }
            i % 5 == 0 -> {
                println("$i Paff")
            }
        }
        i++
    }

}