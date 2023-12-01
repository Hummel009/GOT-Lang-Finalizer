package hummel

import java.io.File

fun main(args: Array<String>) {
	require(args.size >= 2) {
		"Usage: java -jar ThisApp.jar langUnfinalized.lang langFinalized.lang"
	}

	val firstFile = File(args[0])
	val secondFile = File(args[1])

	val firstFileMap = firstFile.readLines().associate { extractKeyValue(it) }
	val secondFileMap = secondFile.readLines().associate { extractKeyValue(it) }

	val outputMap = mutableMapOf<String, String>()

	for (key in firstFileMap.keys.union(secondFileMap.keys)) {
		val value = if (firstFileMap[key].isNullOrEmpty() && !secondFileMap[key].isNullOrEmpty()) {
			secondFileMap[key]
		} else {
			firstFileMap[key]
		}
		outputMap[key] = value ?: ""
	}

	val outputLines = outputMap.entries.joinToString("\n") { "${it.key}=${it.value}" }
	firstFile.writeText(outputLines)
}

fun extractKeyValue(line: String): Pair<String, String> {
	val firstEqualsIndex = line.indexOf('=')
	return if (firstEqualsIndex >= 0) {
		line.take(firstEqualsIndex) to line.substring(firstEqualsIndex + 1)
	} else {
		val splitLine = line.split("≠")
		splitLine[0] to splitLine.getOrNull(1).orEmpty()
	}
}