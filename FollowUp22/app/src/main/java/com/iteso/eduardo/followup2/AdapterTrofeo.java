package com.iteso.eduardo.followup2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
/**
 * Created by Sergio Aceves on 27/11/2017.
 */
public class AdapterTrofeo extends RecyclerView.Adapter<AdapterTrofeo.ViewHolder>{
    private ArrayList<Trofeo> mDataSet;
    private Context context;
    public AdapterTrofeo(Context context, ArrayList<Trofeo> myDataSet) {
        mDataSet = myDataSet;
        this.context = context;
    }
    @Override
    public AdapterTrofeo.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_generate_medallas, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTrofeoTitle;
        public TextView mTrofeoDesc;
        public ImageView mTrofeoImage;
        public LinearLayout mEventLayout;
        public ViewHolder(View v) {
            super(v);
            mEventLayout = (LinearLayout) v.findViewById(R.id.medallas_layout);
            mTrofeoTitle = (TextView) v.findViewById(R.id.titulo_carta);
            mTrofeoDesc = (TextView) v.findViewById(R.id.descricpion_Carta);
            mTrofeoImage = (ImageView) v.findViewById(R.id.imagen_trofeo);
        }
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTrofeoTitle.setText(mDataSet.get(position).getTitulo());
        holder.mTrofeoDesc.setText(mDataSet.get(position).getDescrip());
        switch (mDataSet.get(position).getImagen()) {
            case 0:
                holder.mTrofeoImage.setImageResource(R.drawable.trofeo);
                break;
            case 1:
                holder.mTrofeoImage.setImageResource(R.drawable.trofeo2);
                break;
        }
    }
    public int getItemCount() {
        return mDataSet.size();
    }
}
