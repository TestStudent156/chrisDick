1. Shared Variables: 
   - "cardCollection" (List of Card objects)
   - "setCollection" (List of Set objects)

2. Data Schemas: 
   - "Card" (Model class with properties like id, name, image, description)
   - "Set" (Model class with properties like id, name, list of Card objects)

3. ID Names of DOM Elements: 
   - "card_collection_view" (RecyclerView in CardCollectionActivity)
   - "card_detail_view" (View in CardDetailActivity)
   - "future_prediction_view" (View in FuturePredictionActivity)

4. Message Names: 
   - "card_collection_updated" (Broadcast when a new card is added to the collection)
   - "set_completed" (Broadcast when a set is completed)

5. Function Names: 
   - "addCardToCollection" (Function to add a card to the collection)
   - "checkSetCompletion" (Function to check if a set is completed)
   - "predictFuture" (Function to predict future when a set is completed)

6. Shared Dependencies: 
   - Android SDK (For building the Android app)
   - SQLite (For storing the card and set data)
   - Glide (For loading card images)

7. XML Resources: 
   - "activity_main.xml" (Layout for MainActivity)
   - "activity_card_collection.xml" (Layout for CardCollectionActivity)
   - "activity_card_detail.xml" (Layout for CardDetailActivity)
   - "activity_future_prediction.xml" (Layout for FuturePredictionActivity)
   - "card_images.xml" (Drawable resources for card images)
   - "strings.xml" (String resources for the app)

8. AndroidManifest.xml: 
   - Defines the app's package name, components (activities, services), permissions, and other app configurations.