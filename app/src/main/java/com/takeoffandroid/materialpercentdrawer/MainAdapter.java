package com.takeoffandroid.materialpercentdrawer;

import android.content.Context;
import android.support.percent.PercentFrameLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    private List<MainModel> mMainList;
    private Context mContext;

    public OnListItemClickListener mOnListItemClickListener;

    private boolean isToggle;



    public MainAdapter(Context context, List<MainModel> mainList) {
        this.mMainList = mainList;
        this.mContext = context;

        this.mOnListItemClickListener = (OnListItemClickListener) mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_main, viewGroup, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


           holder.txtName.setTextColor (mMainList.get (position).getColors());

        holder.txtName.setText(mMainList.get(position).getNames().toUpperCase());
        holder.imgFront.setImageDrawable(mMainList.get(position).getAvatorIcons());

        holder.imgBack.setVisibility(View.GONE);
        holder.imgFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!isToggle){
                    isToggle = true;
                    mOnListItemClickListener.openDrawer(view, position, mMainList.get(position));

                }else{
                    isToggle = false;
                    mOnListItemClickListener.closeDrawer(view, position, mMainList.get(position));

                }

            }
        });
       }

    @Override
    public int getItemCount() {
        return mMainList == null ? 0 : mMainList.size();
    }


    public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtName;
        public ImageView imgFront,imgBack;
        public PercentFrameLayout percentFrameImage;


        public ViewHolder(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txt_name);
            imgFront = (ImageView)itemView.findViewById(R.id.img_front);
            imgBack = (ImageView)itemView.findViewById(R.id.img_back);

            percentFrameImage = (PercentFrameLayout)itemView.findViewById(R.id.percent_frame_image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            isToggle = true;
            mOnListItemClickListener.openDrawer(view, getAdapterPosition(), mMainList.get(getAdapterPosition()));


        }
    }

    public void setOnItemClickListener(OnListItemClickListener onListItemClickListener) {
        this.mOnListItemClickListener = onListItemClickListener;
    }




}
