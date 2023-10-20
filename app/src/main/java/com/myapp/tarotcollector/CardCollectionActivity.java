package com.myapp.tarotcollector;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.myapp.tarotcollector.models.Card;
import com.myapp.tarotcollector.database.CardDatabase;
import java.util.List;

public class CardCollectionActivity extends AppCompatActivity {

    private RecyclerView cardCollectionView;
    private CardDatabase cardDatabase;
    private List<Card> cardCollection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_collection);

        cardCollectionView = findViewById(R.id.card_collection_view);
        cardDatabase = new CardDatabase(this);
        cardCollection = cardDatabase.getAllCards();

        CardCollectionAdapter adapter = new CardCollectionAdapter(cardCollection);
        cardCollectionView.setLayoutManager(new LinearLayoutManager(this));
        cardCollectionView.setAdapter(adapter);
    }

    public void addCardToCollection(Card card) {
        cardDatabase.addCard(card);
        cardCollection.add(card);
        cardCollectionView.getAdapter().notifyDataSetChanged();
        checkSetCompletion();
    }

    private void checkSetCompletion() {
        for (Set set : setCollection) {
            if (set.isComplete()) {
                Intent intent = new Intent(this, FuturePredictionActivity.class);
                intent.putExtra("set", set);
                startActivity(intent);
                break;
            }
        }
    }
}