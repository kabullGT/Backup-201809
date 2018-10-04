package com.royalrockets.soluzione.royalrockets_pay;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.NfcF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.royalrockets.soluzione.royalrockets_pay.Helpers.NFCHandlingAppCompatActivity;
import com.royalrockets.soluzione.royalrockets_pay.Helpers.NFCHelper;

//NFC handling imported from: https://www.programcreek.com/java-api-examples/?class=android.nfc.NfcAdapter&method=getDefaultAdapter

public class UserLoggingScreen extends NFCHandlingAppCompatActivity {
    Boolean nfcEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

   @Override
    protected void onResume(){
        super.onResume();
        setContentView(R.layout.activity_user_logging_screen);
        TextView alert = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.buttonGoToNFCConfig);
        if (mNfcAdapter != null) {
            nfcEnabled = mNfcAdapter.isEnabled();
            if (nfcEnabled) {
                // Remove the alert if NFC is enabled.
                // TODO: Present the instruction to tap to login here.
                alert.setText("TAP TO LOGIN");
                button.setVisibility(View.GONE);
                //performIntent(getIntent());
                return;
            }
        }
        alert.setText(R.string.attention_nfc_not_enabled);
        button.setVisibility(View.VISIBLE);
    }

    private String serialId = "";

    public void onNewIntent(Intent intent){
        performIntent(intent);
    }

    private void performIntent(Intent intent) {
        String action = intent.getAction();
        Tag tag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
        if (action.equals(NfcAdapter.ACTION_TAG_DISCOVERED)) {
            try {
                byte[] tagId = tag.getId();
                serialId = NFCHelper.toHexString(tagId);
                Log.d("[ReadCardTools]", "Serial Number: " + serialId);
                if (checkUserCredentials()){
                    Intent startAttendeeIndentificationIntent = new Intent(this, AttendeeIdentificationScreen.class);
                    startActivity(startAttendeeIndentificationIntent);
                } else {
                    popupWrongCredentials();
                }
            } catch (NullPointerException ex) {
                ex.printStackTrace();
                serialId = "ERROR";
            }
        }
    }

    public void onGoToNFCConfig(View view) {
        Intent intent = new Intent(android.provider.Settings.ACTION_NFC_SETTINGS);
        startActivity(intent);
    }

    private boolean checkUserCredentials(){
        //TODO: Read user login credentials from NFC.
        //TODO: Transmit to server and receive (and serialize) user information (name, picture, balance).
        return true;
    }

    private void popupWrongCredentials(){
        //TODO: Handle wrong credentials.
        return;
    }
}
