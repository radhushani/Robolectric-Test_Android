package com.myproject.robolectric_test_textview


import android.widget.TextView
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {

    @Test
    fun check_main_activity_text() {
        val activity = Robolectric.buildActivity(SecondActivity::class.java).create().get()
        val textView : TextView = activity.findViewById<TextView>(R.id.textViewActivity)
        assertEquals("Hello World!!", textView.text)
    }


}