package org.example

import org.example.Student

class Masters(id: String, name: String, course: String, markIn: Double) : Student(id, name, course, markIn) {

    override public fun getGrade(): String {
        return when (mark) {
            in 70.0..100.0 -> "Distinction"
            in 60.0..70.0 -> "Merit"
            in 40.0..60.0 -> "Pass"
            in 0.0..40.0 -> "Fail"
            else -> "🤨"
        }
    }
}
