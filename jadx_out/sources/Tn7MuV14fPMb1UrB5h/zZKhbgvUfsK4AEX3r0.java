package Tn7MuV14fPMb1UrB5h;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static volatile zZKhbgvUfsK4AEX3r0 f1627s3fjYDxWOUexjjVgyA;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Set f1628lEeR5KfoEr4xU5yHH7 = new HashSet();

    public static zZKhbgvUfsK4AEX3r0 lEeR5KfoEr4xU5yHH7() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = f1627s3fjYDxWOUexjjVgyA;
        if (zzkhbgvufsk4aex3r0 == null) {
            synchronized (zZKhbgvUfsK4AEX3r0.class) {
                try {
                    zzkhbgvufsk4aex3r0 = f1627s3fjYDxWOUexjjVgyA;
                    if (zzkhbgvufsk4aex3r0 == null) {
                        zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0();
                        f1627s3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0;
                    }
                } finally {
                }
            }
        }
        return zzkhbgvufsk4aex3r0;
    }

    public Set s3fjYDxWOUexjjVgyA() {
        Set setUnmodifiableSet;
        synchronized (this.f1628lEeR5KfoEr4xU5yHH7) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f1628lEeR5KfoEr4xU5yHH7);
        }
        return setUnmodifiableSet;
    }
}
