package com.example.blibajuonline.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.blibajuonline.Interface.ItemClickListener;
import com.example.blibajuonline.R;
public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtProductname, txtProductPrice, txtProductQuantity;
    private ItemClickListener itemClickListener;

    public CartViewHolder(View itemView)
    {
        super(itemView);
        txtProductname = itemView.findViewById(R.id.cart_product_name);
        txtProductPrice = itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity = itemView.findViewById(R.id.cart_product_quantity);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(), false);
    }
    public void setItemClickListener (ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;


    }
}
