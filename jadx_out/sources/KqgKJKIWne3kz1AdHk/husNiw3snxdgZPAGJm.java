package KqgKJKIWne3kz1AdHk;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import W3RZ2dTDKrKpS5Mxdk.zZKhbgvUfsK4AEX3r0;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1;

/* loaded from: classes.dex */
public abstract class husNiw3snxdgZPAGJm {

    public interface HJFh0TGMpafqLE9haL {
        boolean lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, int i, Bundle bundle);
    }

    public class lEeR5KfoEr4xU5yHH7 extends InputConnectionWrapper {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ HJFh0TGMpafqLE9haL f903lEeR5KfoEr4xU5yHH7;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lEeR5KfoEr4xU5yHH7(InputConnection inputConnection, boolean z, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            super(inputConnection, z);
            this.f903lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f903lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ.KYHag8HRDlnO3X9zmZ(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    public class s3fjYDxWOUexjjVgyA extends InputConnectionWrapper {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ HJFh0TGMpafqLE9haL f904lEeR5KfoEr4xU5yHH7;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s3fjYDxWOUexjjVgyA(InputConnection inputConnection, boolean z, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
            super(inputConnection, z);
            this.f904lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (husNiw3snxdgZPAGJm.husNiw3snxdgZPAGJm(str, bundle, this.f904lEeR5KfoEr4xU5yHH7)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public static InputConnection HJFh0TGMpafqLE9haL(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return zZKhbgvUfsK4AEX3r0(inputConnection, editorInfo, s3fjYDxWOUexjjVgyA(view));
    }

    public static /* synthetic */ boolean KYHag8HRDlnO3X9zmZ(View view, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                kYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0();
                Parcelable parcelable = (Parcelable) kYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        return lLKzvdU99Iw80uVD5I.CSih7GetOUab1dYQjM(view, new zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(new ClipData(kYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(), new ClipData.Item(kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7())), 2).zZKhbgvUfsK4AEX3r0(kYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL()).s3fjYDxWOUexjjVgyA(bundle).lEeR5KfoEr4xU5yHH7()) == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static boolean husNiw3snxdgZPAGJm(String str, Bundle bundle, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        ?? LEeR5KfoEr4xU5yHH7 = 0;
        LEeR5KfoEr4xU5yHH7 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z = true;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    LEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(new KYHag8HRDlnO3X9zmZ(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver2 != 0) {
                    resultReceiver2.send(LEeR5KfoEr4xU5yHH7, null);
                }
                return LEeR5KfoEr4xU5yHH7;
            } catch (Throwable th) {
                th = th;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
    }

    public static HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA(final View view) {
        TCyPEKSzIyweCN5yp1.TCyPEKSzIyweCN5yp1(view);
        return new HJFh0TGMpafqLE9haL() { // from class: KqgKJKIWne3kz1AdHk.zZKhbgvUfsK4AEX3r0
            @Override // KqgKJKIWne3kz1AdHk.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL
            public final boolean lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, int i, Bundle bundle) {
                return husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(view, kYHag8HRDlnO3X9zmZ, i, bundle);
            }
        };
    }

    public static InputConnection zZKhbgvUfsK4AEX3r0(InputConnection inputConnection, EditorInfo editorInfo, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(inputConnection, "inputConnection must be non-null");
        tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(editorInfo, "editorInfo must be non-null");
        tXWeW0sqVddf7ZBflq.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(hJFh0TGMpafqLE9haL, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new lEeR5KfoEr4xU5yHH7(inputConnection, false, hJFh0TGMpafqLE9haL) : KqgKJKIWne3kz1AdHk.HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(editorInfo).length == 0 ? inputConnection : new s3fjYDxWOUexjjVgyA(inputConnection, false, hJFh0TGMpafqLE9haL);
    }
}
