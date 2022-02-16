fun main() {
    // Basically the variable in general are of two ttypes
    // nullable and non- nullable (by this is true)
    //Defining a null variable in kotlin
    var a:Int? // this tells kotlin that a can null;

    var x :String?=null

    //If the variable gets null value from a function then we
    //can set the default value of the variable.
    //for example

    var y = readLine() ?:"0"
  //The above line tells kotlin to set the default value of y to be 0
    // if the y tends to be null
    var ab = readLine() ?:"0"

    //Now this expression can never be null
    println(y+ab)

    //If we are sure that some value cannot be Null
    //we usse the operator !!
    var result = y!!.toInt()+ab!!.toInt()
//If the Above expression is null then only our app will crash
//Its like telling kotlin to throw null pointer if above exp is null.


}