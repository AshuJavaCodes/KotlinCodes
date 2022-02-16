fun main() {
    //THe condiitonal statement in kotlin are same as that of written
    // in java
    var AmIaAndroidDeveloper = true
    if(AmIaAndroidDeveloper){
        println("Yes i am an Android Developer.")
    }else{
        println("No i am Not")

    }

    var x =2
    //The Switch Statements in Kotlin
    when(x){
        in 1..2->println("X is Between 1 and 2.")
        in 2..3-> println("X is Between 2 and 3.")

    }




}