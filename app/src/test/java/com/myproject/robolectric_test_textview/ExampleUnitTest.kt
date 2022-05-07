package com.myproject.robolectric_test_textview


import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {

    @Test
    fun check_second_activity_text() {
        val activity = Robolectric.buildActivity(SecondActivity::class.java).create().get()
        val textView : TextView = activity.findViewById<TextView>(R.id.textViewActivity)
        assertEquals("Hello World!!", textView.text)
    }

    @Test
    fun check_first_fragment_text(){
        val fragment = FirstFragment()
        val activity = Robolectric.buildActivity(
            MainActivity::class.java
        )
            .create()
            .start()
            .resume()
            .get()
        val fragmentManager: FragmentManager = activity.supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(fragment, null)
        fragmentTransaction.commit()
        val textView : TextView = activity.findViewById<TextView>(R.id.textViewFragment)
        assertEquals("Hello world!!", textView.text)
    }



}