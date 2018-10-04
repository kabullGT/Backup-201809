package com.royalrockets.soluzione.royalrockets_pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// TODO: Remove if no longer necessary.
//import com.royalrockets.soluzione.royalrockets_pay.Communications.CommunicationsClient;
import com.royalrockets.soluzione.royalrockets_pay.Model.Order;

public class ProductsMenuScreen extends Activity {
    private String POC_fakeItem = "Uninitialized";
    private Order POC_order = new Order();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_menu_screen);
    }

    public void onAddItemToOrder(View view){
        //TODO: Deserialize the order from the local database.
        //TODO: Update the order in memory with the added item.
        //TODO: Serialize the updated order into the local database.
        POC_fakeItem = "Fake item\n";
        POC_order.POC_addToOrder(POC_fakeItem);

        // TODO: Remove if no longer necessary.
        //new CommunicationsClient().execute(POC_fakeItem);
    }

    public void onReviewOrderClick(View view){
        Intent intent = new Intent(this, OrderReviewScreen.class);
        intent.putExtra("order", POC_order);
        startActivity(intent);
    }
}
