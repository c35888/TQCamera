package virtual.camera.app.view.list

import androidx.lifecycle.MutableLiveData
import virtual.camera.app.bean.InstalledAppBean
import virtual.camera.app.data.AppsRepository
import virtual.camera.app.view.base.BaseViewModel

/**
 *
 * @Description:
 * @Author: tangqiang
 * @CreateDate: 2023/5/26 19:24
 */
class ListViewModel(private val repo: AppsRepository) : BaseViewModel() {

    val appsLiveData = MutableLiveData<List<InstalledAppBean>>()

    val loadingLiveData = MutableLiveData<Boolean>()

    fun previewInstalledList() {
        launchOnUI{
            repo.previewInstallList()
        }
    }

    fun getInstallAppList(userID:Int){
        launchOnUI {
            repo.getInstalledAppList(userID,loadingLiveData,appsLiveData)
        }
    }

    fun getInstalledModules() {
        launchOnUI {
            repo.getInstalledModuleList(loadingLiveData, appsLiveData)
        }
    }

}