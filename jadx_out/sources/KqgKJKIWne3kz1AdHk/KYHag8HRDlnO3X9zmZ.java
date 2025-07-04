package KqgKJKIWne3kz1AdHk;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f898lEeR5KfoEr4xU5yHH7;

    public interface HJFh0TGMpafqLE9haL {
        ClipDescription HJFh0TGMpafqLE9haL();

        Uri husNiw3snxdgZPAGJm();

        void lEeR5KfoEr4xU5yHH7();

        Uri s3fjYDxWOUexjjVgyA();

        Object zZKhbgvUfsK4AEX3r0();
    }

    public static final class lEeR5KfoEr4xU5yHH7 implements HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final InputContentInfo f899lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f899lEeR5KfoEr4xU5yHH7 = new InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public ClipDescription HJFh0TGMpafqLE9haL() {
            return this.f899lEeR5KfoEr4xU5yHH7.getDescription();
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public Uri husNiw3snxdgZPAGJm() {
            return this.f899lEeR5KfoEr4xU5yHH7.getContentUri();
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public void lEeR5KfoEr4xU5yHH7() {
            this.f899lEeR5KfoEr4xU5yHH7.requestPermission();
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public Uri s3fjYDxWOUexjjVgyA() {
            return this.f899lEeR5KfoEr4xU5yHH7.getLinkUri();
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public Object zZKhbgvUfsK4AEX3r0() {
            return this.f899lEeR5KfoEr4xU5yHH7;
        }

        public lEeR5KfoEr4xU5yHH7(Object obj) {
            this.f899lEeR5KfoEr4xU5yHH7 = (InputContentInfo) obj;
        }
    }

    public KYHag8HRDlnO3X9zmZ(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        this.f898lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
    }

    public static KYHag8HRDlnO3X9zmZ KYHag8HRDlnO3X9zmZ(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new KYHag8HRDlnO3X9zmZ(new lEeR5KfoEr4xU5yHH7(obj));
        }
        return null;
    }

    public Uri HJFh0TGMpafqLE9haL() {
        return this.f898lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
    }

    public Object husNiw3snxdgZPAGJm() {
        return this.f898lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0();
    }

    public Uri lEeR5KfoEr4xU5yHH7() {
        return this.f898lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm();
    }

    public ClipDescription s3fjYDxWOUexjjVgyA() {
        return this.f898lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL();
    }

    public void zZKhbgvUfsK4AEX3r0() {
        this.f898lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7();
    }

    public KYHag8HRDlnO3X9zmZ(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f898lEeR5KfoEr4xU5yHH7 = Build.VERSION.SDK_INT >= 25 ? new lEeR5KfoEr4xU5yHH7(uri, clipDescription, uri2) : new s3fjYDxWOUexjjVgyA(uri, clipDescription, uri2);
    }

    public static final class s3fjYDxWOUexjjVgyA implements HJFh0TGMpafqLE9haL {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final Uri f900HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Uri f901lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final ClipDescription f902s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f901lEeR5KfoEr4xU5yHH7 = uri;
            this.f902s3fjYDxWOUexjjVgyA = clipDescription;
            this.f900HJFh0TGMpafqLE9haL = uri2;
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public ClipDescription HJFh0TGMpafqLE9haL() {
            return this.f902s3fjYDxWOUexjjVgyA;
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public Uri husNiw3snxdgZPAGJm() {
            return this.f901lEeR5KfoEr4xU5yHH7;
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public Uri s3fjYDxWOUexjjVgyA() {
            return this.f900HJFh0TGMpafqLE9haL;
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public Object zZKhbgvUfsK4AEX3r0() {
            return null;
        }

        @Override // KqgKJKIWne3kz1AdHk.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL
        public void lEeR5KfoEr4xU5yHH7() {
        }
    }
}
