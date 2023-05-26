package virtual.camera.app.data

import androidx.lifecycle.MutableLiveData
import virtual.camera.app.bean.XpModuleInfo

/**
 *
 * @Description:
 * @Author: tangqiang
 * @CreateDate: 2023/5/26 19:24
 */
class XpRepository {
    fun getInstallModules(modulesLiveData: MutableLiveData<List<XpModuleInfo>>) {
    }

    fun installModule(source: String, resultLiveData: MutableLiveData<String>) {

    }

    fun unInstallModule(packageName: String, resultLiveData: MutableLiveData<String>) {

    }
}