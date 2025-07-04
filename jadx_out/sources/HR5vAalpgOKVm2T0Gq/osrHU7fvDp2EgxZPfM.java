package HR5vAalpgOKVm2T0Gq;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class osrHU7fvDp2EgxZPfM {

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static final Uri f420KYHag8HRDlnO3X9zmZ = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final ComponentName f421HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final boolean f422husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f423lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f424s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f425zZKhbgvUfsK4AEX3r0;

    public osrHU7fvDp2EgxZPfM(String str, String str2, int i, boolean z) {
        hoXrIDAFrSwfShk8da.zZKhbgvUfsK4AEX3r0(str);
        this.f423lEeR5KfoEr4xU5yHH7 = str;
        hoXrIDAFrSwfShk8da.zZKhbgvUfsK4AEX3r0(str2);
        this.f424s3fjYDxWOUexjjVgyA = str2;
        this.f421HJFh0TGMpafqLE9haL = null;
        this.f425zZKhbgvUfsK4AEX3r0 = 4225;
        this.f422husNiw3snxdgZPAGJm = z;
    }

    public final String HJFh0TGMpafqLE9haL() {
        return this.f424s3fjYDxWOUexjjVgyA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osrHU7fvDp2EgxZPfM)) {
            return false;
        }
        osrHU7fvDp2EgxZPfM osrhu7fvdp2egxzpfm = (osrHU7fvDp2EgxZPfM) obj;
        return T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(this.f423lEeR5KfoEr4xU5yHH7, osrhu7fvdp2egxzpfm.f423lEeR5KfoEr4xU5yHH7) && T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(this.f424s3fjYDxWOUexjjVgyA, osrhu7fvdp2egxzpfm.f424s3fjYDxWOUexjjVgyA) && T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(this.f421HJFh0TGMpafqLE9haL, osrhu7fvdp2egxzpfm.f421HJFh0TGMpafqLE9haL) && this.f422husNiw3snxdgZPAGJm == osrhu7fvdp2egxzpfm.f422husNiw3snxdgZPAGJm;
    }

    public final int hashCode() {
        return T9PhQIpGRhE4yZDm1C.s3fjYDxWOUexjjVgyA(this.f423lEeR5KfoEr4xU5yHH7, this.f424s3fjYDxWOUexjjVgyA, this.f421HJFh0TGMpafqLE9haL, 4225, Boolean.valueOf(this.f422husNiw3snxdgZPAGJm));
    }

    public final ComponentName lEeR5KfoEr4xU5yHH7() {
        return this.f421HJFh0TGMpafqLE9haL;
    }

    public final Intent s3fjYDxWOUexjjVgyA(Context context) {
        Bundle bundleCall;
        if (this.f423lEeR5KfoEr4xU5yHH7 == null) {
            return new Intent().setComponent(this.f421HJFh0TGMpafqLE9haL);
        }
        if (this.f422husNiw3snxdgZPAGJm) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f423lEeR5KfoEr4xU5yHH7);
            try {
                bundleCall = context.getContentResolver().call(f420KYHag8HRDlnO3X9zmZ, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f423lEeR5KfoEr4xU5yHH7)));
            }
        }
        return intent == null ? new Intent(this.f423lEeR5KfoEr4xU5yHH7).setPackage(this.f424s3fjYDxWOUexjjVgyA) : intent;
    }

    public final String toString() {
        String str = this.f423lEeR5KfoEr4xU5yHH7;
        if (str != null) {
            return str;
        }
        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(this.f421HJFh0TGMpafqLE9haL);
        return this.f421HJFh0TGMpafqLE9haL.flattenToString();
    }
}
