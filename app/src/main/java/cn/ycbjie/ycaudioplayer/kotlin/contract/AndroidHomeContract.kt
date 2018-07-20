package cn.ycbjie.ycaudioplayer.kotlin.contract

import cn.ycbjie.ycaudioplayer.base.mvp.BasePresenter
import cn.ycbjie.ycaudioplayer.base.mvp.BaseView
import cn.ycbjie.ycaudioplayer.kotlin.model.bean.BannerBean
import com.mg.axechen.wanandroid.javabean.HomeListBean
import network.response.ResponseBean

interface AndroidHomeContract {

    interface View : BaseView{
        fun setDataErrorView()
        fun setNetWorkErrorView()
        fun setDataView(bean: ResponseBean<HomeListBean>)
        fun setBannerView(bean: ResponseBean<List<BannerBean>>?)
    }

    interface Presenter : BasePresenter {
        fun getHomeList(page: Int)
        fun getBannerData(isRefresh: Boolean)
    }

}
