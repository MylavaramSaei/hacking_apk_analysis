package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.HJFh0TGMpafqLE9haL;
import hUNBy66ZO1wVLJGW3l.Z9WdNiOsPR0y54zHW4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public hUNBy66ZO1wVLJGW3l.s3fjYDxWOUexjjVgyA[] f3870Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL f3871HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final String f3872IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final String f3873KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final String f3874TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public byte[] f3875Z9WdNiOsPR0y54zHW4;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final File f3876husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final AssetManager f3877lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Executor f3879s3fjYDxWOUexjjVgyA;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public boolean f3878pbVGzGjWvY2LDXC8vo = false;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final byte[] f3880zZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0();

    public s3fjYDxWOUexjjVgyA(AssetManager assetManager, Executor executor, HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL, String str, String str2, String str3, File file) {
        this.f3877lEeR5KfoEr4xU5yHH7 = assetManager;
        this.f3879s3fjYDxWOUexjjVgyA = executor;
        this.f3871HJFh0TGMpafqLE9haL = interfaceC0048HJFh0TGMpafqLE9haL;
        this.f3873KYHag8HRDlnO3X9zmZ = str;
        this.f3874TCyPEKSzIyweCN5yp1 = str2;
        this.f3872IPyIQcaNa8aB7drBED = str3;
        this.f3876husNiw3snxdgZPAGJm = file;
    }

    public static boolean Z9WdNiOsPR0y54zHW4() {
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            return false;
        }
        if (i != 24 && i != 25) {
            switch (i) {
            }
            return false;
        }
        return true;
    }

    public static byte[] zZKhbgvUfsK4AEX3r0() {
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            return null;
        }
        switch (i) {
        }
        return null;
    }

    public final hUNBy66ZO1wVLJGW3l.s3fjYDxWOUexjjVgyA[] Acstmh57AKoSEkEFNJ(InputStream inputStream) throws IOException {
        try {
            try {
                try {
                    try {
                        hUNBy66ZO1wVLJGW3l.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArrLIMtzhnLwQyigzK0KO = Z9WdNiOsPR0y54zHW4.LIMtzhnLwQyigzK0KO(inputStream, Z9WdNiOsPR0y54zHW4.aPyGSIylzVNKPT1Bls(inputStream, Z9WdNiOsPR0y54zHW4.f5981lEeR5KfoEr4xU5yHH7), this.f3873KYHag8HRDlnO3X9zmZ);
                        try {
                            inputStream.close();
                            return s3fjydxwouexjjvgyaArrLIMtzhnLwQyigzK0KO;
                        } catch (IOException e) {
                            this.f3871HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(7, e);
                            return s3fjydxwouexjjvgyaArrLIMtzhnLwQyigzK0KO;
                        }
                    } catch (IOException e2) {
                        this.f3871HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(7, e2);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.f3871HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.f3871HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(7, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f3871HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(7, e5);
            }
            throw th;
        }
    }

    public final void HJFh0TGMpafqLE9haL() {
        if (!this.f3878pbVGzGjWvY2LDXC8vo) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public final InputStream IPyIQcaNa8aB7drBED(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3871HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(5, null);
            }
            return null;
        }
    }

    public final InputStream KYHag8HRDlnO3X9zmZ(AssetManager assetManager) {
        HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL;
        int i;
        try {
            return IPyIQcaNa8aB7drBED(assetManager, this.f3874TCyPEKSzIyweCN5yp1);
        } catch (FileNotFoundException e) {
            e = e;
            interfaceC0048HJFh0TGMpafqLE9haL = this.f3871HJFh0TGMpafqLE9haL;
            i = 6;
            interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, e);
            return null;
        } catch (IOException e2) {
            e = e2;
            interfaceC0048HJFh0TGMpafqLE9haL = this.f3871HJFh0TGMpafqLE9haL;
            i = 7;
            interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, e);
            return null;
        }
    }

    public s3fjYDxWOUexjjVgyA T9PhQIpGRhE4yZDm1C() throws IOException {
        HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL;
        int i;
        ByteArrayOutputStream byteArrayOutputStream;
        hUNBy66ZO1wVLJGW3l.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr = this.f3870Acstmh57AKoSEkEFNJ;
        byte[] bArr = this.f3880zZKhbgvUfsK4AEX3r0;
        if (s3fjydxwouexjjvgyaArr != null && bArr != null) {
            HJFh0TGMpafqLE9haL();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    Z9WdNiOsPR0y54zHW4.XzJ1BS7H9Ilbkv4eVM(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                interfaceC0048HJFh0TGMpafqLE9haL = this.f3871HJFh0TGMpafqLE9haL;
                i = 7;
                interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, e);
                this.f3870Acstmh57AKoSEkEFNJ = null;
                return this;
            } catch (IllegalStateException e2) {
                e = e2;
                interfaceC0048HJFh0TGMpafqLE9haL = this.f3871HJFh0TGMpafqLE9haL;
                i = 8;
                interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, e);
                this.f3870Acstmh57AKoSEkEFNJ = null;
                return this;
            }
            if (!Z9WdNiOsPR0y54zHW4.ao3wqKm5CXFuvC0q47(byteArrayOutputStream, bArr, s3fjydxwouexjjvgyaArr)) {
                this.f3871HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(5, null);
                this.f3870Acstmh57AKoSEkEFNJ = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f3875Z9WdNiOsPR0y54zHW4 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f3870Acstmh57AKoSEkEFNJ = null;
        }
        return this;
    }

    public final /* synthetic */ void TCyPEKSzIyweCN5yp1(int i, Object obj) {
        this.f3871HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, obj);
    }

    public final void e54J8UWNHWALQNixXM(final int i, final Object obj) {
        this.f3879s3fjYDxWOUexjjVgyA.execute(new Runnable() { // from class: hUNBy66ZO1wVLJGW3l.lEeR5KfoEr4xU5yHH7
            @Override // java.lang.Runnable
            public final void run() {
                this.f5991lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(i, obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean hoXrIDAFrSwfShk8da() {
        byte[] bArr = this.f3875Z9WdNiOsPR0y54zHW4;
        if (bArr == null) {
            return false;
        }
        HJFh0TGMpafqLE9haL();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f3876husNiw3snxdgZPAGJm);
                    try {
                        hUNBy66ZO1wVLJGW3l.HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(byteArrayInputStream, fileOutputStream);
                        e54J8UWNHWALQNixXM(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f3875Z9WdNiOsPR0y54zHW4 = null;
                this.f3870Acstmh57AKoSEkEFNJ = null;
            }
        } catch (FileNotFoundException e) {
            e54J8UWNHWALQNixXM(6, e);
            return false;
        } catch (IOException e2) {
            e54J8UWNHWALQNixXM(7, e2);
            return false;
        }
    }

    public boolean husNiw3snxdgZPAGJm() throws IOException {
        if (this.f3880zZKhbgvUfsK4AEX3r0 == null) {
            e54J8UWNHWALQNixXM(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f3876husNiw3snxdgZPAGJm.exists()) {
            try {
                this.f3876husNiw3snxdgZPAGJm.createNewFile();
            } catch (IOException unused) {
                e54J8UWNHWALQNixXM(4, null);
                return false;
            }
        } else if (!this.f3876husNiw3snxdgZPAGJm.canWrite()) {
            e54J8UWNHWALQNixXM(4, null);
            return false;
        }
        this.f3878pbVGzGjWvY2LDXC8vo = true;
        return true;
    }

    public s3fjYDxWOUexjjVgyA pbVGzGjWvY2LDXC8vo() {
        s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA2;
        HJFh0TGMpafqLE9haL();
        if (this.f3880zZKhbgvUfsK4AEX3r0 == null) {
            return this;
        }
        InputStream inputStreamKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(this.f3877lEeR5KfoEr4xU5yHH7);
        if (inputStreamKYHag8HRDlnO3X9zmZ != null) {
            this.f3870Acstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(inputStreamKYHag8HRDlnO3X9zmZ);
        }
        hUNBy66ZO1wVLJGW3l.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr = this.f3870Acstmh57AKoSEkEFNJ;
        return (s3fjydxwouexjjvgyaArr == null || !Z9WdNiOsPR0y54zHW4() || (s3fjYDxWOUexjjVgyA2 = s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgyaArr, this.f3880zZKhbgvUfsK4AEX3r0)) == null) ? this : s3fjYDxWOUexjjVgyA2;
    }

    public final s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA(hUNBy66ZO1wVLJGW3l.s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, byte[] bArr) throws IOException {
        HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL;
        int i;
        InputStream inputStreamIPyIQcaNa8aB7drBED;
        try {
            inputStreamIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(this.f3877lEeR5KfoEr4xU5yHH7, this.f3872IPyIQcaNa8aB7drBED);
        } catch (FileNotFoundException e) {
            e = e;
            interfaceC0048HJFh0TGMpafqLE9haL = this.f3871HJFh0TGMpafqLE9haL;
            i = 9;
            interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, e);
            return null;
        } catch (IOException e2) {
            e = e2;
            interfaceC0048HJFh0TGMpafqLE9haL = this.f3871HJFh0TGMpafqLE9haL;
            i = 7;
            interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, e);
            return null;
        } catch (IllegalStateException e3) {
            e = e3;
            this.f3870Acstmh57AKoSEkEFNJ = null;
            interfaceC0048HJFh0TGMpafqLE9haL = this.f3871HJFh0TGMpafqLE9haL;
            i = 8;
            interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, e);
            return null;
        }
        if (inputStreamIPyIQcaNa8aB7drBED == null) {
            if (inputStreamIPyIQcaNa8aB7drBED != null) {
                inputStreamIPyIQcaNa8aB7drBED.close();
            }
            return null;
        }
        try {
            this.f3870Acstmh57AKoSEkEFNJ = Z9WdNiOsPR0y54zHW4.zaq8hOURtfwbcX17cG(inputStreamIPyIQcaNa8aB7drBED, Z9WdNiOsPR0y54zHW4.aPyGSIylzVNKPT1Bls(inputStreamIPyIQcaNa8aB7drBED, Z9WdNiOsPR0y54zHW4.f5982s3fjYDxWOUexjjVgyA), bArr, s3fjydxwouexjjvgyaArr);
            inputStreamIPyIQcaNa8aB7drBED.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamIPyIQcaNa8aB7drBED.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
