package com.royalrockets.soluzione.royalrockets_pay.Controller;

public class StateController {
    public enum ApplicationStates {
        WAITING_FOR_USER_LOGIN
        , WAITING_FOR_ATTENDEE_CREDENTIALS
        , CREATING_ORDER
        , WAITING_FOR_ORDER_REVIEW
        , TRANSMITTING_ORDER
    }
}
