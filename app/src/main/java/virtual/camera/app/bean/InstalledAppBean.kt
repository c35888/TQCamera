package virtual.camera.app.bean

import android.graphics.drawable.Drawable

/**
 *
 * @Description:
 * @Author: tangqiang
 * @CreateDate: 2023/5/26 19:24
 */
data class InstalledAppBean(val name:String, val icon: Drawable, val packageName:String, val sourceDir:String, val isInstall:Boolean)
