package com.myapp.tarotcollector;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.myapp.tarotcollector.models.Card;

public class CardDetailActivity extends AppCompatActivity {

    private ImageView cardImageView;
    private TextView cardNameTextView;
    private TextView cardDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_detail);

        cardImageView = findViewById(R.id.card_image_view);
        cardNameTextView = findViewById(R.id.card_name_text_view);
        cardDescriptionTextView = findViewById(R.id.card_description_text_view);

        Card card = (Card) getIntent().getSerializableExtra("card");

        if (card != null) {
            Glide.with(this)
                .load(card.getImage())
                .into(cardImageView);

            cardNameTextView.setText(card.getName());
            cardDescriptionTextView.setText(card.getDescription());
        }
    }
}