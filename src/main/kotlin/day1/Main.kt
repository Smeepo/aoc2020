package day1

import java.nio.file.Files
import java.nio.file.Path
import java.util.stream.Collectors

fun main(){
    val input: List<Int> = Files.lines(Path.of("/Users/patricklass/IdeaProjects/aoc2020/src/main/kotlin/day1/input")).map { it.toInt() }.collect(Collectors.toList())

    input.forEachIndexed() { index1, n1 ->
        input.forEachIndexed { index2, n2 ->
            input.forEachIndexed { index3, n3 ->
                if (index1 != index2 && index1 != index3 && index2 != index3)
                    if (n1 + n2 + n3 == 2020) println(n1 * n2 * n3)
            }
        }
    }

}