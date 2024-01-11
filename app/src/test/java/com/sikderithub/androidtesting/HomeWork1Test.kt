package com.sikderithub.androidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class HomeWork1Test{

    @Test
    fun fib0Returns0(){
        val result = HomeWork1.fib(0)

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun fib1Returns1(){
        val result = HomeWork1.fib(1)

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun fib9Returns34(){
        val result = HomeWork1.fib(9)

        assertThat(result).isEqualTo(34)
    }

    @Test
    fun fib10Returns55(){
        val result = HomeWork1.fib(10)

        assertThat(result).isEqualTo(55)
    }

    @Test
    fun invalidBracesReturnsFalse(){
        val result = HomeWork1.checkBraces("(a * b))")

        assertThat(result).isFalse()
    }

    @Test
    fun invalidBracesReturnsFalse2(){
        val result = HomeWork1.checkBraces("((a * b)")

        assertThat(result).isFalse()
    }

    @Test
    fun invalidBracesReturnsFalse3(){
        val result = HomeWork1.checkBraces(")(")

        assertThat(result).isFalse()
    }

    @Test
    fun validBracesReturnsTrue(){
        val result = HomeWork1.checkBraces("((a * b))")

        assertThat(result).isTrue()
    }

}