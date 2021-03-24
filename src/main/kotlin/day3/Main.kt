package day3

import java.nio.file.Files
import java.nio.file.Path

fun main() {
    val map = Map(Files.readAllLines(Path.of("/Users/patricklass/IdeaProjects/aoc2020/src/main/kotlin/day3/input")))
    val counts = mutableListOf<Int>()
    val xDifs = listOf(1, 3, 5, 7, 1)
    val yDifs = listOf(1, 1, 1, 1, 2)
    for ((index, xDif) in xDifs.withIndex()) {
        var count = 0
        var x = xDif
        var y = yDifs[index]
        while (y < map.height) {
            if (map.get(x, y) == '#') count++
            x += xDif
            y += yDifs[index]
        }
        println(count)
        counts.add(count)
    }
    var product = 1L
    counts.forEach { product *= it }
    println(product)
}