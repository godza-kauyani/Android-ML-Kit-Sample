package io.husaynhakeem.mlkit_sample


import android.app.Application
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics; 
import com.microsoft.appcenter.crashes.Crashes;


class MLKitApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        AppCenter.start(getApplication(), "bb251a9e-8fd5-452e-8cb2-91787ba0f4a2", Analytics.class, Crashes.class);
    }

    companion object {
        lateinit var instance : MLKitApplication
    }
}
