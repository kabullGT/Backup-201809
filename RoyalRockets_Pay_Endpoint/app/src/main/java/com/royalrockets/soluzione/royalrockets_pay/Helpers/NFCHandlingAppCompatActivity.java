package com.royalrockets.soluzione.royalrockets_pay.Helpers;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//Foreground dispatch for NFC imported from: https://developer.android.com/guide/topics/connectivity/nfc/advanced-nfc#foreground-dispatch

public abstract class NFCHandlingAppCompatActivity extends AppCompatActivity {
    protected NfcAdapter mNfcAdapter;
    PendingIntent pendingIntent;
    IntentFilter ndef;
    IntentFilter[] intentFiltersArray;
    String[][] techListsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pendingIntent =  PendingIntent.getActivity(
                this, 0, new Intent(this, getClass()).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), 0);
        ndef = new IntentFilter(NfcAdapter.ACTION_TAG_DISCOVERED);
        try {
            ndef.addDataType("*/*");    /* Handles all MIME based dispatches.
                                       You should specify only the ones that you need. */
        }
        catch (IntentFilter.MalformedMimeTypeException e) {
            throw new RuntimeException("fail", e);
        }
        // TODO: Find out why the filters below do not launch our performIntent code and generic ("null") intentFiltersArray and techListArray have to be used.
        //intentFiltersArray = new IntentFilter[] {ndef, };
        //techListsArray = new String[][] { new String[] { NfcF.class.getName() } };
        intentFiltersArray = null;
        techListsArray = null;
    }

    @Override
    protected void onPause(){
        super.onPause();
        mNfcAdapter.disableForegroundDispatch(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);
        mNfcAdapter.enableForegroundDispatch(this, pendingIntent, intentFiltersArray, techListsArray);
    }
}
