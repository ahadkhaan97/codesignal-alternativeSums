fun main() {
    println(solution(mutableListOf(50, 60, 60, 45, 70)))
}

fun solution(a: MutableList<Int>): MutableList<Int> {
    var sumLeft = 0
    var sumRight = 0
    for (i in 0 until a.size)
        if (i % 2 == 0)
            sumLeft += a[i]
        else
            sumRight += a[i]

    return mutableListOf(sumLeft, sumRight)
}