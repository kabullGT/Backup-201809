package com.royalrockets.soluzione.royalrockets_pay;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.royalrockets.soluzione.royalrockets_pay.Model.Order;

public class OrderReviewScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Order order = (Order) getIntent().getParcelableExtra("order");
        setContentView(R.layout.activity_order_review_screen);
        TextView orderReviewSpace = (TextView) findViewById(R.id.orderReviewArea);
        orderReviewSpace.setText(order.POC_getOrderDetails());
    }
}
