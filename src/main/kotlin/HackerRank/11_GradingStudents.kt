package HackerRank

fun main() {
    val grades = arrayOf(73, 67, 38, 33)
    grades.forEach {
        println(it)
    }
    val result = gradingStudents(grades)
    result.forEach {
        println(it)
    }
}

/*
fun gradingStudents(grades: Array<Int>): Array<Int> {
    val arr: ArrayList<Int> = arrayListOf()
    for (grade in grades){
        if (grade >= 38){
            if (grade % 5 > 2)
                arr.add(((grade / 5) + 1) * 5)
            else
                arr.add(grade)
        } else{
            arr.add(grade)
        }
    }

    return arr.toTypedArray()
}
 */

fun gradingStudents(grades: Array<Int>): Array<Int> = grades.map {
    when {
        it < 38 -> it
        it % 5 > 2 -> ((it / 5) + 1) * 5
        else -> it
    }
}.toTypedArray()