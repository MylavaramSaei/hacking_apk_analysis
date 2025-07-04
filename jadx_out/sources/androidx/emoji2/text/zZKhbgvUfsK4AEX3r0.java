package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.KYHag8HRDlnO3X9zmZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zZKhbgvUfsK4AEX3r0 {

    public static class HJFh0TGMpafqLE9haL extends s3fjYDxWOUexjjVgyA {
        @Override // androidx.emoji2.text.zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA
        public List HJFh0TGMpafqLE9haL(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }

        @Override // androidx.emoji2.text.zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA
        public ProviderInfo lEeR5KfoEr4xU5yHH7(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final s3fjYDxWOUexjjVgyA f3392lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f3392lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya == null ? husNiw3snxdgZPAGJm() : s3fjydxwouexjjvgya;
        }

        public static s3fjYDxWOUexjjVgyA husNiw3snxdgZPAGJm() {
            return Build.VERSION.SDK_INT >= 28 ? new C0039zZKhbgvUfsK4AEX3r0() : new HJFh0TGMpafqLE9haL();
        }

        public KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(Context context) {
            return lEeR5KfoEr4xU5yHH7(context, IPyIQcaNa8aB7drBED(context));
        }

        public jCtUeU2YI1poCxWcjm.husNiw3snxdgZPAGJm IPyIQcaNa8aB7drBED(Context context) {
            PackageManager packageManager = context.getPackageManager();
            tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.IPyIQcaNa8aB7drBED(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(packageManager);
            if (providerInfoTCyPEKSzIyweCN5yp1 == null) {
                return null;
            }
            try {
                return zZKhbgvUfsK4AEX3r0(providerInfoTCyPEKSzIyweCN5yp1, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }

        public final boolean KYHag8HRDlnO3X9zmZ(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        public final ProviderInfo TCyPEKSzIyweCN5yp1(PackageManager packageManager) {
            Iterator it = this.f3392lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoLEeR5KfoEr4xU5yHH7 = this.f3392lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7((ResolveInfo) it.next());
                if (KYHag8HRDlnO3X9zmZ(providerInfoLEeR5KfoEr4xU5yHH7)) {
                    return providerInfoLEeR5KfoEr4xU5yHH7;
                }
            }
            return null;
        }

        public final KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL lEeR5KfoEr4xU5yHH7(Context context, jCtUeU2YI1poCxWcjm.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            if (husniw3snxdgzpagjm == null) {
                return null;
            }
            return new Z9WdNiOsPR0y54zHW4(context, husniw3snxdgzpagjm);
        }

        public final List s3fjYDxWOUexjjVgyA(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        public final jCtUeU2YI1poCxWcjm.husNiw3snxdgZPAGJm zZKhbgvUfsK4AEX3r0(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new jCtUeU2YI1poCxWcjm.husNiw3snxdgZPAGJm(str, str2, "emojicompat-emoji-font", s3fjYDxWOUexjjVgyA(this.f3392lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(packageManager, str2)));
        }
    }

    public static class s3fjYDxWOUexjjVgyA {
        public abstract List HJFh0TGMpafqLE9haL(PackageManager packageManager, Intent intent, int i);

        public abstract ProviderInfo lEeR5KfoEr4xU5yHH7(ResolveInfo resolveInfo);

        public Signature[] s3fjYDxWOUexjjVgyA(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: androidx.emoji2.text.zZKhbgvUfsK4AEX3r0$zZKhbgvUfsK4AEX3r0, reason: collision with other inner class name */
    public static class C0039zZKhbgvUfsK4AEX3r0 extends HJFh0TGMpafqLE9haL {
        @Override // androidx.emoji2.text.zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA
        public Signature[] s3fjYDxWOUexjjVgyA(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static Z9WdNiOsPR0y54zHW4 lEeR5KfoEr4xU5yHH7(Context context) {
        return (Z9WdNiOsPR0y54zHW4) new lEeR5KfoEr4xU5yHH7(null).HJFh0TGMpafqLE9haL(context);
    }
}
