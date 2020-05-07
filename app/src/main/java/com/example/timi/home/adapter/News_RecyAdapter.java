package com.example.timi.home.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.timi.R;
import com.example.timi.home.bean.ColunmBean;
import com.example.timi.home.bean.NewsBean;

import java.util.List;

public class News_RecyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<NewsBean.DataBean.FlashListBean> list;
    Context context;

    public News_RecyAdapter(List<NewsBean.DataBean.FlashListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


                           View view = LayoutInflater.from(context).inflate(R.layout.icon_view, null);
                           return new ViewHodle1(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {



             ViewHodle1 v2 = (ViewHodle1) holder;
             v2.title.setText(list.get(position).getTheme());
             v2.title.setText(list.get(position).getTheme());
             Glide.with(context)
                     .load(list.get(position).getImage_url())
                     .apply(RequestOptions.bitmapTransform(new CircleCrop()))//圆形
                     // .apply(RequestOptions.bitmapTransform(new RoundedCorners(50))) //圆角 自定义设置
                     .into(v2.im);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class ViewHodle1 extends RecyclerView.ViewHolder {

        private final ImageView im;
        private final TextView title;
        private final TextView title2;

        public ViewHodle1(View view) {
            super(view);
            im = view.findViewById(R.id.im);
            title = view.findViewById(R.id.title);
            title2 = view.findViewById(R.id.title2);
        }
    }
}
