package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final InterfaceC0048HJFh0TGMpafqLE9haL f3867lEeR5KfoEr4xU5yHH7 = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final InterfaceC0048HJFh0TGMpafqLE9haL f3868s3fjYDxWOUexjjVgyA = new s3fjYDxWOUexjjVgyA();

    /* renamed from: androidx.profileinstaller.HJFh0TGMpafqLE9haL$HJFh0TGMpafqLE9haL, reason: collision with other inner class name */
    public interface InterfaceC0048HJFh0TGMpafqLE9haL {
        void lEeR5KfoEr4xU5yHH7(int i, Object obj);

        void s3fjYDxWOUexjjVgyA(int i, Object obj);
    }

    public class lEeR5KfoEr4xU5yHH7 implements InterfaceC0048HJFh0TGMpafqLE9haL {
        @Override // androidx.profileinstaller.HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL
        public void lEeR5KfoEr4xU5yHH7(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL
        public void s3fjYDxWOUexjjVgyA(int i, Object obj) {
        }
    }

    public class s3fjYDxWOUexjjVgyA implements InterfaceC0048HJFh0TGMpafqLE9haL {
        @Override // androidx.profileinstaller.HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL
        public void lEeR5KfoEr4xU5yHH7(int i, Object obj) {
            Log.d("ProfileInstaller", i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override // androidx.profileinstaller.HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL
        public void s3fjYDxWOUexjjVgyA(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    public static void Acstmh57AKoSEkEFNJ(Context context, Executor executor, InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL) throws PackageManager.NameNotFoundException {
        Z9WdNiOsPR0y54zHW4(context, executor, interfaceC0048HJFh0TGMpafqLE9haL, false);
    }

    public static void HJFh0TGMpafqLE9haL(Context context, Executor executor, InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL) {
        s3fjYDxWOUexjjVgyA(context.getFilesDir());
        TCyPEKSzIyweCN5yp1(executor, interfaceC0048HJFh0TGMpafqLE9haL, 11, null);
    }

    public static boolean IPyIQcaNa8aB7drBED(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL) throws IOException {
        androidx.profileinstaller.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new androidx.profileinstaller.s3fjYDxWOUexjjVgyA(assetManager, executor, interfaceC0048HJFh0TGMpafqLE9haL, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm()) {
            return false;
        }
        boolean zHoXrIDAFrSwfShk8da = s3fjydxwouexjjvgya.pbVGzGjWvY2LDXC8vo().T9PhQIpGRhE4yZDm1C().hoXrIDAFrSwfShk8da();
        if (zHoXrIDAFrSwfShk8da) {
            KYHag8HRDlnO3X9zmZ(packageInfo, file);
        }
        return zHoXrIDAFrSwfShk8da;
    }

    public static void KYHag8HRDlnO3X9zmZ(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void TCyPEKSzIyweCN5yp1(Executor executor, final InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: hUNBy66ZO1wVLJGW3l.KYHag8HRDlnO3X9zmZ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, obj);
            }
        });
    }

    public static void Z9WdNiOsPR0y54zHW4(Context context, Executor executor, InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL, boolean z) throws PackageManager.NameNotFoundException {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z || !zZKhbgvUfsK4AEX3r0(packageInfo, filesDir, interfaceC0048HJFh0TGMpafqLE9haL)) {
                Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
                if (IPyIQcaNa8aB7drBED(assets, packageName, packageInfo, filesDir, name, executor, interfaceC0048HJFh0TGMpafqLE9haL) && z) {
                    z2 = true;
                }
            } else {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
            }
            zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(context, z2);
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(7, e);
            zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL(context, false);
        }
    }

    public static void e54J8UWNHWALQNixXM(Context context, Executor executor, InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL) throws PackageManager.NameNotFoundException, IOException {
        try {
            KYHag8HRDlnO3X9zmZ(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            TCyPEKSzIyweCN5yp1(executor, interfaceC0048HJFh0TGMpafqLE9haL, 10, null);
        } catch (PackageManager.NameNotFoundException e) {
            TCyPEKSzIyweCN5yp1(executor, interfaceC0048HJFh0TGMpafqLE9haL, 7, e);
        }
    }

    public static void pbVGzGjWvY2LDXC8vo(Context context) throws PackageManager.NameNotFoundException {
        Acstmh57AKoSEkEFNJ(context, new husNiw3snxdgZPAGJm(), f3867lEeR5KfoEr4xU5yHH7);
    }

    public static boolean s3fjYDxWOUexjjVgyA(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static boolean zZKhbgvUfsK4AEX3r0(PackageInfo packageInfo, File file, InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL) throws IOException {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = j == packageInfo.lastUpdateTime;
                if (z) {
                    interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(2, null);
                }
                return z;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
