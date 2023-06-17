package com.freed.movie_freed_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.freed.movie_freed_app.R;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView title, details;
        ImageView imageView;

        title = findViewById(R.id.titleDetailsId);
        details = findViewById(R.id.detailsDetailsId);
        imageView = findViewById(R.id.imageDetailsId);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null)
        {
            title.setText(bundle.getString("title"));
            details.setText(bundle.getString("details"));
            imageView.setImageResource(bundle.getInt("imageView"));
        }
    }
}