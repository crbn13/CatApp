package org.example

import org.example.Student

class Undergraduate(id: String, name: String, course: String, markIn: Double) :
    Student(id, name, course, markIn) {

    override public fun getGrade(): String {
        return when (mark) {
            in 70.0..100.0 -> "First"
            in 60.0..70.0 -> "2/1"
            in 50.0..60.0 -> "2/2"
            in 40.0..50.0 -> "Third"
            in 0.0..40.0 -> "Fail"
            else -> "🤨"
        }
    }
}
