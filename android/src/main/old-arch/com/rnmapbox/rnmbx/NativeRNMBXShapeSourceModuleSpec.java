
/**
 * This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * Do not edit this file as changes may cause incorrect behavior and will be lost
 * once the code is regenerated.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.rnmapbox.rnmbx;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class NativeRNMBXShapeSourceModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public static final String NAME = "RNMBXShapeSourceModule";

  public NativeRNMBXShapeSourceModuleSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public @Nonnull String getName() {
    return NAME;
  }

  @ReactMethod
  @DoNotStrip
  public abstract void getClusterExpansionZoom(@Nullable Integer viewRef, String featureJSON, Promise promise);

  @ReactMethod
  @DoNotStrip
  public abstract void getClusterLeaves(@Nullable Integer viewRef, String featureJSON, int number, int offset, Promise promise);

  @ReactMethod
  @DoNotStrip
  public abstract void getClusterChildren(@Nullable Integer viewRef, String featureJSON, Promise promise);
}
