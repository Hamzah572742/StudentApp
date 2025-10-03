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

    override fun toString(): String {
        return "id=$id,name=$name,course=$course,mark=$mark)"
    }
}
