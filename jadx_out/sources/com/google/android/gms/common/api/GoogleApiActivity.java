package com.google.android.gms.common.api;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import aRQ2M7vtRaPDEyvpdv.husNiw3snxdgZPAGJm;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import f2zPq7MOnQrtOlZ1Zg.TCyPEKSzIyweCN5yp1;
import f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f4761lEeR5KfoEr4xU5yHH7 = 0;

    public static Intent lEeR5KfoEr4xU5yHH7(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4761lEeR5KfoEr4xU5yHH7 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjmA49QRPHynYLCBN0SqP = husNiw3snxdgZPAGJm.A49QRPHynYLCBN0SqP(this);
                if (i2 == -1) {
                    husniw3snxdgzpagjmA49QRPHynYLCBN0SqP.lEeR5KfoEr4xU5yHH7();
                } else if (i2 == 0) {
                    husniw3snxdgzpagjmA49QRPHynYLCBN0SqP.tXWeW0sqVddf7ZBflq(new lEeR5KfoEr4xU5yHH7(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f4761lEeR5KfoEr4xU5yHH7 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f4761lEeR5KfoEr4xU5yHH7 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4761lEeR5KfoEr4xU5yHH7 = bundle.getInt("resolution");
        }
        if (this.f4761lEeR5KfoEr4xU5yHH7 != 1) {
            s3fjYDxWOUexjjVgyA();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f4761lEeR5KfoEr4xU5yHH7);
        super.onSaveInstanceState(bundle);
    }

    public final void s3fjYDxWOUexjjVgyA() throws IntentSender.SendIntentException {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            TCyPEKSzIyweCN5yp1.e54J8UWNHWALQNixXM().T9PhQIpGRhE4yZDm1C(this, ((Integer) hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(num)).intValue(), 2, this);
            this.f4761lEeR5KfoEr4xU5yHH7 = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f4761lEeR5KfoEr4xU5yHH7 = 1;
        } catch (ActivityNotFoundException e) {
            if (extras.getBoolean("notify_manager", true)) {
                husNiw3snxdgZPAGJm.A49QRPHynYLCBN0SqP(this).tXWeW0sqVddf7ZBflq(new lEeR5KfoEr4xU5yHH7(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String string = pendingIntent.toString();
                StringBuilder sb = new StringBuilder(string.length() + 36);
                sb.append("Activity not found while launching ");
                sb.append(string);
                sb.append(".");
                String string2 = sb.toString();
                if (Build.FINGERPRINT.contains("generic")) {
                    string2 = string2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", string2, e);
            }
            this.f4761lEeR5KfoEr4xU5yHH7 = 1;
            finish();
        } catch (IntentSender.SendIntentException e2) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
            finish();
        }
    }
}
