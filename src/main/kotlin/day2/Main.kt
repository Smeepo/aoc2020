package day2

import java.nio.file.Files
import java.nio.file.Path
import java.util.stream.Collectors


fun main() {
    val input: List<Pair<Policy, String>> =
        Files.lines(Path.of("/Users/patricklass/IdeaProjects/aoc2020/src/main/kotlin/day2/input")).map {
            val parts = it.split(" ");
            val rangeParts = parts[0].split("-").map { it.toInt() }
            val range = rangeParts[0]..rangeParts[1]
            val character = parts[1].replace(":", "")[0]
            Pair(Policy(character, range), parts[2])
        }.collect(Collectors.toList())

    print(input.filter { it.first.checkMatch(it.second) }.count())
}
