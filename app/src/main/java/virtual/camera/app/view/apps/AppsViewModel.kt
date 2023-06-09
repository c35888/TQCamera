package virtual.camera.app.view.apps

import androidx.lifecycle.MutableLiveData
import virtual.camera.app.bean.AppInfo
import virtual.camera.app.data.AppsRepository
import virtual.camera.app.view.base.BaseViewModel

/**
 *
 * @Description:
 * @Author: tangqiang
 * @CreateDate: 2023/5/26 19:24
 */
class AppsViewModel(private val repo: AppsRepository) : BaseViewModel() {

    val appsLiveData = MutableLiveData<List<AppInfo>>()

    val resultLiveData = MutableLiveData<String>()

    val launchLiveData = MutableLiveData<Boolean>()

    //利用LiveData只更新最后一次的特性，用来保存app顺序
    val updateSortLiveData = MutableLiveData<Boolean>()

    fun getInstalledApps(userId: Int) {
        launchOnUI {
            repo.getVmInstallList(userId, appsLiveData)
        }
    }

    fun install(source: String, userID: Int) {
        launchOnUI {
            repo.installApk(source, userID, resultLiveData)
        }
    }

    fun unInstall(packageName: String, userID: Int) {
        launchOnUI {
            repo.unInstall(packageName, userID, resultLiveData)
        }
    }

    fun clearApkData(packageName: String,userID: Int){
        launchOnUI {
            repo.clearApkData(packageName,userID,resultLiveData)
        }
    }

    fun launchApk(packageName: String, userID: Int) {
        launchOnUI {
            repo.launchApk(packageName, userID, launchLiveData)
        }
    }

    fun updateApkOrder(userID: Int,dataList:List<AppInfo>){
        launchOnUI {
            repo.updateApkOrder(userID,dataList)
        }
    }
}