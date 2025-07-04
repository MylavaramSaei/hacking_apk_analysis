package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import eWK41qw3g36LVd4UnS.R9SAhYMerGybF9OAjL;
import eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls;
import iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void s3fjYDxWOUexjjVgyA() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        R9SAhYMerGybF9OAjL.KYHag8HRDlnO3X9zmZ(context);
        aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0 = aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7().s3fjYDxWOUexjjVgyA(queryParameter).zZKhbgvUfsK4AEX3r0(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(iIntValue));
        if (queryParameter2 != null) {
            leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(Base64.decode(queryParameter2, 0));
        }
        R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL().husNiw3snxdgZPAGJm().xHA29AmDt6y96AnB3t(leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(), i, new Runnable() { // from class: fLSSbwbzFBVpwBH5FM.lEeR5KfoEr4xU5yHH7
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.s3fjYDxWOUexjjVgyA();
            }
        });
    }
}
