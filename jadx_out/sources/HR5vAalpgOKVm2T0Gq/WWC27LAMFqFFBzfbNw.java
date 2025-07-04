package HR5vAalpgOKVm2T0Gq;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class WWC27LAMFqFFBzfbNw extends ao3wqKm5CXFuvC0q47 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final /* synthetic */ int f376HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final /* synthetic */ Intent f377lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final /* synthetic */ Activity f378s3fjYDxWOUexjjVgyA;

    public WWC27LAMFqFFBzfbNw(Intent intent, Activity activity, int i) {
        this.f377lEeR5KfoEr4xU5yHH7 = intent;
        this.f378s3fjYDxWOUexjjVgyA = activity;
        this.f376HJFh0TGMpafqLE9haL = i;
    }

    @Override // HR5vAalpgOKVm2T0Gq.ao3wqKm5CXFuvC0q47
    public final void lEeR5KfoEr4xU5yHH7() {
        Intent intent = this.f377lEeR5KfoEr4xU5yHH7;
        if (intent != null) {
            this.f378s3fjYDxWOUexjjVgyA.startActivityForResult(intent, this.f376HJFh0TGMpafqLE9haL);
        }
    }
}
