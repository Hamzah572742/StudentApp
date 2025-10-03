class Student (idIn:String,nameIn:String,courseIn:String,markIn:Double) {

    val id: String
    val name: String
    val course: String

    var mark: Double = markIn
        set(newmark) {
            if (newmark in 0.0..100.00){
                field = newmark

            }
        }



    init {
        id= idIn
        name= nameIn
        course= courseIn
        mark= markIn
    }


    fun getgrade() {
        val grade=when(mark){
            in 70.0..100.0->"First"
            in 60.0..69.0->"2/1"
            in 50.0..59.0->"2/2"
            in 40.0..49.0->"Third"
            else ->"Fail"
        }
        println(grade)
    }

    override fun toString(): String {
        return "id=$id,name=$name,course=$course,mark=$mark)"
    }
}
