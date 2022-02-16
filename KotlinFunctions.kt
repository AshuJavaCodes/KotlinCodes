fun main() {

}

//Funtions are defined outside the main function in kotlin.
fun printTwoNumber(){
    println("2,3")
}
//Funtion with Parameter
fun addTheseTwoNumber(numberone:Int, numberTwo:Int){
    println(numberone+numberTwo)
}
//Function with parameter and return type
fun isEvenNumber(numberOne:Int):Boolean{
    if(numberOne%2==0){
        return true
    }
    return false
}
//Function with default parameter and return type
fun isEqualNumber(numberOne: Int =0, numberTwo: Int=1):Boolean{
    if(numberOne==numberTwo){
        return true
    }
    return false

}




