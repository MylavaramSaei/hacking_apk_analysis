package com.google.firebase;

import Tn7MuV14fPMb1UrB5h.HJFh0TGMpafqLE9haL;
import Tn7MuV14fPMb1UrB5h.IPyIQcaNa8aB7drBED;
import Tn7MuV14fPMb1UrB5h.husNiw3snxdgZPAGJm;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import zQjb36M22TWHJmh54i.KYHag8HRDlnO3X9zmZ;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String IPyIQcaNa8aB7drBED(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? pbVGzGjWvY2LDXC8vo(installerPackageName) : "";
    }

    public static /* synthetic */ String KYHag8HRDlnO3X9zmZ(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    public static /* synthetic */ String TCyPEKSzIyweCN5yp1(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    public static /* synthetic */ String husNiw3snxdgZPAGJm(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static String pbVGzGjWvY2LDXC8vo(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL());
        arrayList.add(KYHag8HRDlnO3X9zmZ.TCyPEKSzIyweCN5yp1());
        arrayList.add(IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA("fire-core", "21.0.0"));
        arrayList.add(IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA("device-name", pbVGzGjWvY2LDXC8vo(Build.PRODUCT)));
        arrayList.add(IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA("device-model", pbVGzGjWvY2LDXC8vo(Build.DEVICE)));
        arrayList.add(IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA("device-brand", pbVGzGjWvY2LDXC8vo(Build.BRAND)));
        arrayList.add(IPyIQcaNa8aB7drBED.HJFh0TGMpafqLE9haL("android-target-sdk", new IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7() { // from class: sKw6Jz5uGcQ479KwIW.KYHag8HRDlnO3X9zmZ
            @Override // Tn7MuV14fPMb1UrB5h.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
            public final String lEeR5KfoEr4xU5yHH7(Object obj) {
                return FirebaseCommonRegistrar.husNiw3snxdgZPAGJm((Context) obj);
            }
        }));
        arrayList.add(IPyIQcaNa8aB7drBED.HJFh0TGMpafqLE9haL("android-min-sdk", new IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7() { // from class: sKw6Jz5uGcQ479KwIW.TCyPEKSzIyweCN5yp1
            @Override // Tn7MuV14fPMb1UrB5h.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
            public final String lEeR5KfoEr4xU5yHH7(Object obj) {
                return FirebaseCommonRegistrar.KYHag8HRDlnO3X9zmZ((Context) obj);
            }
        }));
        arrayList.add(IPyIQcaNa8aB7drBED.HJFh0TGMpafqLE9haL("android-platform", new IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7() { // from class: sKw6Jz5uGcQ479KwIW.IPyIQcaNa8aB7drBED
            @Override // Tn7MuV14fPMb1UrB5h.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
            public final String lEeR5KfoEr4xU5yHH7(Object obj) {
                return FirebaseCommonRegistrar.TCyPEKSzIyweCN5yp1((Context) obj);
            }
        }));
        arrayList.add(IPyIQcaNa8aB7drBED.HJFh0TGMpafqLE9haL("android-installer", new IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7() { // from class: sKw6Jz5uGcQ479KwIW.pbVGzGjWvY2LDXC8vo
            @Override // Tn7MuV14fPMb1UrB5h.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7
            public final String lEeR5KfoEr4xU5yHH7(Object obj) {
                return FirebaseCommonRegistrar.IPyIQcaNa8aB7drBED((Context) obj);
            }
        }));
        String strLEeR5KfoEr4xU5yHH7 = husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7();
        if (strLEeR5KfoEr4xU5yHH7 != null) {
            arrayList.add(IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA("kotlin", strLEeR5KfoEr4xU5yHH7));
        }
        return arrayList;
    }
}
