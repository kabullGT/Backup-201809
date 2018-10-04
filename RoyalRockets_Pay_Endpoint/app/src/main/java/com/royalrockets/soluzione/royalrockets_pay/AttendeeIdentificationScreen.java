package com.royalrockets.soluzione.royalrockets_pay;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.royalrockets.soluzione.royalrockets_pay.Model.Attendee;

public class AttendeeIdentificationScreen extends AppCompatActivity {

    NfcAdapter mNfcAdapter;
    Boolean nfcEnabled = false;
    PendingIntent pendingIntent;
    IntentFilter ndef;
    IntentFilter[] intentFiltersArray;
    String[][] techListsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendee_identification_screen);
    }

    public void onAttendeeIdentification(View view){
        //TODO: Read attendee login credentials from NFC.
        int attendeeId = 0;
        Attendee attendee = loadAttendee(attendeeId);
        //TODO: Store attendee information on local database.
        Intent intent = new Intent(this, ProductsMenuScreen.class);
        startActivity(intent);
    }

    private Attendee loadAttendee(int attendeeId){
        return null;
    }
}
