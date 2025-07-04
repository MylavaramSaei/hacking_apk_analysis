package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class zZKhbgvUfsK4AEX3r0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL f3882lEeR5KfoEr4xU5yHH7 = e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL.sTkWmhpZ5b1ArQIw4K();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final Object f3883s3fjYDxWOUexjjVgyA = new Object();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static HJFh0TGMpafqLE9haL f3881HJFh0TGMpafqLE9haL = null;

    public static class HJFh0TGMpafqLE9haL {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final boolean f3884HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final int f3885lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final boolean f3886s3fjYDxWOUexjjVgyA;

        public HJFh0TGMpafqLE9haL(int i, boolean z, boolean z2) {
            this.f3885lEeR5KfoEr4xU5yHH7 = i;
            this.f3884HJFh0TGMpafqLE9haL = z2;
            this.f3886s3fjYDxWOUexjjVgyA = z;
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {
        public static PackageInfo lEeR5KfoEr4xU5yHH7(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class s3fjYDxWOUexjjVgyA {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final long f3887HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final int f3888lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final int f3889s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final long f3890zZKhbgvUfsK4AEX3r0;

        public s3fjYDxWOUexjjVgyA(int i, int i2, long j, long j2) {
            this.f3888lEeR5KfoEr4xU5yHH7 = i;
            this.f3889s3fjYDxWOUexjjVgyA = i2;
            this.f3887HJFh0TGMpafqLE9haL = j;
            this.f3890zZKhbgvUfsK4AEX3r0 = j2;
        }

        public static s3fjYDxWOUexjjVgyA lEeR5KfoEr4xU5yHH7(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return s3fjydxwouexjjvgya;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof s3fjYDxWOUexjjVgyA)) {
                return false;
            }
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) obj;
            return this.f3889s3fjYDxWOUexjjVgyA == s3fjydxwouexjjvgya.f3889s3fjYDxWOUexjjVgyA && this.f3887HJFh0TGMpafqLE9haL == s3fjydxwouexjjvgya.f3887HJFh0TGMpafqLE9haL && this.f3888lEeR5KfoEr4xU5yHH7 == s3fjydxwouexjjvgya.f3888lEeR5KfoEr4xU5yHH7 && this.f3890zZKhbgvUfsK4AEX3r0 == s3fjydxwouexjjvgya.f3890zZKhbgvUfsK4AEX3r0;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3889s3fjYDxWOUexjjVgyA), Long.valueOf(this.f3887HJFh0TGMpafqLE9haL), Integer.valueOf(this.f3888lEeR5KfoEr4xU5yHH7), Long.valueOf(this.f3890zZKhbgvUfsK4AEX3r0));
        }

        public void s3fjYDxWOUexjjVgyA(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3888lEeR5KfoEr4xU5yHH7);
                dataOutputStream.writeInt(this.f3889s3fjYDxWOUexjjVgyA);
                dataOutputStream.writeLong(this.f3887HJFh0TGMpafqLE9haL);
                dataOutputStream.writeLong(this.f3890zZKhbgvUfsK4AEX3r0);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(Context context, boolean z) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7;
        int i;
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL;
        if (!z && (hJFh0TGMpafqLE9haL = f3881HJFh0TGMpafqLE9haL) != null) {
            return hJFh0TGMpafqLE9haL;
        }
        synchronized (f3883s3fjYDxWOUexjjVgyA) {
            if (!z) {
                try {
                    HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = f3881HJFh0TGMpafqLE9haL;
                    if (hJFh0TGMpafqLE9haL2 != null) {
                        return hJFh0TGMpafqLE9haL2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            if (i2 >= 28 && i2 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z2 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z3 = file2.exists() && length2 > 0;
                try {
                    long jLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 = s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(file3);
                        } catch (IOException unused) {
                            return s3fjYDxWOUexjjVgyA(131072, z2, z3);
                        }
                    } else {
                        s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 = null;
                    }
                    if (s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 != null && s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.f3887HJFh0TGMpafqLE9haL == jLEeR5KfoEr4xU5yHH7 && (i = s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.f3889s3fjYDxWOUexjjVgyA) != 2) {
                        i3 = i;
                    } else if (z2) {
                        i3 = 1;
                    } else if (z3) {
                        i3 = 2;
                    }
                    if (z && z3 && i3 != 1) {
                        i3 = 2;
                    }
                    if (s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 != null && s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.f3889s3fjYDxWOUexjjVgyA == 2 && i3 == 1 && length < s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.f3890zZKhbgvUfsK4AEX3r0) {
                        i3 = 3;
                    }
                    s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA(1, i3, jLEeR5KfoEr4xU5yHH7, length2);
                    if (s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7 == null || !s3fjydxwouexjjvgyaLEeR5KfoEr4xU5yHH7.equals(s3fjydxwouexjjvgya)) {
                        try {
                            s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA(file3);
                        } catch (IOException unused2) {
                            i3 = 196608;
                        }
                    }
                    return s3fjYDxWOUexjjVgyA(i3, z2, z3);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return s3fjYDxWOUexjjVgyA(65536, z2, z3);
                }
            }
            return s3fjYDxWOUexjjVgyA(262144, false, false);
        }
    }

    public static long lEeR5KfoEr4xU5yHH7(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    public static HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA(int i, boolean z, boolean z2) {
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new HJFh0TGMpafqLE9haL(i, z, z2);
        f3881HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL;
        f3882lEeR5KfoEr4xU5yHH7.hoXrIDAFrSwfShk8da(hJFh0TGMpafqLE9haL);
        return f3881HJFh0TGMpafqLE9haL;
    }
}
