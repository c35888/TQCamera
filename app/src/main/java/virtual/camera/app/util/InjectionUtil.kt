package virtual.camera.app.util

import virtual.camera.app.data.AppsRepository
import virtual.camera.app.data.GmsRepository
import virtual.camera.app.data.XpRepository
import virtual.camera.app.view.apps.AppsFactory
import virtual.camera.app.view.gms.GmsFactory
import virtual.camera.app.view.list.ListFactory

/**
 *
 * @Description:
 * @Author: tangqiang
 * @CreateDate: 2023/5/26 19:24
 */
object InjectionUtil {

    private val appsRepository = AppsRepository()

    private val xpRepository = XpRepository()

    private val gmsRepository = GmsRepository()


    fun getAppsFactory() : AppsFactory {
        return AppsFactory(appsRepository)
    }

    fun getListFactory(): ListFactory {
        return ListFactory(appsRepository)
    }

    fun getGmsFactory():GmsFactory{
        return GmsFactory(gmsRepository)
    }
}