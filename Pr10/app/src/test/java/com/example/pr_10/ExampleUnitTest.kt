package com.example.pr_10

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(Math().MakeSolution(5.0, 8.0), "1.6 = -5 / 8")
    }
    @Test
    fun addition_isCorrect1() {
        assertEquals(Math().MakeSolution(5.013, 43.0), "Many")
    }
    @Test
    fun addition_isCorrect2() {
        assertEquals(Math().MakeSolution(0.0, 43.0), "Множество значений")
    }
}