package virtual.camera.app.util

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import virtual.camera.app.app.App

/**
 *
 * @Description:
 * @Author: tangqiang
 * @CreateDate: 2023/5/26 19:24
 */
var toastImpl:Toast? = null

fun Context.toast(msg:String){
    toastImpl?.cancel()
    toastImpl = Toast.makeText(this,msg,Toast.LENGTH_SHORT)
    toastImpl?.show()
}

fun toast(msg: String){
    App.getContext().toast(msg)
}

fun toast(@StringRes msgID:Int){
    toast(getString(msgID))
}