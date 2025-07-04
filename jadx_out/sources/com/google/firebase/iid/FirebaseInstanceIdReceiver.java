package com.google.firebase.iid;

import JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM;
import SF66oTSCsXABfwyWiU.GyWRxpdt1T8mEJXPoD;
import SF66oTSCsXABfwyWiU.hoXrIDAFrSwfShk8da;
import Ywqw2A0s86HeuFkDt0.lEeR5KfoEr4xU5yHH7;
import Ywqw2A0s86HeuFkDt0.s3fjYDxWOUexjjVgyA;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends s3fjYDxWOUexjjVgyA {
    public static Intent KYHag8HRDlnO3X9zmZ(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // Ywqw2A0s86HeuFkDt0.s3fjYDxWOUexjjVgyA
    public void HJFh0TGMpafqLE9haL(Context context, Bundle bundle) {
        Intent intentKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (GyWRxpdt1T8mEJXPoD.jCtUeU2YI1poCxWcjm(intentKYHag8HRDlnO3X9zmZ)) {
            GyWRxpdt1T8mEJXPoD.xHA29AmDt6y96AnB3t(intentKYHag8HRDlnO3X9zmZ);
        }
    }

    @Override // Ywqw2A0s86HeuFkDt0.s3fjYDxWOUexjjVgyA
    public int s3fjYDxWOUexjjVgyA(Context context, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        try {
            return ((Integer) e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(new hoXrIDAFrSwfShk8da(context).Z9WdNiOsPR0y54zHW4(leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }
}
