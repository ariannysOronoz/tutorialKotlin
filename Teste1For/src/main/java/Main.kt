val syllables       = mutableListOf<String>()
val vocals          = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
val rlh             = setOf('r', 'l', 'h', 'R', 'L', 'H')
val numSyllables    = 0
var editableWord    = word
var pendingSyllable = ""

if (word[0] in vocals){
    pendingSyllable = word[0].toString()
    word = word.drop(1)
    println(syllables)
}

var i = 0
do {
    if (word[i] in vocals){
        if (word[i-1] in rlh && i-1 != 2){
            syllables += pendingSyllable + word.substring(0, i-2)
            word = word.drop(i-2)
            i = 3
        } else {
            syllables += pendingSyllable + word.substring(0, i-1)
            word = word.drop(i-1)
            i = 2
        }
        pendingSyllable = ""
    }
    i++
} while (word.length >= i)

syllables += word
println("Estas son mis silabas $syllables")

return syllables