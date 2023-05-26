package virtual.camera.app.view.apps

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import virtual.camera.app.data.AppsRepository

/**
 *
 * @Description:
 * @Author: tangqiang
 * @CreateDate: 2023/5/26 19:26
 */
@Suppress("UNCHECKED_CAST")
class AppsFactory(private val appsRepository: AppsRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return AppsViewModel(appsRepository) as T
    }
}