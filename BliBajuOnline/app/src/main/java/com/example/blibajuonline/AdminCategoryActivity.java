package com.example.blibajuonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView tShirts, shirts, jackets, pants;
    private ImageView tShirtsGirl, dress, hijab, skirts;

    private Button LogoutBtn, CheckOrdersBtn, MaintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        MaintainProductsBtn = (Button) findViewById(R.id.maintain_btn);

        MaintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
            }
        });

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        tShirts = (ImageView) findViewById(R.id.t_shirts);
        shirts = (ImageView) findViewById(R.id.shirts);
        jackets = (ImageView) findViewById(R.id.jackets);
        pants = (ImageView) findViewById(R.id.pants);

        tShirtsGirl = (ImageView) findViewById(R.id.t_shirts_girl);
        dress = (ImageView) findViewById(R.id.dress);
        hijab = (ImageView) findViewById(R.id.jilbab);
        skirts = (ImageView) findViewById(R.id.skirts);

        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        AdminAddNewProductActivity.class);
                intent.putExtra("category", "T-Shirts");
                startActivity(intent);
            }
        });

        shirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        AdminAddNewProductActivity.class);
                intent.putExtra("category", "Shirts");
                startActivity(intent);
            }
        });

        jackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        AdminAddNewProductActivity.class);
                intent.putExtra("category", "Jackets");
                startActivity(intent);
            }
        });

        pants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pants");
                startActivity(intent);
            }
        });

        tShirtsGirl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        AdminAddNewProductActivity.class);
                intent.putExtra("category", "T-Shirts Girl");
                startActivity(intent);
            }
        });

        dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        AdminAddNewProductActivity.class);
                intent.putExtra("category", "Dress");
                startActivity(intent);
            }
        });

        hijab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        AdminAddNewProductActivity.class);
                intent.putExtra("category", "Hijab");
                startActivity(intent);
            }
        });

        skirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        AdminAddNewProductActivity.class);
                intent.putExtra("category", "Skirts");
                startActivity(intent);
            }
        });
    }

    public static class ReadOrdersActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_read_orders);
        }
    }
}
