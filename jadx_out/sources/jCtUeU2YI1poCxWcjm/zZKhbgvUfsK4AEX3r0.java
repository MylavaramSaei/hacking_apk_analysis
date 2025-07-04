package jCtUeU2YI1poCxWcjm;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zZKhbgvUfsK4AEX3r0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Comparator f6095lEeR5KfoEr4xU5yHH7 = new Comparator() { // from class: jCtUeU2YI1poCxWcjm.HJFh0TGMpafqLE9haL
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return zZKhbgvUfsK4AEX3r0.TCyPEKSzIyweCN5yp1((byte[]) obj, (byte[]) obj2);
        }
    };

    public interface lEeR5KfoEr4xU5yHH7 {
        static lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(Context context, Uri uri) {
            return new s3fjYDxWOUexjjVgyA(context, uri);
        }

        void close();

        Cursor s3fjYDxWOUexjjVgyA(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);
    }

    public static class s3fjYDxWOUexjjVgyA implements lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final ContentProviderClient f6096lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(Context context, Uri uri) {
            this.f6096lEeR5KfoEr4xU5yHH7 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // jCtUeU2YI1poCxWcjm.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7
        public void close() {
            ContentProviderClient contentProviderClient = this.f6096lEeR5KfoEr4xU5yHH7;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        @Override // jCtUeU2YI1poCxWcjm.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7
        public Cursor s3fjYDxWOUexjjVgyA(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f6096lEeR5KfoEr4xU5yHH7;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }
    }

    public static boolean HJFh0TGMpafqLE9haL(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[] IPyIQcaNa8aB7drBED(android.content.Context r16, jCtUeU2YI1poCxWcjm.husNiw3snxdgZPAGJm r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r2 = r2.build()
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri$Builder r0 = r3.authority(r0)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            r3 = r16
            jCtUeU2YI1poCxWcjm.zZKhbgvUfsK4AEX3r0$lEeR5KfoEr4xU5yHH7 r3 = jCtUeU2YI1poCxWcjm.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(r3, r2)
            r11 = 0
            java.lang.String r4 = "_id"
            java.lang.String r5 = "file_id"
            java.lang.String r6 = "font_ttc_index"
            java.lang.String r7 = "font_variation_settings"
            java.lang.String r8 = "font_weight"
            java.lang.String r9 = "font_italic"
            java.lang.String r10 = "result_code"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "query = ?"
            java.lang.String r4 = r17.TCyPEKSzIyweCN5yp1()     // Catch: java.lang.Throwable -> L9c
            java.lang.String[] r8 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L9c
            r9 = 0
            r4 = r3
            r5 = r2
            r10 = r19
            android.database.Cursor r11 = r4.s3fjYDxWOUexjjVgyA(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9c
            if (r11 == 0) goto Ldb
            int r5 = r11.getCount()     // Catch: java.lang.Throwable -> L9c
            if (r5 <= 0) goto Ldb
            java.lang.String r1 = "result_code"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L9c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9c
            r5.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = "_id"
            int r6 = r11.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "file_id"
            int r7 = r11.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r8 = "font_ttc_index"
            int r8 = r11.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r9 = "font_weight"
            int r9 = r11.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r10 = "font_italic"
            int r10 = r11.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L9c
        L8e:
            boolean r12 = r11.moveToNext()     // Catch: java.lang.Throwable -> L9c
            if (r12 == 0) goto Lda
            r12 = -1
            if (r1 == r12) goto L9e
            int r13 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L9c
            goto L9f
        L9c:
            r0 = move-exception
            goto Led
        L9e:
            r13 = 0
        L9f:
            if (r8 == r12) goto La6
            int r14 = r11.getInt(r8)     // Catch: java.lang.Throwable -> L9c
            goto La7
        La6:
            r14 = 0
        La7:
            r17 = r5
            if (r7 != r12) goto Lb4
            long r4 = r11.getLong(r6)     // Catch: java.lang.Throwable -> L9c
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r2, r4)     // Catch: java.lang.Throwable -> L9c
            goto Lbc
        Lb4:
            long r4 = r11.getLong(r7)     // Catch: java.lang.Throwable -> L9c
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r0, r4)     // Catch: java.lang.Throwable -> L9c
        Lbc:
            if (r9 == r12) goto Lc3
            int r5 = r11.getInt(r9)     // Catch: java.lang.Throwable -> L9c
            goto Lc5
        Lc3:
            r5 = 400(0x190, float:5.6E-43)
        Lc5:
            if (r10 == r12) goto Lcf
            int r12 = r11.getInt(r10)     // Catch: java.lang.Throwable -> L9c
            r15 = 1
            if (r12 != r15) goto Lcf
            goto Ld0
        Lcf:
            r15 = 0
        Ld0:
            jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1$s3fjYDxWOUexjjVgyA r4 = jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(r4, r14, r5, r15, r13)     // Catch: java.lang.Throwable -> L9c
            r5 = r17
            r5.add(r4)     // Catch: java.lang.Throwable -> L9c
            goto L8e
        Lda:
            r1 = r5
        Ldb:
            if (r11 == 0) goto Le0
            r11.close()
        Le0:
            r3.close()
            r0 = 0
            jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1$s3fjYDxWOUexjjVgyA[] r0 = new jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1$s3fjYDxWOUexjjVgyA[] r0 = (jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA[]) r0
            return r0
        Led:
            if (r11 == 0) goto Lf2
            r11.close()
        Lf2:
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jCtUeU2YI1poCxWcjm.zZKhbgvUfsK4AEX3r0.IPyIQcaNa8aB7drBED(android.content.Context, jCtUeU2YI1poCxWcjm.husNiw3snxdgZPAGJm, java.lang.String, android.os.CancellationSignal):jCtUeU2YI1poCxWcjm.TCyPEKSzIyweCN5yp1$s3fjYDxWOUexjjVgyA[]");
    }

    public static ProviderInfo KYHag8HRDlnO3X9zmZ(PackageManager packageManager, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, Resources resources) throws PackageManager.NameNotFoundException {
        String strHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strHusNiw3snxdgZPAGJm, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strHusNiw3snxdgZPAGJm);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strHusNiw3snxdgZPAGJm + ", but package was not " + husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ());
        }
        List listS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listS3fjYDxWOUexjjVgyA, f6095lEeR5KfoEr4xU5yHH7);
        List listZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(husniw3snxdgzpagjm, resources);
        for (int i = 0; i < listZZKhbgvUfsK4AEX3r0.size(); i++) {
            ArrayList arrayList = new ArrayList((Collection) listZZKhbgvUfsK4AEX3r0.get(i));
            Collections.sort(arrayList, f6095lEeR5KfoEr4xU5yHH7);
            if (HJFh0TGMpafqLE9haL(listS3fjYDxWOUexjjVgyA, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    public static /* synthetic */ int TCyPEKSzIyweCN5yp1(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public static TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm(Context context, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, CancellationSignal cancellationSignal) {
        ProviderInfo providerInfoKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(context.getPackageManager(), husniw3snxdgzpagjm, context.getResources());
        return providerInfoKYHag8HRDlnO3X9zmZ == null ? TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(1, null) : TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(0, IPyIQcaNa8aB7drBED(context, husniw3snxdgzpagjm, providerInfoKYHag8HRDlnO3X9zmZ.authority, cancellationSignal));
    }

    public static List s3fjYDxWOUexjjVgyA(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static List zZKhbgvUfsK4AEX3r0(husNiw3snxdgZPAGJm husniw3snxdgzpagjm, Resources resources) {
        return husniw3snxdgzpagjm.s3fjYDxWOUexjjVgyA() != null ? husniw3snxdgzpagjm.s3fjYDxWOUexjjVgyA() : A49QRPHynYLCBN0SqP.zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(resources, husniw3snxdgzpagjm.HJFh0TGMpafqLE9haL());
    }
}
