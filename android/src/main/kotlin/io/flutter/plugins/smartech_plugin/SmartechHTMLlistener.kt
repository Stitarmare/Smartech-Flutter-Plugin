package io.flutter.plugins.smartech_plugin
import com.netcore.android.inapp.InAppCustomHTMLListener


class SmartechHTMLlistener : InAppCustomHTMLListener {
    var smartechHTMLlistenerCallBack : ((payload: HashMap<String, Any>?)->Unit)? = null
    override fun customHTMLCallback(payload: HashMap<String, Any>?) {
        smartechHTMLlistenerCallBack?.invoke(payload)
    }
}