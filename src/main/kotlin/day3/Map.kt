package day3

class Map(val pattern: List<String>) {
    val width by lazy { pattern[0].length }
    val height by lazy { pattern.size }
    fun get(x: Int, y: Int): Char {
        return pattern[y][x % width]
    }
}