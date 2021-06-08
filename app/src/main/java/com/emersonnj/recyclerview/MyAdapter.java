package com.emersonnj.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[],data2[];
    int imagem[];
    Context context;
    public MyAdapter(Context ct, String f1[], String f2[], int img[]){
        data1 = f1;
        data2 = f2;
        imagem = img;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView4.setText(data1[position]);
        holder.textView5.setText(data2[position]);



    }

    @Override
    public int getItemCount() {
        return imagem.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView4,textView5;
        ImageView imageView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView4 = itemView.findViewById(R.id.textView4);
            textView5 = itemView.findViewById(R.id.textView5);
            imageView2 = itemView.findViewById(R.id.imageView2);
        }
    }
}
