package net.suntrans.appmanager.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.suntrans.appmanager.BasedActivity
import net.suntrans.appmanager.R

class MainActivity : BasedActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
