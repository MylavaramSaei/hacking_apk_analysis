package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import eWK41qw3g36LVd4UnS.R9SAhYMerGybF9OAjL;
import eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls;
import iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        R9SAhYMerGybF9OAjL.KYHag8HRDlnO3X9zmZ(getApplicationContext());
        aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0 = aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7().s3fjYDxWOUexjjVgyA(string).zZKhbgvUfsK4AEX3r0(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i));
        if (string2 != null) {
            leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(Base64.decode(string2, 0));
        }
        R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL().husNiw3snxdgZPAGJm().xHA29AmDt6y96AnB3t(leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(), i2, new Runnable() { // from class: fLSSbwbzFBVpwBH5FM.husNiw3snxdgZPAGJm
            @Override // java.lang.Runnable
            public final void run() {
                this.f5936lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public final /* synthetic */ void s3fjYDxWOUexjjVgyA(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }
}
