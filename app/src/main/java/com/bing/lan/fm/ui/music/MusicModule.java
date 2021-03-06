package com.bing.lan.fm.ui.music;

import com.bing.lan.comm.base.mvp.IBaseContract;
import com.bing.lan.comm.base.mvp.activity.BaseActivityModule;
import com.bing.lan.fm.ui.album.bean.AlbumResultBean;
import com.bing.lan.fm.ui.music.bean.PlayResult;

import rx.Observable;
import rx.functions.Func1;

import static com.bing.lan.fm.ui.music.MusicPresenter.LOAD_ALBUM;
import static com.bing.lan.fm.ui.music.MusicPresenter.LOAD_TRACK;

/**
 * @author 蓝兵
 * @time 2017/2/6  19:12
 */
public class MusicModule extends BaseActivityModule
        implements IMusicContract.IMusicModule {

    @Override
    public void loadData(int action, IBaseContract.OnDataChangerListener listener, Object... parameter) {
        switch (action) {

            case LOAD_TRACK:
                loadTrack(action, listener, (long) parameter[0], (long) parameter[1]);
                break;
            case LOAD_ALBUM:
                loadAlbum(action, listener, (Long) parameter[0]);
        }
    }
    public void loadAlbum(int action, IBaseContract.OnDataChangerListener listener, Long albumId) {
        Observable<AlbumResultBean.DataBean> observable = mApiService.getAlbumResult(albumId)
                .filter(new Func1<AlbumResultBean, Boolean>() {
                    @Override
                    public Boolean call(AlbumResultBean albumResultBean) {
                        return albumResultBean.getRet() == 0;
                    }
                })
                .map(new Func1<AlbumResultBean, AlbumResultBean.DataBean>() {
                    @Override
                    public AlbumResultBean.DataBean call(AlbumResultBean albumResultBean) {
                        return albumResultBean.getData();
                    }
                });

        subscribe(observable, action, listener, "专辑播放页面播放列表");
    }

    private void loadTrack(int action, IBaseContract.OnDataChangerListener listener, long trackId,long albumId) {
        Observable<PlayResult> observable = mApiService.getPlayResult(trackId,albumId);
        subscribe(observable, action, listener, "专辑播放页面");
    }
}
