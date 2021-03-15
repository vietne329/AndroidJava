package com.example.a04_09_nhom10.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a04_09_nhom10.R;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
private Context mContext;
private List<Cat> mlist;

    public CartAdapter(Context context){
        this.mContext = context;
    }

    public void setData(List<Cat> list){
        this.mlist=list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card,parent,false);

        return new CartViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
            Cat c = mlist.get(position);
            if(c == null){
                return ;
            }
                holder.img.setImageResource(c.getResourceImg());
                holder.txt.setText(c.getName());
    }

    @Override
    public int getItemCount() {
        if(mlist != null){
            return mlist.size();
        }
        return 0;
    }

    //ViewHolder
    public class CartViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView txt;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            txt = itemView.findViewById(R.id.tv);
        }
    }

}
