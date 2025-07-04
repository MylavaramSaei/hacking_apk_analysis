package aRQ2M7vtRaPDEyvpdv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class XzJ1BS7H9Ilbkv4eVM extends BroadcastReceiver {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Context f2465lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final jCtUeU2YI1poCxWcjm f2466s3fjYDxWOUexjjVgyA;

    public XzJ1BS7H9Ilbkv4eVM(jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm) {
        this.f2466s3fjYDxWOUexjjVgyA = jctueu2yi1pocxwcjm;
    }

    public final void lEeR5KfoEr4xU5yHH7(Context context) {
        this.f2465lEeR5KfoEr4xU5yHH7 = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2466s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
            s3fjYDxWOUexjjVgyA();
        }
    }

    public final synchronized void s3fjYDxWOUexjjVgyA() {
        try {
            Context context = this.f2465lEeR5KfoEr4xU5yHH7;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f2465lEeR5KfoEr4xU5yHH7 = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
