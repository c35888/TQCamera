package virtual.camera.app.view.main

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import virtual.camera.app.view.apps.AppsFragment

/**
 *
 * @Description:
 * @Author: tangqiang
 * @CreateDate: 2023/5/26 19:24
 */

class ViewPagerAdapter(appCompatActivity: AppCompatActivity) : FragmentStateAdapter(appCompatActivity) {

    private var fragmentList = mutableListOf<AppsFragment>()

    fun replaceData(list: MutableList<AppsFragment>){
        this.fragmentList = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}