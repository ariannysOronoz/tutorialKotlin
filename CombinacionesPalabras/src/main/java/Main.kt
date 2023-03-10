package com.includehelp.basic

import java.util.*
   /* fun main(args: Array<String>) {

        val num = 10
        var i = 1
        var factorial: Long = 1
        while (i <= num) {
            factorial *= i.toLong()
            i++
        }
        println(" El Factorial de $num = $factorial")
    }*/
// Kotlin program for
// Print all permutations of a string
class Permutation
{
    // Swapping two string elements by index
    fun swap(
        info: String,
        size: Int,
        a: Int,
        b: Int
    ): String
    {
        var text = info;
        // Check valid location of swap element
        if ((a >= 0 && a < size) && (b >= 0 && b < size))
        {
            // Get first character
            val first: Char = text.get(a);
            // Get second character
            val second: Char = text.get(b);
            // Put character
            text = text.substring(0, b) + first.toString() +
                    text.substring(b + 1);
            text = text.substring(0, a) + second.toString() +
                    text.substring(a + 1);
        }
        return text;
    }

    // Method which is print all permutations of given string
    fun findPermutation(info: String, n: Int, size: Int): Unit
    {
        if (n > size)
        {
            return;
        }
        if (n == size)
        {
            println(info);
            return;
        }
        var text = info;
        var i: Int = n;
        while (i < size)
        {
            // Swap the element
            text = this.swap(text, size, i, n);
            this.findPermutation(text, n + 1, size);
            // Swap the element
            text = this.swap(text, size, i, n);
            i += 1;
        }
    }
}
fun main(args: Array < String > ): Unit
{
    val task: Permutation = Permutation();
    var text: String = "CARACOL";
    var size: Int = text.length;
    task.findPermutation(text, 0, size);
    println("");
    text = "caracol";
    size = text.length;
    task.findPermutation(text, 0, size);
}
