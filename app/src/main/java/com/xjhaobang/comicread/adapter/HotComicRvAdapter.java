package com.xjhaobang.comicread.adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.xjhaobang.comicread.R;
import com.xjhaobang.comicread.base.BaseRecyclerViewAdapter;
import com.xjhaobang.comicread.been.ComicBeen;

import butterknife.BindView;

/**
 * Created by PC on 2017/9/28.
 */

public class HotComicRvAdapter extends BaseRecyclerViewAdapter<ComicBeen> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hot_comic, parent, false);
        return new HotComicHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((HotComicHolder)holder).bindView(mDataList.get(position));
    }

    class HotComicHolder extends BaseRvHolder{
        @BindView(R.id.sdv_pic)
        SimpleDraweeView mSdvPic;
        @BindView(R.id.tv_title)
        TextView mTvTitle;
        @BindView(R.id.tv_update)
        TextView mTvUpdate;

        HotComicHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void bindView(ComicBeen comicBeen) {
            mSdvPic.setImageURI(Uri.parse(comicBeen.getPicUrl()));
            mTvTitle.setText(comicBeen.getTitle());
            mTvUpdate.setText(comicBeen.getUpdate());
        }
    }
}
