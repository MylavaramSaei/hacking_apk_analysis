package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import f2zPq7MOnQrtOlZ1Zg.IPyIQcaNa8aB7drBED;

@KeepName
/* loaded from: classes.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        super(i, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + IPyIQcaNa8aB7drBED.f5801lEeR5KfoEr4xU5yHH7 + " but found " + i + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
