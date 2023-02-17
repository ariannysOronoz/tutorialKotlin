package estructuraControl

import kotlin.system.measureNanoTime

fun main() {


    val forInRange = measureNanoTime {
        for (i in 0..1000) {
            i
        }
    }

    val forEachRange = measureNanoTime {
        (0..1000).forEach { it }
    }

    println("forInRange: $forInRange")
    println("forEachRange: $forEachRange")


    val objectList = (0..1000).toList()

    val forInList = measureNanoTime {
        for (i in objectList) {
            i
        }
    }

    val forEachList = measureNanoTime {
        objectList.forEach { it }
    }

    println("forInList: $forInList")
    println("forEachList: $forEachList")


}