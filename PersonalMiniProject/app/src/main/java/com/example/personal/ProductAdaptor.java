package com.example.personal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdaptor extends RecyclerView.Adapter<ProductAdaptor.ProductViewHolder> {
    private Context mCtx;

    //we are storing all the products in a list
    private List<Products> productList;

    //getting the context and product list with constructor
    public ProductAdaptor(Context mCtx, List<Products> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }
    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.activity_product_adaptor, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, final int position) {
        //getting the product of the specified position
        final Products product = productList.get(position);

        //binding the data with the viewholder views

        holder.textViewTitle.setText(product.getTitle());


        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), pdf.class);
                i.putExtra("title",productList.get(position).getTitle());
                i.putExtra("product",productList.get(position).getTitle());
                i.putExtra("link",productList.get(position).getLink());
                mCtx.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView imageView;
        CardView cardView;
        public ProductViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardview);// card intial
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}



