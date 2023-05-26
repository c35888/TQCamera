package virtual.camera.app.bean

import android.graphics.drawable.Drawable

/**
 *
 * @Description:
 * @Author: tangqiang
 * @CreateDate: 2023/5/26 19:24
 */
data class XpModuleInfo(
        val name: String,
        val desc: String,
        val packageName: String,
        val version: String,
        var enable:Boolean,
        val icon: Drawable
)
