package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.lEeR5KfoEr4xU5yHH7;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class LIMtzhnLwQyigzK0KO implements lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Bundle f3779HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final androidx.savedstate.lEeR5KfoEr4xU5yHH7 f3780lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public boolean f3781s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final GraqRgO5nDZP94CSeH.zZKhbgvUfsK4AEX3r0 f3782zZKhbgvUfsK4AEX3r0;

    public static final class lEeR5KfoEr4xU5yHH7 extends jpEZy3U5wFkT2e9PKQ.Acstmh57AKoSEkEFNJ implements RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 {

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ OUd9THiLjZndMj0qdF f3783s3fjYDxWOUexjjVgyA;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lEeR5KfoEr4xU5yHH7(OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
            super(0);
            this.f3783s3fjYDxWOUexjjVgyA = oUd9THiLjZndMj0qdF;
        }

        @Override // RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7
        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: merged with bridge method [inline-methods] */
        public final A49QRPHynYLCBN0SqP lEeR5KfoEr4xU5yHH7() {
            return xHA29AmDt6y96AnB3t.s3fjYDxWOUexjjVgyA(this.f3783s3fjYDxWOUexjjVgyA);
        }
    }

    public LIMtzhnLwQyigzK0KO(androidx.savedstate.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "savedStateRegistry");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdF, "viewModelStoreOwner");
        this.f3780lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
        this.f3782zZKhbgvUfsK4AEX3r0 = GraqRgO5nDZP94CSeH.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(new lEeR5KfoEr4xU5yHH7(oUd9THiLjZndMj0qdF));
    }

    public final void HJFh0TGMpafqLE9haL() {
        if (this.f3781s3fjYDxWOUexjjVgyA) {
            return;
        }
        Bundle bundleS3fjYDxWOUexjjVgyA = this.f3780lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3779HJFh0TGMpafqLE9haL;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleS3fjYDxWOUexjjVgyA != null) {
            bundle.putAll(bundleS3fjYDxWOUexjjVgyA);
        }
        this.f3779HJFh0TGMpafqLE9haL = bundle;
        this.f3781s3fjYDxWOUexjjVgyA = true;
        s3fjYDxWOUexjjVgyA();
    }

    @Override // androidx.savedstate.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL
    public Bundle lEeR5KfoEr4xU5yHH7() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3779HJFh0TGMpafqLE9haL;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm().entrySet().iterator();
        if (!it.hasNext()) {
            this.f3781s3fjYDxWOUexjjVgyA = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(entry.getValue());
        throw null;
    }

    public final A49QRPHynYLCBN0SqP s3fjYDxWOUexjjVgyA() {
        return (A49QRPHynYLCBN0SqP) this.f3782zZKhbgvUfsK4AEX3r0.getValue();
    }
}
