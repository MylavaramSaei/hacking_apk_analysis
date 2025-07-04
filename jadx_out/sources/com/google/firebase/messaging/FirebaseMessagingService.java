package com.google.firebase.messaging;

import SF66oTSCsXABfwyWiU.GyWRxpdt1T8mEJXPoD;
import SF66oTSCsXABfwyWiU.KYHag8HRDlnO3X9zmZ;
import SF66oTSCsXABfwyWiU.aPyGSIylzVNKPT1Bls;
import SF66oTSCsXABfwyWiU.cT5Hs3CQpLK8NvlZAw;
import SF66oTSCsXABfwyWiU.e2F9F6h8YJxTHwLCa0;
import SF66oTSCsXABfwyWiU.pbVGzGjWvY2LDXC8vo;
import SF66oTSCsXABfwyWiU.udcVtCzLTM1Loe9KrX;
import SF66oTSCsXABfwyWiU.zcy2NNbtVXgoGQbfuq;
import Ywqw2A0s86HeuFkDt0.HJFh0TGMpafqLE9haL;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends pbVGzGjWvY2LDXC8vo {

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final Queue f5539TCyPEKSzIyweCN5yp1 = new ArrayDeque(10);

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f5540KYHag8HRDlnO3X9zmZ;

    public void G7AC3DWIx9i9fdanjk(String str, Exception exc) {
    }

    @Override // SF66oTSCsXABfwyWiU.pbVGzGjWvY2LDXC8vo
    public void KYHag8HRDlnO3X9zmZ(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            OANkd3mP6AYvwbNLJM(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            R9SAhYMerGybF9OAjL(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public final void OANkd3mP6AYvwbNLJM(Intent intent) {
        if (!e54J8UWNHWALQNixXM(intent.getStringExtra("google.message_id"))) {
            xHA29AmDt6y96AnB3t(intent);
        }
        aPyGSIylzVNKPT1Bls(this).s3fjYDxWOUexjjVgyA(new Ywqw2A0s86HeuFkDt0.lEeR5KfoEr4xU5yHH7(intent));
    }

    public void R9SAhYMerGybF9OAjL(String str) {
    }

    public final void T9PhQIpGRhE4yZDm1C(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (e2F9F6h8YJxTHwLCa0.R9SAhYMerGybF9OAjL(extras)) {
            e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0 = new e2F9F6h8YJxTHwLCa0(extras);
            ExecutorService executorServiceHusNiw3snxdgZPAGJm = aPyGSIylzVNKPT1Bls.husNiw3snxdgZPAGJm();
            try {
                if (new KYHag8HRDlnO3X9zmZ(this, e2f9f6h8yjxthwlca0, executorServiceHusNiw3snxdgZPAGJm).lEeR5KfoEr4xU5yHH7()) {
                    return;
                }
                if (GyWRxpdt1T8mEJXPoD.jCtUeU2YI1poCxWcjm(intent)) {
                    GyWRxpdt1T8mEJXPoD.LIMtzhnLwQyigzK0KO(intent);
                }
            } finally {
                executorServiceHusNiw3snxdgZPAGJm.shutdown();
            }
        }
        sTkWmhpZ5b1ArQIw4K(new zcy2NNbtVXgoGQbfuq(extras));
    }

    public void Y43RdunnpKgpbny0lE(String str) {
    }

    public final HJFh0TGMpafqLE9haL aPyGSIylzVNKPT1Bls(Context context) {
        if (this.f5540KYHag8HRDlnO3X9zmZ == null) {
            this.f5540KYHag8HRDlnO3X9zmZ = new HJFh0TGMpafqLE9haL(context.getApplicationContext());
        }
        return this.f5540KYHag8HRDlnO3X9zmZ;
    }

    public final boolean e54J8UWNHWALQNixXM(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f5539TCyPEKSzIyweCN5yp1;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    public final String hoXrIDAFrSwfShk8da(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Override // SF66oTSCsXABfwyWiU.pbVGzGjWvY2LDXC8vo
    public Intent husNiw3snxdgZPAGJm(Intent intent) {
        return cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().HJFh0TGMpafqLE9haL();
    }

    public final void xHA29AmDt6y96AnB3t(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                zaq8hOURtfwbcX17cG();
                break;
            case "gcm":
                GyWRxpdt1T8mEJXPoD.VItLRw50eXTZeEfGl0(intent);
                T9PhQIpGRhE4yZDm1C(intent);
                break;
            case "send_error":
                G7AC3DWIx9i9fdanjk(hoXrIDAFrSwfShk8da(intent), new udcVtCzLTM1Loe9KrX(intent.getStringExtra("error")));
                break;
            case "send_event":
                Y43RdunnpKgpbny0lE(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    public void zaq8hOURtfwbcX17cG() {
    }

    public void sTkWmhpZ5b1ArQIw4K(zcy2NNbtVXgoGQbfuq zcy2nnbtvxgogqbfuq) {
    }
}
