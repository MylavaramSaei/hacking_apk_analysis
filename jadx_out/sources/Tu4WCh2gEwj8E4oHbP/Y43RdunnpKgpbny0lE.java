package Tu4WCh2gEwj8E4oHbP;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Y43RdunnpKgpbny0lE {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public View f1698s3fjYDxWOUexjjVgyA;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f1697lEeR5KfoEr4xU5yHH7 = new HashMap();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final ArrayList f1696HJFh0TGMpafqLE9haL = new ArrayList();

    public Y43RdunnpKgpbny0lE(View view) {
        this.f1698s3fjYDxWOUexjjVgyA = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Y43RdunnpKgpbny0lE)) {
            return false;
        }
        Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE = (Y43RdunnpKgpbny0lE) obj;
        return this.f1698s3fjYDxWOUexjjVgyA == y43RdunnpKgpbny0lE.f1698s3fjYDxWOUexjjVgyA && this.f1697lEeR5KfoEr4xU5yHH7.equals(y43RdunnpKgpbny0lE.f1697lEeR5KfoEr4xU5yHH7);
    }

    public int hashCode() {
        return (this.f1698s3fjYDxWOUexjjVgyA.hashCode() * 31) + this.f1697lEeR5KfoEr4xU5yHH7.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1698s3fjYDxWOUexjjVgyA + "\n") + "    values:";
        for (String str2 : this.f1697lEeR5KfoEr4xU5yHH7.keySet()) {
            str = str + "    " + str2 + ": " + this.f1697lEeR5KfoEr4xU5yHH7.get(str2) + "\n";
        }
        return str;
    }
}
