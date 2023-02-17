fun main(){
val list = listOf(1 , 2, 3, 4, 5)
val (even, odd) = list.partition { it % 2 == 0}

println("$even")
println("$odd")
}
