package com.dieam.reactnativepushnotification.modules;

import android.content.Intent;
import android.os.Bundle;

import com.facebook.react.HeadlessJsTaskService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;

import javax.annotation.Nullable;

public class RNPushNotificationActionService extends HeadlessJsTaskService {

  @Override
  protected @Nullable HeadlessJsTaskConfig getTaskConfig(Intent intent) {
    Bundle extras = intent.getExtras();
    if (extras != null) {
      return new HeadlessJsTaskConfig(
              "RNPushNotificationActionHandlerTask",
              Arguments.fromBundle(intent.getExtras()),
              5000,
              true
      );
    }
    return null;
  }
}
