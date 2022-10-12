package com.taimoor.imagepicker.listener

internal interface ResultListener<T> {

    fun onResult(t: T?)
}
