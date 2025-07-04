package fLSSbwbzFBVpwBH5FM;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 implements A49QRPHynYLCBN0SqP {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final KYHag8HRDlnO3X9zmZ f5954HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f5955lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0 f5956s3fjYDxWOUexjjVgyA;

    public zZKhbgvUfsK4AEX3r0(Context context, bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        this.f5955lEeR5KfoEr4xU5yHH7 = context;
        this.f5956s3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0;
        this.f5954HJFh0TGMpafqLE9haL = kYHag8HRDlnO3X9zmZ;
    }

    public int HJFh0TGMpafqLE9haL(eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f5955lEeR5KfoEr4xU5yHH7.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0())).array());
        if (apygsiylzvnkpt1bls.HJFh0TGMpafqLE9haL() != null) {
            adler32.update(apygsiylzvnkpt1bls.HJFh0TGMpafqLE9haL());
        }
        return (int) adler32.getValue();
    }

    @Override // fLSSbwbzFBVpwBH5FM.A49QRPHynYLCBN0SqP
    public void lEeR5KfoEr4xU5yHH7(eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, int i) {
        s3fjYDxWOUexjjVgyA(apygsiylzvnkpt1bls, i, false);
    }

    @Override // fLSSbwbzFBVpwBH5FM.A49QRPHynYLCBN0SqP
    public void s3fjYDxWOUexjjVgyA(eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f5955lEeR5KfoEr4xU5yHH7, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f5955lEeR5KfoEr4xU5yHH7.getSystemService("jobscheduler");
        int iHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(apygsiylzvnkpt1bls);
        if (!z && zZKhbgvUfsK4AEX3r0(jobScheduler, iHJFh0TGMpafqLE9haL, i)) {
            ayduHasC7VpxsVXE0T.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", apygsiylzvnkpt1bls);
            return;
        }
        long jHJFh0TGMpafqLE9haL = this.f5956s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(apygsiylzvnkpt1bls);
        JobInfo.Builder builderHJFh0TGMpafqLE9haL = this.f5954HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(new JobInfo.Builder(iHJFh0TGMpafqLE9haL, componentName), apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0(), jHJFh0TGMpafqLE9haL, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA());
        persistableBundle.putInt("priority", iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0()));
        if (apygsiylzvnkpt1bls.HJFh0TGMpafqLE9haL() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(apygsiylzvnkpt1bls.HJFh0TGMpafqLE9haL(), 0));
        }
        builderHJFh0TGMpafqLE9haL.setExtras(persistableBundle);
        ayduHasC7VpxsVXE0T.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", apygsiylzvnkpt1bls, Integer.valueOf(iHJFh0TGMpafqLE9haL), Long.valueOf(this.f5954HJFh0TGMpafqLE9haL.TCyPEKSzIyweCN5yp1(apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0(), jHJFh0TGMpafqLE9haL, i)), Long.valueOf(jHJFh0TGMpafqLE9haL), Integer.valueOf(i));
        jobScheduler.schedule(builderHJFh0TGMpafqLE9haL.build());
    }

    public final boolean zZKhbgvUfsK4AEX3r0(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }
}
