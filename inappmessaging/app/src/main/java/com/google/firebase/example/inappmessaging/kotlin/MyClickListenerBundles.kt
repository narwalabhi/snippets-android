package com.google.firebase.example.inappmessaging.kotlin

import com.google.firebase.inappmessaging.FirebaseInAppMessagingClickListener
import com.google.firebase.inappmessaging.model.Action
import com.google.firebase.inappmessaging.model.InAppMessage

class MyClickListenerBundles : FirebaseInAppMessagingClickListener {

// [START fiam_click_listener_bundles]
    override fun messageClicked(inAppMessage: InAppMessage, action: Action) {
        // Determine which URL the user clicked
        val url = action.actionUrl

        // Get data bundle for the inapp message
        val dataBundle = inAppMessage.getData()
        // ...
    }
    // [END fiam_click_listener_bundles]
}