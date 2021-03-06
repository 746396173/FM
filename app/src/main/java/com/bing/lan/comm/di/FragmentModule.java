package com.bing.lan.comm.di;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.bing.lan.comm.utils.LogUtil;
import com.bing.lan.fm.ui.anchor.AnchorFragment;
import com.bing.lan.fm.ui.anchor.AnchorModule;
import com.bing.lan.fm.ui.anchor.AnchorPresenter;
import com.bing.lan.fm.ui.anchor.IAnchorContract;
import com.bing.lan.fm.ui.category.CategoryFragment;
import com.bing.lan.fm.ui.category.CategoryModule;
import com.bing.lan.fm.ui.category.CategoryPresenter;
import com.bing.lan.fm.ui.category.ICategoryContract;
import com.bing.lan.fm.ui.gank.GankFragment;
import com.bing.lan.fm.ui.gank.GankModule;
import com.bing.lan.fm.ui.gank.GankPresenter;
import com.bing.lan.fm.ui.gank.IGankContract;
import com.bing.lan.fm.ui.girl.GirlFragment;
import com.bing.lan.fm.ui.girl.GirlModule;
import com.bing.lan.fm.ui.girl.GirlPresenter;
import com.bing.lan.fm.ui.girl.IGirlContract;
import com.bing.lan.fm.ui.home.HomeFragment;
import com.bing.lan.fm.ui.home.HomeModule;
import com.bing.lan.fm.ui.home.HomePresenter;
import com.bing.lan.fm.ui.home.IHomeContract;
import com.bing.lan.fm.ui.hot.HotFragment;
import com.bing.lan.fm.ui.hot.HotModule;
import com.bing.lan.fm.ui.hot.HotPresenter;
import com.bing.lan.fm.ui.hot.IHotContract;
import com.bing.lan.fm.ui.mine.IMineContract;
import com.bing.lan.fm.ui.mine.MineFragment;
import com.bing.lan.fm.ui.mine.MineModule;
import com.bing.lan.fm.ui.mine.MinePresenter;
import com.bing.lan.fm.ui.recommend.IRecommendContract;
import com.bing.lan.fm.ui.recommend.RecommendFragment;
import com.bing.lan.fm.ui.recommend.RecommendModule;
import com.bing.lan.fm.ui.recommend.RecommendPresenter;
import com.bing.lan.fm.ui.splash1.ISplashContract;
import com.bing.lan.fm.ui.splash1.SplashFragment;
import com.bing.lan.fm.ui.splash1.SplashModule;
import com.bing.lan.fm.ui.splash1.SplashPresenter;
import com.bing.lan.fm.ui.subscriber.ISubscriberContract;
import com.bing.lan.fm.ui.subscriber.SubscriberFragment;
import com.bing.lan.fm.ui.subscriber.SubscriberModule;
import com.bing.lan.fm.ui.subscriber.SubscriberPresenter;
import com.bing.lan.fm.ui.top.ITopContract;
import com.bing.lan.fm.ui.top.TopFragment;
import com.bing.lan.fm.ui.top.TopModule;
import com.bing.lan.fm.ui.top.TopPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 520 on 2017/1/11.
 */
@Module
public class FragmentModule {

    private Fragment mFragment;
    private Bundle initParams;

    public FragmentModule(Fragment fragment, Bundle initParams) {
        this.mFragment = fragment;
        this.initParams = initParams;
    }

    @Provides
    public LogUtil provideLogCat() {
        return LogUtil.getLogUtil(mFragment.getClass(), 1);
    }

    @Provides
    public IHomeContract.IHomePresenter provideHomePresenter() {
        HomePresenter homePresenter = new HomePresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new HomeModule());
        homePresenter.onAttachView((HomeFragment) mFragment);
        return homePresenter;
    }

    @Provides
    public ISplashContract.ISplashPresenter provideSplashPresenter() {
        SplashPresenter homePresenter = new SplashPresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new SplashModule());
        homePresenter.onAttachView((SplashFragment) mFragment);
        return homePresenter;
    }

    @Provides
    public IMineContract.IMinePresenter provideMinePresenter() {
        MinePresenter homePresenter = new MinePresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new MineModule());
        homePresenter.onAttachView((MineFragment) mFragment);
        return homePresenter;
    }

    @Provides
    public IHotContract.IHotPresenter provideHotPresenter() {
        HotPresenter homePresenter = new HotPresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new HotModule());
        homePresenter.onAttachView((HotFragment) mFragment);
        return homePresenter;
    }

    @Provides
    public IGirlContract.IGirlPresenter provideGirlPresenter() {
        GirlPresenter homePresenter = new GirlPresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new GirlModule());
        homePresenter.onAttachView((GirlFragment) mFragment);
        return homePresenter;
    }

    @Provides
    public IGankContract.IGankPresenter provideGankPresenter() {
        GankPresenter homePresenter = new GankPresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new GankModule());
        homePresenter.onAttachView((GankFragment) mFragment);
        return homePresenter;
    }

    @Provides
    public ISubscriberContract.ISubscriberPresenter provideSubscriberPresenter() {
        SubscriberPresenter homePresenter = new SubscriberPresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new SubscriberModule());
        homePresenter.onAttachView((SubscriberFragment) mFragment);
        return homePresenter;
    }

    @Provides
    public ICategoryContract.ICategoryPresenter provideCategoryPresenter() {
        CategoryPresenter homePresenter = new CategoryPresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new CategoryModule());
        homePresenter.onAttachView((CategoryFragment) mFragment);
        return homePresenter;
    }
    @Provides
    public ITopContract.ITopPresenter provideTopPresenter() {
        TopPresenter homePresenter = new TopPresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new TopModule());
        homePresenter.onAttachView((TopFragment) mFragment);
        return homePresenter;
    }

    @Provides
    public IRecommendContract.IRecommendPresenter provideRecommendPresenter() {
        RecommendPresenter homePresenter = new RecommendPresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new RecommendModule());
        homePresenter.onAttachView((RecommendFragment) mFragment);
        return homePresenter;
    }

    @Provides
    public IAnchorContract.IAnchorPresenter provideAnchorPresenter() {
        AnchorPresenter homePresenter = new AnchorPresenter();
        homePresenter.setParams(initParams);
        homePresenter.setModule(new AnchorModule());
        homePresenter.onAttachView((AnchorFragment) mFragment);
        return homePresenter;
    }
}
