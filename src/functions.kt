fun main(){
    //Standard-Library Functions/Predifined
    var output = Math.sqrt(144.0)
    println("The squareroot of 144 is $output")

    var number = Math.round(45.89)
    println(number)
    school()//calling a function
    add()//Calling a function
    student("john","male",34)
    student("Ann","female",97)

    employee("Mary",3500,false)
    employee("Ann",345566,true)
}
//User defined Functions
fun school(){
    println("eMobilis")
}
fun add(){
    var x= 3
    var y =5
    println(x + y)

}
//Parameters/Variables and Arguments/Values
fun student(name:String,gender:String,age:Int ){
    println("$name is a $gender.$name is $age years old")

}
fun employee(name:String,salary:Int,disability:Boolean){
    println("$name is earning $salary.Has disability: $disability")
}