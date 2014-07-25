package com.example.adapterviewflipper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyAdapter extends BaseAdapter {
    int[] imageIds = new int[] {
            R.drawable.baiyang,
            R.drawable.jinniu,
            R.drawable.shuangzi,
            R.drawable.juxie,
            R.drawable.shizi,
            R.drawable.chunv,
            R.drawable.tiancheng,
            R.drawable.tianxie,
            R.drawable.sheshou,
            R.drawable.mojie,
            R.drawable.shuiping,
            R.drawable.shuangyu,
    };

    Context context;
    
    public MyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return imageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv = new ImageView(context);
        iv.setImageResource(imageIds[position]);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);
        iv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

        return iv;
    }

}
