package HR5vAalpgOKVm2T0Gq;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public class zaq8hOURtfwbcX17cG {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Resources f445lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f446s3fjYDxWOUexjjVgyA;

    public zaq8hOURtfwbcX17cG(Context context) {
        hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(context);
        Resources resources = context.getResources();
        this.f445lEeR5KfoEr4xU5yHH7 = resources;
        this.f446s3fjYDxWOUexjjVgyA = resources.getResourcePackageName(f2zPq7MOnQrtOlZ1Zg.e54J8UWNHWALQNixXM.f5813lEeR5KfoEr4xU5yHH7);
    }

    public String lEeR5KfoEr4xU5yHH7(String str) {
        int identifier = this.f445lEeR5KfoEr4xU5yHH7.getIdentifier(str, "string", this.f446s3fjYDxWOUexjjVgyA);
        if (identifier == 0) {
            return null;
        }
        return this.f445lEeR5KfoEr4xU5yHH7.getString(identifier);
    }
}
