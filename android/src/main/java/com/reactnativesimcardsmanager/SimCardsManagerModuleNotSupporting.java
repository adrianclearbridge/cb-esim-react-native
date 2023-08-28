package com.reactnativesimcardsmanager;

import static android.content.Context.EUICC_SERVICE;

import android.app.Activity;
import android.os.Build;
import android.telephony.euicc.EuiccManager;
import com.facebook.react.bridge.*;
import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.euicc.DownloadableSubscription;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.telephony.TelephonyManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import java.util.List;

@ReactModule(name = SimCardsManagerModule.NAME)
public class SimCardsManagerModuleNotSupporting extends ReactContextBaseJavaModule {
  public static final String NAME = "SimCardsManager";
  private String ACTION_DOWNLOAD_SUBSCRIPTION = "download_subscription";
  private ReactContext mReactContext;

  public SimCardsManagerModuleNotSupporting(ReactApplicationContext reactContext) {
    super(reactContext);
    mReactContext = reactContext;
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }

  @ReactMethod
  public void getSimCardsNative(Promise promise) {
    promise.reject("0", "This functionality is not supported before Android 5.1 (22)");
  }

  @ReactMethod
  public void isEsimSupported(Promise promise) {
    promise.reject("0", "This functionality is not supported before Android 5.1 (22)");

  }

  @ReactMethod
  public void setupEsim(ReadableMap config, Promise promise) {
    promise.reject("0", "This functionality is not supported before Android 5.1 (22)");

  }
}
