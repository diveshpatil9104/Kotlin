
fun main(){
    
    println("My name is Divesh Devendra Patil ")
    println(43)
    var a : Int = 32;   // Immediate assignment
    println(a)
    
    var b = 43     // `Int` type is inferred (conclude)
    println(b)

    var d : Int         // Type required when no initializer is provided
    d = 44
    println(d)

    var str = "my another name is raj patil"    // `String` type is inferred (conclude) 
    println(str) 

    var ans : Int 
    ans = a + b

    println("a = $a , \nb = $b , \nd = $d , \na + b = $ans \nname = $str , \nAns = $a+$b+$d = " + (a+b+d)) // We can also print variable using ($)


}

